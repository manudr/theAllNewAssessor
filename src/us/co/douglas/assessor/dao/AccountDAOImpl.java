package us.co.douglas.assessor.dao;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.model.*;
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
                    "and appl.taxyear = 2015 " +
                    "and applacct.taxyear = 2015 " +
                    "order by acct.ACCOUNTNO asc";
            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountNo(JDBCHelper.getString(rs, "ACCOUNTNO"));
                account.setParcelNo(JDBCHelper.getString(rs, "PARCELNO"));
                account.setAcctType(JDBCHelper.getString(rs, "ACCTTYPE"));
                account.setLocalNo(JDBCHelper.getString(rs, "LOCALNO"));
                account.setMapNo(JDBCHelper.getString(rs, "MAPNO"));
                account.setValueAreaDescription(JDBCHelper.getString(rs, "VALUEAREACODE"));
                account.setEconomicAreaCode(JDBCHelper.getString(rs, "ECONOMICAREACODE"));
                account.setMapGroup(JDBCHelper.getString(rs, "MAPGROUP"));
                account.setControlMap(JDBCHelper.getString(rs, "CONTROLMAP"));
                account.setPropertyIdentifier(JDBCHelper.getString(rs, "PROPERTYIDENTIFIER"));
                account.setSpecialInterestNumber(JDBCHelper.getString(rs, "SPECIALINTERESTNUMBER"));
                account.setPrimaryUseCodeDescription(JDBCHelper.getString(rs, "PRIMARYUSECODE"));
                account.setStrippedAccountNo(JDBCHelper.getString(rs, "STRIPPEDACCOUNTNO"));
                account.setJurisdictionId(JDBCHelper.getString(rs, "JURISDICTIONID"));
                account.setMobileHomeSpace(JDBCHelper.getString(rs, "MOBILEHOMESPACE"));
                account.seteFileFlag(JDBCHelper.getString(rs, "EFILEFLAG"));
                account.setMarketHybridPercent(JDBCHelper.getString(rs, "MARKETHYBRIDPERCENT"));
                account.setIncomeHybridPercent(JDBCHelper.getString(rs, "INCOMEHYBRIDPERCENT"));
                account.setReconciledHybridPercent(JDBCHelper.getString(rs, "RECONCILEDHYBRIDPERCENT"));
                account.setParcelSequence(JDBCHelper.getString(rs, "PARCELSEQUENCE"));
                account.setPropertyClassId(JDBCHelper.getString(rs, "PROPERTYCLASSID"));
                account.setSeqId(JDBCHelper.getString(rs, "SEQID"));
                account.setDetailedReviewDate(JDBCHelper.getString(rs, "DETAILEDREVIEWDATE"));
                account.setAppraisalType(JDBCHelper.getString(rs, "APPRAISALTYPE"));
                account.setAcctStatus(JDBCHelper.getString(rs, "ACCTSTATUSCODE"));
                account.setAssignedTo(JDBCHelper.getString(rs, "ASSIGNEDTO"));
                account.setBusinessLicense(JDBCHelper.getString(rs, "BUSINESSLICENSE"));
                account.setBusinessName(JDBCHelper.getString(rs, "BUSINESSNAME"));
                account.setCensusBlock(JDBCHelper.getString(rs, "CENSUSBLOCK"));
                account.setCensusTract(JDBCHelper.getString(rs, "CENSUSTRACT"));
                account.setControlMap(JDBCHelper.getString(rs, "CONTROLMAP"));
                account.setCostHybridPercent(JDBCHelper.getString(rs, "COSTHYBRIDPERCENT"));
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
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, '') + " +
                    "' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') " +
                    "from " +
                    "encompass.TBLACCT TBLACCT " +
                    "join encompass.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "where TBLACCT.verend = 99999999999 and TBLACCTPROPERTYADDRESS.verend = 99999999999");
            query.setMaxResults(maxResults);
            allPropertyAddresses = query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allPropertyAddresses;
    }

    public List<Sale> getNeighborhoodSales(String zipCode) {
        log.info("getAllSalesByZip...");
        List<Sale> allSalesByZip = new ArrayList<Sale>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT TBLSALE.RECEPTIONNO AS RECEPTIONNO, " +
                    "TBLSALE.SALEDATE AS SALEDATE, " +
                    "TBLSALE.GRANTOR AS GRANTOR, " +
                    "TBLSALE.GRANTEE AS GRANTEE, " +
                    "TBLSALE.SALEPRICE AS SALEPRICE, " +
                    "TBLSALE.PPADJAMOUNT AS PPADJAMOUNT, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, '') AS PROPERTYADDRESS, " +
                    "TBLSALE.GOODWILLADJAMOUNT AS GOODWILLADJAMOUNT, " +
                    "TBLSALE.DOCUMENTDATE AS DOCUMENTDATE, " +
                    "TBLSALE.OTHERADJAMOUNT AS OTHERADJAMOUNT, " +
                    "TBLSALE.TIMEADJ AS TIMEADJ, " +
                    "TBLSALE.JURISDICTIONID AS JURISDICTIONID, " +
                    "TBLSALEACCT.ACCOUNTNO AS ACCOUNTNO, " +
                    "TBLSALEACCT.INVENTORYEFFECTIVEDATE AS INVENTORYEFFECTIVEDATE, " +
                    "TBLSALEACCT.ACCTADJSALEPRICE AS ACCTADJSALEPRICE, " +
                    "0 AS TIMEADJUSTEDSALEPRICE, " +
                    "ISNULL(TBLACCTNBHD.NBHDCODE, '') + '-' + ISNULL(TBLACCTNBHD.NBHDEXTENSION, '') AS NEIGHBORHOOD, " +
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
                    "AND TBLSALE.VEREND = 99999999999 AND TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE LIKE '%" + zipCode + "%'", Sale.class);
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
                    "ISNULL(TBLACCTNBHD.NBHDCODE, '') + '-' + ISNULL(TBLACCTNBHD.NBHDEXTENSION, '') + ':' + " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, '') + ':' + " +
                    "ISNULL(TBLADDRESSSECURE.ADDRESS1, '') + ' ' + ISNULL(TBLADDRESSSECURE.ADDRESS2, '') + ' ' + ISNULL(TBLADDRESSSECURE.CITY, '') + ' ' + ISNULL(TBLADDRESSSECURE.STATECODE, '') + ' ' + ISNULL(TBLADDRESSSECURE.ZIPCODE, '') + ' ' + ISNULL(TBLADDRESSSECURE.PROVINCE, '') + ':' + " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') " +
                    "from encompass.TBLACCT TBLACCT " +
                    "join encompass.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS on TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLPERSONSECURE TBLPERSONSECURE on TBLPERSONSECURE.PERSONCODE = TBLACCTOWNERADDRESS.PERSONCODE " +
                    "join encompass.TBLADDRESSSECURE TBLADDRESSSECURE on TBLADDRESSSECURE.ADDRESSCODE = TBLACCTOWNERADDRESS.ADDRESSCODE " +
                    "join encompass.TBLACCTNBHD TBLACCTNBHD on TBLACCTNBHD.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLACCTLEGAL TBLACCTLEGAL on TBLACCTLEGAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLSUBACCOUNT TBLSUBACCOUNT on TBLSUBACCOUNT.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBNSUBDIVISION TBNSUBDIVISION on TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "where TBLACCT.verend = 99999999999 " +
                    "and TBLADDRESSSECURE.verend = 99999999999 " +
                    "and TBLPERSONSECURE.verend = 99999999999 " +
                    "and TBLACCTOWNERADDRESS.verend = 99999999999 " +
                    "and TBLACCTPROPERTYADDRESS.verend = 99999999999 " +
                    "and TBLACCTNBHD.verend = 99999999999 " +
                    "and TBLACCTLEGAL.verend = 99999999999 " +
                    "and TBLSUBACCOUNT.verend = 99999999999 " +
                    "order by TBLACCT.ACCOUNTNO asc, TBLACCT.PARCELNO asc");
            query.setMaxResults(maxResults);
            allSearchableStrings = query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allSearchableStrings;
    }

    public List<BasicAccountInfo> getAllSearchableParcels() {
        log.info("getAllSearchableParcels...");
        List<BasicAccountInfo> allSearchableParcels = new ArrayList<BasicAccountInfo>();
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("select ISNULL(TBLACCT.ACCOUNTNO, ''), ISNULL(TBLACCT.PARCELNO, ''), " +
                    "ISNULL(TBLPERSONSECURE.NAME1, '') + ' ' + ISNULL(TBLPERSONSECURE.NAME2, ''), " +
                    "ISNULL(TBLACCT.BUSINESSNAME, ''), " +
                    "ISNULL(TBLACCT.BUSINESSLICENSE, ''), " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') " +
                    "from encompass.TBLACCT TBLACCT " +
                    "join encompass.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS on TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "join encompass.TBLPERSONSECURE TBLPERSONSECURE on TBLPERSONSECURE.PERSONCODE = TBLACCTOWNERADDRESS.PERSONCODE " +
                    "where TBLACCT.verend = 99999999999 and TBLACCTPROPERTYADDRESS.verend = 99999999999 " +
                    "and TBLPERSONSECURE.verend = 99999999999 and TBLACCTOWNERADDRESS.verend = 99999999999 " +
                    "order by TBLACCT.ACCOUNTNO asc", BasicAccountInfo.class);
            query.setMaxResults(maxResults);
            allSearchableParcels = query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            entityManager.close();
        }
        return allSearchableParcels;
    }

    public Account getAccountByAccountNo(String accountNo) {
        log.info("getAccountByAccountNo...");
        List<Account> accounts = new ArrayList<Account>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getRealwareDatabaseConnection();

            String sql = "select distinct " +
                    "TBLACCT.*, " +
                    "TBLACCTLEGAL.*, " +
                    "TBLACCTLEGALLOCATION.*, " +
                    "TBLACCTNBHD.*, " +
                    "TBLACCTOWNERADDRESS.*, " +
                    "TBLACCTPROPERTYADDRESS.*, " +
                    "TBLACCTREAL.*, " +
                    "TBLADDRESSSECURE.*, " +
                    "TBLPERSONSECURE.* " +
                    "from ENCOMPASS.TBLACCT TBLACCT " +
                    "left outer join ENCOMPASS.TBLACCTLEGAL TBLACCTLEGAL on  TBLACCTLEGAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLACCTLEGALLOCATION TBLACCTLEGALLOCATION on TBLACCTLEGALLOCATION.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLACCTNBHD TBLACCTNBHD on TBLACCTNBHD.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLACCTOWNERADDRESS TBLACCTOWNERADDRESS on TBLACCTOWNERADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS on TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLACCTREAL TBLACCTREAL on TBLACCTREAL.ACCOUNTNO = TBLACCT.ACCOUNTNO " +
                    "left outer join ENCOMPASS.TBLADDRESSSECURE TBLADDRESSSECURE on TBLADDRESSSECURE.ADDRESSCODE = TBLACCTOWNERADDRESS.ADDRESSCODE " +
                    "left outer join ENCOMPASS.TBLPERSONSECURE TBLPERSONSECURE on TBLPERSONSECURE.PERSONCODE = TBLACCTOWNERADDRESS.PERSONCODE " +
                    "where " +
                    "TBLACCT.verend = 99999999999 " +
                    "and TBLACCTLEGAL.verend = 99999999999 " +
                    "and TBLACCTLEGALLOCATION.verend = 99999999999 " +
                    "and TBLACCTNBHD.verend = 99999999999 " +
                    "and TBLACCTOWNERADDRESS.verend = 99999999999 " +
                    "and TBLACCTPROPERTYADDRESS.verend = 99999999999 " +
                    "and TBLACCTREAL.verend = 99999999999 " +
                    "and TBLADDRESSSECURE.verend = 99999999999 " +
                    "and TBLPERSONSECURE.verend = 99999999999 " +
                    "and TBLACCT.ACCOUNTNO = ?";

            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, accountNo);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountNo(JDBCHelper.getString(rs, "ACCOUNTNO"));
                account.setParcelNo(JDBCHelper.getString(rs, "PARCELNO"));
                account.setLocalNo(JDBCHelper.getString(rs, "LOCALNO"));
                account.setMapNo(JDBCHelper.getString(rs, "MAPNO"));
                account.setAcctStatus(JDBCHelper.getString(rs, "ACCTSTATUSCODE"));
                account.setAcctType(JDBCHelper.getString(rs, "ACCTTYPE"));
                account.setAssignedTo(JDBCHelper.getString(rs, "ASSIGNEDTO"));
                account.setValueAreaDescription(JDBCHelper.getString(rs, "VALUEAREACODE"));
                account.setAppraisalType(JDBCHelper.getString(rs, "APPRAISALTYPE"));
                account.setEconomicAreaCode(JDBCHelper.getString(rs, "ECONOMICAREACODE"));
                account.setDefaultApproachType(JDBCHelper.getString(rs, "DEFAULTAPPROACHTYPE"));
                account.setDefaultTaxDistrict(JDBCHelper.getString(rs, "DEFAULTTAXDISTRICT"));
                account.setBusinessLicense(JDBCHelper.getString(rs, "BUSINESSLICENSE"));
                account.setMapGroup(JDBCHelper.getString(rs, "MAPGROUP"));
                account.setControlMap(JDBCHelper.getString(rs, "CONTROLMAP"));
                account.setPropertyIdentifier(JDBCHelper.getString(rs, "PROPERTYIDENTIFIER"));
                account.setSpecialInterestNumber(JDBCHelper.getString(rs, "SPECIALINTERESTNUMBER"));
                account.setPrimaryUseCodeDescription(JDBCHelper.getString(rs, "PRIMARYUSECODE"));
                account.setWard(JDBCHelper.getString(rs, "WARD"));
                account.setStrippedAccountNo(JDBCHelper.getString(rs, "STRIPPEDACCOUNTNO"));
                account.setJurisdictionId(JDBCHelper.getString(rs, "JURISDICTIONID"));
                account.setCensusTract(JDBCHelper.getString(rs, "CENSUSTRACT"));
                account.setCensusBlock(JDBCHelper.getString(rs, "CENSUSBLOCK"));
                account.setMobileHomeSpace(JDBCHelper.getString(rs, "MOBILEHOMESPACE"));
                account.seteFileFlag(JDBCHelper.getString(rs, "EFILEFLAG"));
                account.setBusinessName(JDBCHelper.getString(rs, "BUSINESSNAME"));
                account.setCostHybridPercent(JDBCHelper.getString(rs, "COSTHYBRIDPERCENT"));
                account.setMarketHybridPercent(JDBCHelper.getString(rs, "MARKETHYBRIDPERCENT"));
                account.setIncomeHybridPercent(JDBCHelper.getString(rs, "INCOMEHYBRIDPERCENT"));
                account.setReconciledHybridPercent(JDBCHelper.getString(rs, "RECONCILEDHYBRIDPERCENT"));
                account.setParcelSequence(JDBCHelper.getString(rs, "PARCELSEQUENCE"));
                account.setPropertyClassId(JDBCHelper.getString(rs, "PROPERTYCLASSID"));
                account.setSeqId(JDBCHelper.getString(rs, "SEQID"));
                account.setDetailedReviewDate(JDBCHelper.getString(rs, "DETAILEDREVIEWDATE"));
                account.setLegal(JDBCHelper.getString(rs, "LEGAL"));
                account.setQtr(JDBCHelper.getString(rs, "QTR"));
                account.setSection(JDBCHelper.getString(rs, "SECTION"));
                account.setTownship(JDBCHelper.getString(rs, "TOWNSHIP"));
                account.setRange(JDBCHelper.getString(rs, "RANGE"));
                account.setNbhdCode(JDBCHelper.getString(rs, "NBHDCODE"));
                account.setNbhdExtension(JDBCHelper.getString(rs, "NBHDEXTENSION"));
                account.setPropertyType(JDBCHelper.getString(rs, "PROPERTYTYPE"));
                account.setNbhdAdjustmentValue(JDBCHelper.getString(rs, "NBHDADJUSTMENTVALUE"));
                account.setBuildingId(JDBCHelper.getString(rs, "BUILDINGID"));
                account.setPreDirection(JDBCHelper.getString(rs, "PREDIRECTION"));
                account.setPropertyAddress(StringUtils.trimToEmpty(JDBCHelper.getString(rs, "STREETNO")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "UNITNAME")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "POSTDIRECTION")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "STREETNAME")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "STREETTYPE")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "PROPERTYCITY")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "PROPERTYZIPCODE")));
                account.setImpOnlyFlag(JDBCHelper.getString(rs, "IMPONLYFLAG"));
                account.setTifFlag(JDBCHelper.getString(rs, "TIFFLAG"));
                account.setVacantFlag(JDBCHelper.getString(rs, "VACANTFLAG"));
                account.setLandWidth(JDBCHelper.getString(rs, "LANDWIDTH"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDDEPTH"));
                account.setLandEasementSf(JDBCHelper.getString(rs, "LANDEASEMENTSF"));
                account.setLandExcessSf(JDBCHelper.getString(rs, "LANDEXCESSSF"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDDEPTH"));
                account.setTrafficCount(JDBCHelper.getString(rs, "TRAFFICCOUNT"));
                account.setParkingSpaces(JDBCHelper.getString(rs, "PARKINGSPACES"));
                account.setLandDepth(JDBCHelper.getString(rs, "ZONINGCODE"));
                account.setLandDepth(JDBCHelper.getString(rs, "FLOODFRINGE"));
                account.setLandDepth(JDBCHelper.getString(rs, "FLOODWAY"));
                account.setLandDepth(JDBCHelper.getString(rs, "TAPFEE"));
                account.setLandDepth(JDBCHelper.getString(rs, "PLATTEDFLAG"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDCERTIFICATIONCODE"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDAPPRAISER"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDAPPRAISALDATE"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDOVERRIDESIZEADJ"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDSIZEADJ"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDGROSSSF"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDGROSSACRES"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDGROSSFF"));
                account.setLandDepth(JDBCHelper.getString(rs, "LANDGROSSUNITCOUNT"));
                account.setLandDepth(JDBCHelper.getString(rs, "DEFAULTLEA"));
                account.setLandDepth(JDBCHelper.getString(rs, "TOTALACCTIMPINTERESTPCT"));
                account.setLandDepth(JDBCHelper.getString(rs, "TOTALACCTLANDINTERESTPCT"));
                account.setOwnerAddress(StringUtils.trimToEmpty(JDBCHelper.getString(rs, "ADDRESS1")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "ADDRESS2")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "CITY")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "STATECODE")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "ZIPCODE")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "PROVINCE")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "COUNTRY")) + " " +
                        StringUtils.trimToEmpty(JDBCHelper.getString(rs, "POSTALCODE")));
                account.setLandDepth(JDBCHelper.getString(rs, "NAME1") + JDBCHelper.getString(rs, "NAME2"));
                account.setLandDepth(JDBCHelper.getString(rs, "PHONE"));
                account.setLandDepth(JDBCHelper.getString(rs, "FAX"));
                account.setLandDepth(JDBCHelper.getString(rs, "MOBILE"));
                account.setLandDepth(JDBCHelper.getString(rs, "PAGER"));
                account.setLandDepth(JDBCHelper.getString(rs, "EMAILADDRESS"));
                account.setLandDepth(JDBCHelper.getString(rs, "FEDERALIDNO"));
                account.setLandDepth(JDBCHelper.getString(rs, "PRIVATEFLAG"));
                account.setLandDepth(JDBCHelper.getString(rs, "PERSONTYPEID"));
                account.setLandDepth(JDBCHelper.getString(rs, "METAPHONENAME1"));
                account.setLandDepth(JDBCHelper.getString(rs, "METAPHONENAME2"));

                account.setAppeal(getAppealByAccountNo(accountNo));

                String receptionNo = getReceptionNoByAccountNo(accountNo);

                account.setSale(getSale(receptionNo));
                account.setSaleInventory(getSaleInventoryByReceptionNo(receptionNo));

                accounts.add(account);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(connection);
        }

        if (accounts.size() > 0) {
            return accounts.get(0);
        } else {
            return null;
        }
    }

    public Appeal getAppealByAccountNo(String accountNo) {
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
                    "order by TBLAPPEAL.taxyear desc";

            log.info("sql: " + sql);
            ps = connection.prepareStatement(sql);
            JDBCHelper.setString(ps, 1, accountNo);
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

    private Sale getSale(String receptionNo) {
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("SELECT DISTINCT TBLSALE.RECEPTIONNO AS RECEPTIONNO, " +
                    "TBLSALE.SALEDATE AS SALEDATE, " +
                    "TBLSALE.GRANTOR AS GRANTOR, " +
                    "TBLSALE.GRANTEE AS GRANTEE, " +
                    "TBLSALE.SALEPRICE AS SALEPRICE, " +
                    "TBLSALE.PPADJAMOUNT AS PPADJAMOUNT, " +
                    "ISNULL(TBLACCTPROPERTYADDRESS.STREETNO, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.UNITNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETNAME, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.STREETTYPE, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYCITY, '') + ' ' + ISNULL(TBLACCTPROPERTYADDRESS.PROPERTYZIPCODE, '') AS PROPERTYADDRESS, " +
                    "TBLSALE.GOODWILLADJAMOUNT AS GOODWILLADJAMOUNT, " +
                    "TBLSALE.DOCUMENTDATE AS DOCUMENTDATE, " +
                    "TBLSALE.OTHERADJAMOUNT AS OTHERADJAMOUNT, " +
                    "TBLSALE.TIMEADJ AS TIMEADJ, " +
                    "TBLSALE.JURISDICTIONID AS JURISDICTIONID, " +
                    "TBLSALEACCT.ACCOUNTNO AS ACCOUNTNO, " +
                    "TBLSALEACCT.INVENTORYEFFECTIVEDATE AS INVENTORYEFFECTIVEDATE, " +
                    "(ISNULL(TBLACCTNBHD.NBHDCODE, '') + '-' + ISNULL(TBLACCTNBHD.NBHDEXTENSION, '')) AS NEIGHBORHOOD, " +
                    "ISNULL(TBNSUBDIVISION.SUBNAME, '') AS SUBDIVISION, " +
                    "0 AS TIMEADJUSTEDSALEPRICE, " +
                    "TBLSALEACCT.ACCTADJSALEPRICE AS ACCTADJSALEPRICE " +
                    "FROM ENCOMPASS.TBLSALEACCT TBLSALEACCT " +
                    "INNER JOIN ENCOMPASS.TBLSALE TBLSALE ON TBLSALE.RECEPTIONNO = TBLSALEACCT.RECEPTIONNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTPROPERTYADDRESS TBLACCTPROPERTYADDRESS ON TBLACCTPROPERTYADDRESS.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN (SELECT TBLSALEACCT.ACCOUNTNO, MAX(TBLSALEACCT.INVENTORYEFFECTIVEDATE) AS MAXDATE FROM ENCOMPASS.TBLSALEACCT GROUP BY TBLSALEACCT.ACCOUNTNO ) TM ON TBLSALEACCT.ACCOUNTNO = TM.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLACCTNBHD TBLACCTNBHD ON TBLACCTNBHD.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBLSUBACCOUNT TBLSUBACCOUNT ON TBLSUBACCOUNT.ACCOUNTNO = TBLSALEACCT.ACCOUNTNO " +
                    "INNER JOIN ENCOMPASS.TBNSUBDIVISION TBNSUBDIVISION ON TBNSUBDIVISION.SUBNO = TBLSUBACCOUNT.SUBNO " +
                    "AND TBLSALEACCT.INVENTORYEFFECTIVEDATE = TM.MAXDATE " +
                    "WHERE TBLSALEACCT.VEREND = 99999999999 " +
                    "AND TBLSALE.VEREND = 99999999999 " +
                    "AND TBLACCTNBHD.VEREND = 99999999999 " +
                    "AND TBLSUBACCOUNT.VEREND = 99999999999 " +
                    "AND TBLSALE.RECEPTIONNO = :receptionNo ", Sale.class);
            query.setMaxResults(maxResults);
            query.setParameter("receptionNo", receptionNo);
            List<Sale> saleList = query.getResultList();
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

    private SaleInventory getSaleInventoryByReceptionNo(String receptionNo) {
        log.info("getSaleInventoryByReceptionNo...");
        EntityManager entityManager = getEntityManager();
        try {
            Query query = entityManager.createNativeQuery("select * from encompass.TBNSALEINVENTORY TBNSALEINVENTORY " +
                    "where TBNSALEINVENTORY.RECEPTIONNO = :receptionNo ", SaleInventory.class);
            query.setMaxResults(maxResults);
            query.setParameter("receptionNo", receptionNo);
            List<SaleInventory> saleInventoryList = query.getResultList();
            log.info("saleInventoryList.size(): " + saleInventoryList.size());
            if (saleInventoryList.size() > 0) {
                return saleInventoryList.get(0);
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

    public List<Account> getAllAccountsFromODS() {
        log.info("getAllAccountsFromODS...");
        List<Account> accounts = new ArrayList<Account>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getAssessorDatabaseConnection();
            String sql = "select * from ods.account where account_no = 'R0376407'";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setAccountNo(JDBCHelper.getString(rs, "ACCOUNT_NO"));
                account.setParcelNo(JDBCHelper.getString(rs, "STATE_PARCEL_NO"));
                account.setAcctType(JDBCHelper.getString(rs, "ACCOUNT_TYPE_CODE"));
                account.setAppraisalType(JDBCHelper.getString(rs, "APPRAISALTYPE"));
                account.setAcctStatus(JDBCHelper.getString(rs, "ACCOUNT_STATUS_CODE"));
                account.setAssignedTo(JDBCHelper.getString(rs, "ASSIGNED_TO_AREA_EID"));
                account.setBusinessLicense(JDBCHelper.getString(rs, "BUSINESSLICENSE"));
                account.setBusinessName(JDBCHelper.getString(rs, "BUSINESSNAME"));
                account.setCensusBlock(JDBCHelper.getString(rs, "CENSUSBLOCK"));
                account.setCensusTract(JDBCHelper.getString(rs, "CENSUSTRACT"));
                account.setControlMap(JDBCHelper.getString(rs, "CONTROLMAP"));
                account.setCostHybridPercent(JDBCHelper.getString(rs, "COSTHYBRIDPERCENT"));
                account.setDefaultApproachType(JDBCHelper.getString(rs, "DEFAULTAPPROACHTYPE"));
                account.setDefaultTaxDistrict(JDBCHelper.getString(rs, "TAX_DISTRICT_NO"));
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
