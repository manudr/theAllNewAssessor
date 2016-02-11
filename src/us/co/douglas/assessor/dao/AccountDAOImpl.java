package us.co.douglas.assessor.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.model.*;
import us.co.douglas.assessor.util.Util;
import us.co.douglas.common.sql.JDBCHelper;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */

public class AccountDAOImpl implements AccountDAO {
    private static Log log = LogFactory.getLog(AccountDAOImpl.class);
    public static int maxResults = 1000;

    public List<Account> getAllAccounts() {
        log.info("getAllAccounts...");
        List<Account> accounts = new ArrayList<Account>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();
            String sql = "select acct.* from encompass.tblacct acct " +
                    "join encompass.tblappealacct applacct on applacct.ACCOUNTNO = acct.ACCOUNTNO " +
                    "join encompass.tblappeal appl on appl.appealno = applacct.appealno " +
                    "where acct.verend = 99999999999 " +
                    "and appl.verend = 99999999999 " +
                    "and applacct.verend = 99999999999 " +
                    "and appl.taxyear = ? " +
                    "and applacct.taxyear = ? " +
                    "order by acct.ACCOUNTNO asc";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, Util.getTaxYear());
            JDBCHelper.setString(ps, 2, Util.getTaxYear());
            rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountNo(JDBCHelper.getString(rs, "ACCOUNTNO"));
                account.setParcelNo(JDBCHelper.getString(rs, "PARCELNO"));
                account.setAcctType(JDBCHelper.getString(rs, "ACCTTYPE"));
                account.setValueAreaCode(JDBCHelper.getString(rs, "VALUEAREACODE"));
                account.setEconomicAreaCode(JDBCHelper.getString(rs, "ECONOMICAREACODE"));
                account.setPropertyIdentifier(JDBCHelper.getString(rs, "PROPERTYIDENTIFIER"));
                account.setPrimaryUseCode(JDBCHelper.getString(rs, "PRIMARYUSECODE"));
                account.setStrippedAccountNo(JDBCHelper.getString(rs, "STRIPPEDACCOUNTNO"));
                account.setJurisdictionId(JDBCHelper.getString(rs, "JURISDICTIONID"));
                account.setMobileHomeSpace(JDBCHelper.getString(rs, "MOBILEHOMESPACE"));
                account.seteFileFlag(JDBCHelper.getString(rs, "EFILEFLAG"));
                account.setPropertyClassId(JDBCHelper.getString(rs, "PROPERTYCLASSID"));
                account.setAppraisalType(JDBCHelper.getString(rs, "APPRAISALTYPE"));
                account.setAcctStatusCode(JDBCHelper.getString(rs, "ACCTSTATUSCODE"));
                account.setAssignedTo(JDBCHelper.getString(rs, "ASSIGNEDTO"));
                account.setBusinessLicense(JDBCHelper.getString(rs, "BUSINESSLICENSE"));
                account.setBusinessName(JDBCHelper.getString(rs, "BUSINESSNAME"));
                account.setDefaultApproachType(JDBCHelper.getString(rs, "DEFAULTAPPROACHTYPE"));
                account.setDefaultTaxDistrict(JDBCHelper.getString(rs, "DEFAULTTAXDISTRICT"));
                account.setWard(JDBCHelper.getString(rs, "WARD"));
                accounts.add(account);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }
        return accounts;
    }

    public List<String> getAllPropertyAddresses() {
        log.info("getAllPropertyAddresses...");
        List<String> allPropertyAddresses = new ArrayList<String>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("select " +
                    "ISNULL(TBLACCT.ACCOUNTNO, '') + " +
                    "' ' + ISNULL(TBLACCT.PARCELNO, '') + " +
                    "' ' + ISNULL(TBLACCT.BUSINESSNAME, '') + " +
                    "' ' + ISNULL(TBLACCT.BUSINESSLICENSE, '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + " +
                    "' ' + ISNULL(SUBSTRING(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, 1, 5), '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') " +
                    "from " +
                    "encompass.TBLACCT TBLACCT " +
                    "join encompass.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "where TBLACCT.verend = 99999999999 and TBLACCTPROPERTYADDRESS.verend = 99999999999 order by TBLACCT.ACCOUNTNO desc ");
            query.setMaxResults(maxResults);
            allPropertyAddresses = query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allPropertyAddresses;
    }

    public List<NeighborhoodSale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) {
        log.info("getAllSalesByZip...");
        List<NeighborhoodSale> allSalesByZip = new ArrayList<NeighborhoodSale>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT DISTINCT TBLSALE.RECEPTIONNO AS RECEPTIONNO, " +
                    "TBLSALE.SALEDATE AS SALEDATE, " +
                    "TBLSALE.GRANTOR AS GRANTOR, " +
                    "TBLSALE.GRANTEE AS GRANTEE, " +
                    "TBLSALE.SALEPRICE AS SALEPRICE, " +
                    "TBLSALE.PPADJAMOUNT AS PPADJAMOUNT, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') as propertyStreet, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') as propertyCity, + " +
                    "'CO' as propertyState, + " +
                    "ISNULL(SUBSTRING(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, 1, 5), '') AS propertyZipCode, " +
                    "TBLSALE.GOODWILLADJAMOUNT AS GOODWILLADJAMOUNT, " +
                    "TBLSALE.DOCUMENTDATE AS DOCUMENTDATE, " +
                    "TBLSALE.OTHERADJAMOUNT AS OTHERADJAMOUNT, " +
                    "TBLSALE.TIMEADJ AS TIMEADJ, " +
                    "TBLSALE.JURISDICTIONID AS JURISDICTIONID, " +
                    "TBLSALEACCT.ACCOUNTNO AS ACCOUNTNO, " +
                    "TBLSALEACCT.INVENTORYEFFECTIVEDATE AS INVENTORYEFFECTIVEDATE, " +
                    "TBLSALEACCT.ACCTADJSALEPRICE AS ACCTADJSALEPRICE, " +
                    "0 AS TIMEADJUSTEDSALEPRICE, " +
                    "ISNULL(TBLACCTNBHD.NBHDCODE, '') AS NEIGHBORHOOD, + " +
                    "ISNULL(TBLACCTNBHD.NBHDEXTENSION, '') AS NEIGHBORHOODEXT, " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') AS SUBDIVISION " +
                    "FROM ENCOMPASS.TBLSALEACCT TBLSALEACCT " +
                    "INNER JOIN ENCOMPASS.TBLSALE TBLSALE ON TBLSALE.RECEPTIONNO = TBLSALEACCT.RECEPTIONNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS ON TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTNBHD TBLACCTNBHD ON TBLACCTNBHD.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLSUBACCOUNT TBLSUBACCOUNT ON TBLSUBACCOUNT.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBNSUBDIVISION TBNSUBDIVISION ON TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "INNER JOIN (" +
                    "    SELECT TBLSALEACCT.ACCOUNTNO, MAX(TBLSALEACCT.INVENTORYEFFECTIVEDATE) AS MAXDATE " +
                    "    FROM ENCOMPASS.TBLSALEACCT " +
                    "    GROUP BY TBLSALEACCT.ACCOUNTNO " +
                    ") TM ON TBLSALEACCT.ACCOUNTNO = TM.ACCOUNTNO AND TBLSALEACCT.INVENTORYEFFECTIVEDATE = TM.MAXDATE " +
                    "WHERE TBLSALEACCT.VEREND = 99999999999 " +
                    "AND TBLACCTNBHD.VEREND = 99999999999 " +
                    "AND TBLSUBACCOUNT.VEREND = 99999999999 " +
                    "AND TBLSALE.VEREND = 99999999999 " +
                    "AND TBLACCTNBHD.NBHDCODE  LIKE '%" + neighborhood + "%' " +
                    "AND TBNSUBDIVISION.SUBNAME  LIKE '%" + subdivision + "%' " +
                    "AND TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE LIKE '%" + zipCode + "%' " +
                    "ORDER BY SALEDATE DESC", NeighborhoodSale.class);
            query.setMaxResults(maxResults);
            allSalesByZip = query.getResultList();
            log.info("allSalesByZip.size(): " + allSalesByZip.size());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allSalesByZip;
    }


    public List<NeighborhoodSale> getAllNeighborhoodSales() {
        log.info("getNeighborhoodSales...");
        List<NeighborhoodSale> allNeighborhoodSales = new ArrayList<NeighborhoodSale>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT DISTINCT TBLSALE.RECEPTIONNO AS RECEPTIONNO, " +
                    "TBLSALE.SALEDATE AS SALEDATE, " +
                    "TBLSALE.GRANTOR AS GRANTOR, " +
                    "TBLSALE.GRANTEE AS GRANTEE, " +
                    "TBLSALE.SALEPRICE AS SALEPRICE, " +
                    "TBLSALE.PPADJAMOUNT AS PPADJAMOUNT, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') as propertyStreet, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') as propertyCity, + " +
                    "'CO' as propertyState, + " +
                    "ISNULL(SUBSTRING(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, 1, 5), '') AS propertyZipCode, " +
                    "TBLSALE.GOODWILLADJAMOUNT AS GOODWILLADJAMOUNT, " +
                    "TBLSALE.DOCUMENTDATE AS DOCUMENTDATE, " +
                    "TBLSALE.OTHERADJAMOUNT AS OTHERADJAMOUNT, " +
                    "TBLSALE.TIMEADJ AS TIMEADJ, " +
                    "TBLSALE.JURISDICTIONID AS JURISDICTIONID, " +
                    "TBLSALEACCT.ACCOUNTNO AS ACCOUNTNO, " +
                    "TBLSALEACCT.INVENTORYEFFECTIVEDATE AS INVENTORYEFFECTIVEDATE, " +
                    "TBLSALEACCT.ACCTADJSALEPRICE AS ACCTADJSALEPRICE, " +
                    "0 AS TIMEADJUSTEDSALEPRICE, " +
                    "ISNULL(TBLACCTNBHD.NBHDCODE, '') AS NEIGHBORHOOD, + " +
                    "ISNULL(TBLACCTNBHD.NBHDEXTENSION, '') AS NEIGHBORHOODEXT, " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') AS SUBDIVISION " +
                    "FROM ENCOMPASS.TBLSALEACCT TBLSALEACCT " +
                    "INNER JOIN ENCOMPASS.TBLSALE TBLSALE ON TBLSALE.RECEPTIONNO = TBLSALEACCT.RECEPTIONNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS ON TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTNBHD TBLACCTNBHD ON TBLACCTNBHD.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLSUBACCOUNT TBLSUBACCOUNT ON TBLSUBACCOUNT.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBNSUBDIVISION TBNSUBDIVISION ON TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "INNER JOIN (" +
                    "    SELECT TBLSALEACCT.ACCOUNTNO, MAX(TBLSALEACCT.INVENTORYEFFECTIVEDATE) AS MAXDATE " +
                    "    FROM ENCOMPASS.TBLSALEACCT " +
                    "    GROUP BY TBLSALEACCT.ACCOUNTNO " +
                    ") TM ON TBLSALEACCT.ACCOUNTNO = TM.ACCOUNTNO AND TBLSALEACCT.INVENTORYEFFECTIVEDATE = TM.MAXDATE " +
                    "WHERE TBLSALEACCT.VEREND = 99999999999 " +
                    "AND TBLACCTNBHD.VEREND = 99999999999 " +
                    "AND TBLSUBACCOUNT.VEREND = 99999999999 " +
                    "AND TBLSALE.VEREND = 99999999999 " +
                    "ORDER BY SALEDATE DESC", NeighborhoodSale.class);
            //query.setMaxResults(maxResults);
            allNeighborhoodSales = query.getResultList();
            log.info("allNeighborhoodSales.size(): " + allNeighborhoodSales.size());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allNeighborhoodSales;
    }

    public List<String> getAllSearchableStrings() {
        log.info("getAllSearchableStrings...");
        List<String> allSearchableStrings = new ArrayList<String>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("select " +
                    "ISNULL(TBLACCT.ACCOUNTNO, '') + ':' + " +
                    "ISNULL(TBLACCT.PARCELNO, '') + ':' + " +
                    "ISNULL(TBLPERSONSECURE.NAME1, '') + ' ' + ISNULL(TBLPERSONSECURE.NAME2, '') + ':' + " +
                    "ISNULL(TBLACCT.BUSINESSNAME, '') + ':' + " +
                    "ISNULL(TBLACCT.BUSINESSLICENSE, '') + ':' + " +
                    "ISNULL(TBLACCTNBHD.NBHDCODE, '') + ':' + " +
                    "ISNULL(TBLACCTNBHD.NBHDEXTENSION, '') + ':' + " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ':' + " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') + ':' + " +
                    "ISNULL(SUBSTRING(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, 1, 5), '') + ':' + " +
                    "ISNULL(TBLADDRESSSECURE.ADDRESS1, '') + ' ' + ISNULL(TBLADDRESSSECURE.ADDRESS2, '') + ':' + " +
                    "ISNULL(TBLADDRESSSECURE.CITY, '') + ':' + " +
                    "ISNULL(TBLADDRESSSECURE.STATECODE, '') + ':' + " +
                    "ISNULL(TBLADDRESSSECURE.ZIPCODE, '') + ':' + " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') " +
                    "from encompass.TBLACCT TBLACCT " +
                    "right outer join encompass.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "right outer join encompass.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS on TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "right outer join encompass.TBLPERSONSECURE TBLPERSONSECURE on TBLPERSONSECURE.PERSONCODE = TBLACCTOWNERADDRESS.PERSONCODE " +
                    "right outer join encompass.TBLADDRESSSECURE TBLADDRESSSECURE on TBLADDRESSSECURE.ADDRESSCODE = TBLACCTOWNERADDRESS.ADDRESSCODE " +
                    "right outer join encompass.TBLACCTNBHD TBLACCTNBHD on TBLACCTNBHD.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "right outer join encompass.TBLACCTLEGAL TBLACCTLEGAL on TBLACCTLEGAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "right outer join encompass.TBLSUBACCOUNT TBLSUBACCOUNT on TBLSUBACCOUNT.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "right outer join encompass.TBNSUBDIVISION TBNSUBDIVISION on TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "where TBLACCT.verend = 99999999999 " +
                    "and TBLADDRESSSECURE.verend = 99999999999 " +
                    "and TBLPERSONSECURE.verend = 99999999999 " +
                    "and TBLACCTOWNERADDRESS.verend = 99999999999 " +
                    "and TBLACCTPROPERTYADDRESS.verend = 99999999999 " +
                    "and TBLACCTNBHD.verend = 99999999999 " +
                    "and TBLACCTLEGAL.verend = 99999999999 " +
                    "and TBLSUBACCOUNT.verend = 99999999999 " +
                    "order by TBLACCT.ACCOUNTNO desc, TBLACCT.PARCELNO desc");
            //query.setMaxResults(maxResults); //TODO This should pull all of them
            allSearchableStrings = query.getResultList();
            log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allSearchableStrings;
    }

    public Parcel getParcel(String accountNo) {
        log.info("getParcel()...");
        Parcel parcel = new Parcel();
        parcel.setAccount(getAccount(accountNo));
        parcel.setPropertyAddress(getPropertyAddress(accountNo));
        parcel.setOwnerAddress(getOwnerAddress(accountNo));
        parcel.setAppeal(getAppeal(accountNo));
        parcel.setSale(getSale(accountNo));
        return parcel;
    }

    public OwnerAddress getOwnerAddress(String accountNo) {
        log.info("getOwnerAddress()...");
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT DISTINCT " +
                    "TBLACCT.ACCOUNTNO, " +
                    "(ISNULL(TBLADDRESSSECURE.ADDRESS1, '') + ISNULL(TBLADDRESSSECURE.ADDRESS2, '')) AS streetAddress, " +
                    "ISNULL(TBLADDRESSSECURE.CITY, '')  AS cityName, " +
                    "ISNULL(TBLADDRESSSECURE.STATECODE, '')  AS stateName, " +
                    "ISNULL(SUBSTRING(TBLADDRESSSECURE.ZIPCODE, 1, 5), '')  AS ZIPCODE " +
                    "FROM " +
                    "ENCOMPASS.TBLACCT TBLACCT " +
                    "join encompass.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS on TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLADDRESSSECURE TBLADDRESSSECURE on TBLADDRESSSECURE.ADDRESSCODE = TBLACCTOWNERADDRESS.ADDRESSCODE " +
                    "WHERE TBLACCT.VEREND = 99999999999 " +
                    "AND TBLACCTOWNERADDRESS.VEREND = 99999999999 " +
                    "AND TBLADDRESSSECURE.VEREND = 99999999999" +
                    "AND TBLACCT.ACCOUNTNO = :accountNo ", OwnerAddress.class);
            query.setMaxResults(maxResults);
            query.setParameter("accountNo", accountNo);
            List<OwnerAddress> addressList = query.getResultList();
            if (addressList.size() > 0) {
                return addressList.get(0);
            } else {
                return null;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
    }

    public PropertyAddress getPropertyAddress(String accountNo) {
        log.info("getPropertyAddress()...");
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT " +
                    "TBLACCT.ACCOUNTNO, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PREDIRECTION, '') AS PREDIRECTION, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.POSTDIRECTION, '') AS POSTDIRECTION, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') AS STREETNUMBER, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') AS UNITNAME, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') AS STREETTYPE, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') AS STREETNAME, " +
                    "ISNULL(SUBSTRING(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, 1, 5), '')  AS ZIPCODE, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '')  AS CITYNAME, " +
                    "'CO' AS STATENAME " +
                    "FROM " +
                    "ENCOMPASS.TBLACCT TBLACCT " +
                    "JOIN ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS ON TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "WHERE TBLACCT.VEREND = 99999999999 AND TBLACCTPROPERTYADDRESS.VEREND = 99999999999 " +
                    "AND TBLACCT.ACCOUNTNO = :accountNo " +
                    "ORDER BY TBLACCT.ACCOUNTNO DESC", PropertyAddress.class);
            query.setMaxResults(maxResults);
            query.setParameter("accountNo", accountNo);
            List<PropertyAddress> addressList = query.getResultList();
            if (addressList.size() > 0) {
                return addressList.get(0);
            } else {
                return null;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
    }

    public Account getAccount(String accountNo) {
        log.info("getAccount()...");
        EntityManager entityManager = getEntityManager();
        try {
            String sqlQuery = "SELECT DISTINCT " +
                    "TBLACCT.ACCOUNTNO AS ACCOUNTNO, " +
                    "TBLACCT.PARCELNO AS PARCELNO, " +
                    "TBLACCT.ACCTSTATUSCODE AS ACCTSTATUSCODE, " +
                    "TBLACCT.ACCTTYPE AS ACCTTYPE, " +
                    "TBLACCT.EFILEFLAG AS EFILEFLAG, " +
                    "TBLACCT.WARD AS WARD, " +
                    "TBLACCT.PROPERTYIDENTIFIER AS PROPERTYIDENTIFIER, " +
                    "TBLACCT.STRIPPEDACCOUNTNO AS STRIPPEDACCOUNTNO, " +
                    "TBLACCT.DEFAULTAPPROACHTYPE AS DEFAULTAPPROACHTYPE, " +
                    "TBLACCT.MOBILEHOMESPACE AS MOBILEHOMESPACE, " +
                    "TBLACCT.ASSIGNEDTO AS ASSIGNEDTO, " +
                    "TBLACCT.DEFAULTTAXDISTRICT AS DEFAULTTAXDISTRICT, " +
                    "TBLACCT.VALUEAREACODE AS VALUEAREACODE, " +
                    "TBLACCT.ASSOCIATEDACCT AS ASSOCIATEDACCT," +
                    "TBLACCT.APPRAISALTYPE AS APPRAISALTYPE, " +
                    "TBLACCT.ECONOMICAREACODE AS ECONOMICAREACODE, " +
                    "TBLACCT.ACCTDATECREATED AS ACCTDATECREATED, " +
                    "TBLACCT.BUSINESSLICENSE AS BUSINESSLICENSE, " +
                    "TBLACCT.PRIMARYUSECODE AS PRIMARYUSECODE, " +
                    "TBLACCT.JURISDICTIONID AS JURISDICTIONID, " +
                    "TBLACCT.BUSINESSNAME AS BUSINESSNAME, " +
                    "TBLACCT.PROPERTYCLASSID AS PROPERTYCLASSID," +
                    "TBLACCTLEGAL.LEGAL AS LEGAL, " +
                    "TBLACCTLEGAL.SHORTDESCRIPTION AS LEGALSHORTDESCRIPTION, " +
                    "TBLACCTLEGALLOCATION.QTR AS QTR, " +
                    "TBLACCTLEGALLOCATION.SECTION AS SECTION, " +
                    "TBLACCTLEGALLOCATION.TOWNSHIP AS TOWNSHIP, " +
                    "TBLACCTLEGALLOCATION.RANGE AS RANGE, " +
                    "TBLACCTNBHD.NBHDCODE AS NBHDCODE, " +
                    "TBLACCTNBHD.NBHDEXTENSION AS NBHDEXTENSION, " +
                    "TBLACCTNBHD.PROPERTYTYPE AS PROPERTYTYPE, " +
                    "TBLACCTREAL.IMPONLYFLAG AS IMPONLYFLAG, " +
                    "TBLACCTREAL.TIFFLAG AS TIFFLAG, " +
                    "TBLACCTREAL.VACANTFLAG AS VACANTFLAG, " +
                    "TBLACCTREAL.PARKINGSPACES AS PARKINGSPACES, " +
                    "TBLACCTREAL.ZONINGCODE AS ZONINGCODE, " +
                    "TBLACCTREAL.LANDWIDTH AS LANDWIDTH, " +
                    "TBLACCTREAL.LANDDEPTH AS LANDDEPTH, " +
                    "TBLACCTREAL.LANDEXCESSSF AS LANDEXCESSSF, " +
                    "TBLACCTREAL.LANDGROSSSF AS LANDGROSSSF, " +
                    "TBLACCTREAL.LANDGROSSACRES AS LANDGROSSACRES, " +
                    "TBLACCTREAL.DEFAULTLEA AS DEFAULTLEA, " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') AS SUBDIVISIONNAME " +
                    "FROM ENCOMPASS.TBLACCT TBLACCT " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTLEGAL TBLACCTLEGAL ON  TBLACCTLEGAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTLEGALLOCATION TBLACCTLEGALLOCATION ON TBLACCTLEGALLOCATION.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTNBHD TBLACCTNBHD ON TBLACCTNBHD.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS ON TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTMAILADDRESS TBLACCTMAILADDRESS ON TBLACCTMAILADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS ON TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLACCTREAL TBLACCTREAL ON TBLACCTREAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLADDRESSSECURE TBLADDRESSSECURE ON TBLADDRESSSECURE.ADDRESSCODE = TBLACCTOWNERADDRESS.ADDRESSCODE " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLPERSONSECURE TBLPERSONSECURE ON TBLPERSONSECURE.PERSONCODE = TBLACCTOWNERADDRESS.PERSONCODE " +
                    "LEFT OUTER JOIN ENCOMPASS.TBLSUBACCOUNT TBLSUBACCOUNT ON TBLSUBACCOUNT.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "LEFT OUTER JOIN ENCOMPASS.TBNSUBDIVISION TBNSUBDIVISION ON TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "WHERE " +
                    "TBLACCT.VEREND = 99999999999 " +
                    "AND TBLACCTLEGAL.VEREND = 99999999999 " +
                    "AND TBLACCTLEGALLOCATION.VEREND = 99999999999 " +
                    "AND TBLACCTNBHD.VEREND = 99999999999 " +
                    "AND TBLACCTOWNERADDRESS.VEREND = 99999999999 " +
                    "AND TBLACCTPROPERTYADDRESS.VEREND = 99999999999 " +
                    "AND TBLACCTREAL.VEREND = 99999999999 " +
                    "AND TBLADDRESSSECURE.VEREND = 99999999999 " +
                    "AND TBLSUBACCOUNT.VEREND = 99999999999 " +
                    "AND TBLPERSONSECURE.VEREND = 99999999999 " +
                    "AND TBLACCT.ACCOUNTNO = :accountNo ";
            Query query = entityManager.createNativeQuery(sqlQuery, Account.class);
            query.setMaxResults(maxResults);
            query.setParameter("accountNo", accountNo);
            List<Account> accountList = query.getResultList();
            if (accountList.size() > 0) {
                return accountList.get(0);
            } else {
                return null;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
    }

    public Appeal getAppeal(String accountNo) {
        log.info("getAppealByAccountNo...");
        Appeal appeal = new Appeal();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();
            String sql = "select TBLAPPEAL.* from encompass.TBLAPPEAL TBLAPPEAL " +
                    "join encompass.TBLAPPEALACCT on TBLAPPEALACCT.APPEALNO = TBLAPPEAL.APPEALNO " +
                    "where TBLAPPEALACCT.ACCOUNTNO = ? " +
                    "and TBLAPPEALACCT.verend = 99999999999 " +
                    "and TBLAPPEAL.verend = 99999999999 " +
                    "and TBLAPPEAL.taxyear = ?";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, accountNo);
            JDBCHelper.setString(ps, 2, Util.getTaxYear());
            rs = ps.executeQuery();
            while (rs.next()) {
                appeal.setAppealNo(JDBCHelper.getString(rs, "APPEALNO"));
                appeal.setTaxYear(JDBCHelper.getString(rs, "TAXYEAR"));
                appeal.setAppealType(JDBCHelper.getString(rs, "APPEALTYPE"));
                appeal.setAppealMethod(JDBCHelper.getString(rs, "APPEALMETHOD"));
                appeal.setAssignedTo(JDBCHelper.getString(rs, "ASSIGNEDTO"));
                appeal.setInitiatedBy(JDBCHelper.getString(rs, "INITIATEDBY"));
                appeal.setAgentCode(JDBCHelper.getString(rs, "AGENTCODE"));
                appeal.setMailTo(JDBCHelper.getString(rs, "MAILTO"));
                appeal.setDecisionBy(JDBCHelper.getString(rs, "DECISIONBY"));
                appeal.setCaseNo(JDBCHelper.getString(rs, "CASENO"));
                appeal.setReReviewStatus(JDBCHelper.getString(rs, "REREVIEWSTATUS"));
                appeal.setReReviewInitials(JDBCHelper.getString(rs, "REREVIEWINITIALS"));
                appeal.setReReviewDecision(JDBCHelper.getString(rs, "REREVIEWDECISION"));
                appeal.setAppealReason(JDBCHelper.getString(rs, "APPEALREASON"));
                appeal.setAppealBasis(JDBCHelper.getString(rs, "APPEALBASIS"));
                appeal.setAppealRecommendation(JDBCHelper.getString(rs, "APPEALRECOMMENDATION"));
                appeal.setAppealDecisionReason(getAppealDecisionReason(JDBCHelper.getString(rs, "APPEALADJUSTDENYREASONID")));
                appeal.setAppealEndValue(JDBCHelper.getString(rs, "APPEALENDVALUE"));
                appeal.setAppealDate(JDBCHelper.getString(rs, "DATEOFAPPEAL"));
                appeal.setAppealDateReceived(JDBCHelper.getString(rs, "DATERECEIVED"));
                appeal.setAppealBeginningValue(JDBCHelper.getString(rs, "BEGINNINGAPPEALVALUE"));
                appeal.setAppraisalType(JDBCHelper.getString(rs, "APPRAISALTYPE"));
                appeal.setPrimaryAccount(JDBCHelper.getString(rs, "PRIMARYACCOUNT"));
                appeal.setJurisdictionId(JDBCHelper.getString(rs, "JURISDICTIONID"));
                appeal.setAppealStatus(getAppealStatus(JDBCHelper.getString(rs, "APPEALSTATUSID")));
                appeal.setAppealReasonDescription(JDBCHelper.getString(rs, "APPEALREASONDESCRIPTION"));
                appeal.setBoardNo(JDBCHelper.getString(rs, "BOARDNO"));
                appeal.setAppealDecision(JDBCHelper.getString(rs, "APPEALDECISION"));
                appeal.setSeqId(JDBCHelper.getString(rs, "SEQID"));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }
        return appeal;
    }


    public String getAppealDecisionReason(String id) {
        log.info("getAppealDecisionReason...");
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();
            String sql = "select * from encompass.TLKPAPPEALADJUSTDENYREASON TLKPAPPEALADJUSTDENYREASON " +
                    "where TLKPAPPEALADJUSTDENYREASON.APPEALADJUSTDENYREASONID = ?";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return JDBCHelper.getString(rs, "APPEALADJUSTDENYREASON");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }
        return null;
    }

    public String getReceptionNoByAccountNo(String accountNo) {
        log.info("getReceptionNoByAccountNo...");
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();
            String sql = "select * from encompass.TBLSALEACCT TBLSALEACCT " +
                    "where TBLSALEACCT.ACCOUNTNO = ? and TBLSALEACCT.VEREND = 99999999999 ORDER BY SEQID desc ";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, accountNo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return JDBCHelper.getString(rs, "RECEPTIONNO");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }
        return null;
    }

    private Sale getSale(String accountNo) {
        log.info("getSale()...");
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT TBLSALE.*, TBLSALEACCT.*, TBNSALEINVENTORY.* " +
                    "FROM ENCOMPASS.TBLSALE TBLSALE " +
                    "JOIN ENCOMPASS.TBLSALEACCT TBLSALEACCT ON TBLSALEACCT.RECEPTIONNO = TBLSALE.RECEPTIONNO " +
                    "JOIN ENCOMPASS.TBNSALEINVENTORY TBNSALEINVENTORY ON TBNSALEINVENTORY.RECEPTIONNO = TBLSALE.RECEPTIONNO " +
                    "INNER JOIN " +
                    "  (SELECT TBLSALEACCT.ACCOUNTNO, MAX(TBLSALEACCT.INVENTORYEFFECTIVEDATE) AS MAXDATE FROM ENCOMPASS.TBLSALEACCT GROUP BY TBLSALEACCT.ACCOUNTNO) TM " +
                    "  ON TBLSALEACCT.ACCOUNTNO = TM.ACCOUNTNO AND TBLSALEACCT.INVENTORYEFFECTIVEDATE = TM.MAXDATE " +
                    "WHERE TBLSALEACCT.VEREND = 99999999999 " +
                    "AND TBLSALE.VEREND = 99999999999 " +
                    "AND TBLSALEACCT.ACCOUNTNO = :accountNo ORDER BY TBLSALE.SALEDATE DESC", Sale.class);
            query.setMaxResults(maxResults);
            query.setParameter("accountNo", accountNo);
            List<Sale> saleList = query.getResultList();
            log.info("saleList: " + saleList.size());
            if (saleList.size() > 0) {
                return saleList.get(0);
            } else {
                return null;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
    }

    public String getAppealStatus(String id) {
        log.info("getAppealStatus...");
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();
            String sql = "select * from encompass.TLKPSTATUSAPPEAL TLKPSTATUSAPPEAL " +
                    "where TLKPSTATUSAPPEAL.APPEALSTATUSID = ?";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return JDBCHelper.getString(rs, "APPEALSTATUSVALUE");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }
        return null;
    }

    private Connection getRealwareDatabaseConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://dvrwsql.dcgd.douglas.co.us:1433;databaseName=DVRW_Patch;user=manu;password=manu";
            connection = DriverManager.getConnection(dbURL);
        } catch (Exception ex) {
            throw new RuntimeException(ex);

        }
        return connection;
    }

    private Connection getAssessorDatabaseConnection() {
        Connection connection = null;
        try {
            connection = JDBCHelper.getDataSourceConnection("jdbc/assessor");
        } catch (Exception ex) {
            throw new RuntimeException(ex);

        }
        return connection;
    }

    public EntityManager getEntityManager (){
            return Persistence.createEntityManagerFactory("theAllNewAssessor").createEntityManager();
    }
}
