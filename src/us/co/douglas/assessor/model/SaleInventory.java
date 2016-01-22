package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@Table(name = "TBNSALEINVENTORY", schema = "ENCOMPASS")
public class SaleInventory {
    private String receptionno;

    @Id
    @Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private String accountno;

    @Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    private String parcelno;
    
    @Column(name = "PARCELNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getParcelno() {
        return parcelno;
    }

    public void setParcelno(String parcelno) {
        this.parcelno = parcelno;
    }

    private Timestamp inventoryeffectivedate;

    
    @Column(name = "INVENTORYEFFECTIVEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getInventoryeffectivedate() {
        return inventoryeffectivedate;
    }

    public void setInventoryeffectivedate(Timestamp inventoryeffectivedate) {
        this.inventoryeffectivedate = inventoryeffectivedate;
    }

    private Timestamp saledate;

    
    @Column(name = "SALEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaledate() {
        return saledate;
    }

    public void setSaledate(Timestamp saledate) {
        this.saledate = saledate;
    }

    private BigDecimal saleprice;

    
    @Column(name = "SALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    private BigDecimal adjsaleprice;

    
    @Column(name = "ADJSALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAdjsaleprice() {
        return adjsaleprice;
    }

    public void setAdjsaleprice(BigDecimal adjsaleprice) {
        this.adjsaleprice = adjsaleprice;
    }

    private BigDecimal salevalueper;

    
    @Column(name = "SALEVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSalevalueper() {
        return salevalueper;
    }

    public void setSalevalueper(BigDecimal salevalueper) {
        this.salevalueper = salevalueper;
    }

    private String accttype;

    
    @Column(name = "ACCTTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
    }

    private String economicareacode;

    
    @Column(name = "ECONOMICAREACODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getEconomicareacode() {
        return economicareacode;
    }

    public void setEconomicareacode(String economicareacode) {
        this.economicareacode = economicareacode;
    }

    private String lea;

    
    @Column(name = "LEA", nullable = true, insertable = true, updatable = true, length = 30)
    public String getLea() {
        return lea;
    }

    public void setLea(String lea) {
        this.lea = lea;
    }

    private String subdivision;

    
    @Column(name = "SUBDIVISION", nullable = true, insertable = true, updatable = true, length = 30)
    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    private String valueareacode;

    
    @Column(name = "VALUEAREACODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getValueareacode() {
        return valueareacode;
    }

    public void setValueareacode(String valueareacode) {
        this.valueareacode = valueareacode;
    }

    private String propertytype;

    
    @Column(name = "PROPERTYTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    private String impconditiontype;

    
    @Column(name = "IMPCONDITIONTYPE", nullable = true, insertable = true, updatable = true, length = 40)
    public String getImpconditiontype() {
        return impconditiontype;
    }

    public void setImpconditiontype(String impconditiontype) {
        this.impconditiontype = impconditiontype;
    }

    private String impquality;

    
    @Column(name = "IMPQUALITY", nullable = true, insertable = true, updatable = true, length = 15)
    public String getImpquality() {
        return impquality;
    }

    public void setImpquality(String impquality) {
        this.impquality = impquality;
    }

    private String impabstractcode;

    
    @Column(name = "IMPABSTRACTCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getImpabstractcode() {
        return impabstractcode;
    }

    public void setImpabstractcode(String impabstractcode) {
        this.impabstractcode = impabstractcode;
    }

    private String bltasdescription;

    
    @Column(name = "BLTASDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 50)
    public String getBltasdescription() {
        return bltasdescription;
    }

    public void setBltasdescription(String bltasdescription) {
        this.bltasdescription = bltasdescription;
    }

    private Integer bltasyearbuilt;

    
    @Column(name = "BLTASYEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBltasyearbuilt() {
        return bltasyearbuilt;
    }

    public void setBltasyearbuilt(Integer bltasyearbuilt) {
        this.bltasyearbuilt = bltasyearbuilt;
    }

    private Integer physicalage;

    
    @Column(name = "PHYSICALAGE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPhysicalage() {
        return physicalage;
    }

    public void setPhysicalage(Integer physicalage) {
        this.physicalage = physicalage;
    }

    private Integer adjustedyearbuilt;

    
    @Column(name = "ADJUSTEDYEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAdjustedyearbuilt() {
        return adjustedyearbuilt;
    }

    public void setAdjustedyearbuilt(Integer adjustedyearbuilt) {
        this.adjustedyearbuilt = adjustedyearbuilt;
    }

    private Integer effectiveage;

    
    @Column(name = "EFFECTIVEAGE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getEffectiveage() {
        return effectiveage;
    }

    public void setEffectiveage(Integer effectiveage) {
        this.effectiveage = effectiveage;
    }

    private String impexterior;

    
    @Column(name = "IMPEXTERIOR", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpexterior() {
        return impexterior;
    }

    public void setImpexterior(String impexterior) {
        this.impexterior = impexterior;
    }

    private String classcode;

    
    @Column(name = "CLASSCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    private Integer impcount;

    
    @Column(name = "IMPCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpcount() {
        return impcount;
    }

    public void setImpcount(Integer impcount) {
        this.impcount = impcount;
    }

    private Integer bltastotalunitcount;

    
    @Column(name = "BLTASTOTALUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBltastotalunitcount() {
        return bltastotalunitcount;
    }

    public void setBltastotalunitcount(Integer bltastotalunitcount) {
        this.bltastotalunitcount = bltastotalunitcount;
    }

    private Integer roomcount;

    
    @Column(name = "ROOMCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(Integer roomcount) {
        this.roomcount = roomcount;
    }

    private BigDecimal bedroomcount;

    
    @Column(name = "BEDROOMCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBedroomcount() {
        return bedroomcount;
    }

    public void setBedroomcount(BigDecimal bedroomcount) {
        this.bedroomcount = bedroomcount;
    }

    private BigDecimal bathcount;

    
    @Column(name = "BATHCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBathcount() {
        return bathcount;
    }

    public void setBathcount(BigDecimal bathcount) {
        this.bathcount = bathcount;
    }

    private Integer fixturecount;

    
    @Column(name = "FIXTURECOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getFixturecount() {
        return fixturecount;
    }

    public void setFixturecount(Integer fixturecount) {
        this.fixturecount = fixturecount;
    }

    private BigDecimal totalimpsf;

    
    @Column(name = "TOTALIMPSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotalimpsf() {
        return totalimpsf;
    }

    public void setTotalimpsf(BigDecimal totalimpsf) {
        this.totalimpsf = totalimpsf;
    }

    private BigDecimal residentialsf;

    
    @Column(name = "RESIDENTIALSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getResidentialsf() {
        return residentialsf;
    }

    public void setResidentialsf(BigDecimal residentialsf) {
        this.residentialsf = residentialsf;
    }

    private BigDecimal commercialsf;

    
    @Column(name = "COMMERCIALSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCommercialsf() {
        return commercialsf;
    }

    public void setCommercialsf(BigDecimal commercialsf) {
        this.commercialsf = commercialsf;
    }

    private Integer condoimpsf;

    
    @Column(name = "CONDOIMPSF", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getCondoimpsf() {
        return condoimpsf;
    }

    public void setCondoimpsf(Integer condoimpsf) {
        this.condoimpsf = condoimpsf;
    }

    private BigDecimal outbuildingsf;

    
    @Column(name = "OUTBUILDINGSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getOutbuildingsf() {
        return outbuildingsf;
    }

    public void setOutbuildingsf(BigDecimal outbuildingsf) {
        this.outbuildingsf = outbuildingsf;
    }

    private Integer impbltasother;

    
    @Column(name = "IMPBLTASOTHER", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpbltasother() {
        return impbltasother;
    }

    public void setImpbltasother(Integer impbltasother) {
        this.impbltasother = impbltasother;
    }

    private BigDecimal landnetsf;

    
    @Column(name = "LANDNETSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandnetsf() {
        return landnetsf;
    }

    public void setLandnetsf(BigDecimal landnetsf) {
        this.landnetsf = landnetsf;
    }

    private BigInteger multipleuseflag;

    
    @Column(name = "MULTIPLEUSEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getMultipleuseflag() {
        return multipleuseflag;
    }

    public void setMultipleuseflag(BigInteger multipleuseflag) {
        this.multipleuseflag = multipleuseflag;
    }

    private String landtype;

    
    @Column(name = "LANDTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getLandtype() {
        return landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype;
    }

    private String landabstractcode;

    
    @Column(name = "LANDABSTRACTCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandabstractcode() {
        return landabstractcode;
    }

    public void setLandabstractcode(String landabstractcode) {
        this.landabstractcode = landabstractcode;
    }

    private String landcertificationcode;

    
    @Column(name = "LANDCERTIFICATIONCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandcertificationcode() {
        return landcertificationcode;
    }

    public void setLandcertificationcode(String landcertificationcode) {
        this.landcertificationcode = landcertificationcode;
    }

    private BigDecimal landgrossacrecount;

    
    @Column(name = "LANDGROSSACRECOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossacrecount() {
        return landgrossacrecount;
    }

    public void setLandgrossacrecount(BigDecimal landgrossacrecount) {
        this.landgrossacrecount = landgrossacrecount;
    }

    private BigDecimal landgrosssf;

    
    @Column(name = "LANDGROSSSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrosssf() {
        return landgrosssf;
    }

    public void setLandgrosssf(BigDecimal landgrosssf) {
        this.landgrosssf = landgrosssf;
    }

    private BigDecimal landgrossff;

    
    @Column(name = "LANDGROSSFF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossff() {
        return landgrossff;
    }

    public void setLandgrossff(BigDecimal landgrossff) {
        this.landgrossff = landgrossff;
    }

    private BigDecimal landgrossunitcount;

    
    @Column(name = "LANDGROSSUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossunitcount() {
        return landgrossunitcount;
    }

    public void setLandgrossunitcount(BigDecimal landgrossunitcount) {
        this.landgrossunitcount = landgrossunitcount;
    }

    private String zoningcode;

    
    @Column(name = "ZONINGCODE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getZoningcode() {
        return zoningcode;
    }

    public void setZoningcode(String zoningcode) {
        this.zoningcode = zoningcode;
    }

    private BigInteger plattedflag;

    
    @Column(name = "PLATTEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPlattedflag() {
        return plattedflag;
    }

    public void setPlattedflag(BigInteger plattedflag) {
        this.plattedflag = plattedflag;
    }

    private String unitname;

    
    @Column(name = "UNITNAME", nullable = true, insertable = true, updatable = true, length = 6)
    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    private BigDecimal acctadjsalevalueper;

    
    @Column(name = "ACCTADJSALEVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAcctadjsalevalueper() {
        return acctadjsalevalueper;
    }

    public void setAcctadjsalevalueper(BigDecimal acctadjsalevalueper) {
        this.acctadjsalevalueper = acctadjsalevalueper;
    }

    private BigDecimal totallandvaluetimeofsale;

    
    @Column(name = "TOTALLANDVALUETIMEOFSALE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotallandvaluetimeofsale() {
        return totallandvaluetimeofsale;
    }

    public void setTotallandvaluetimeofsale(BigDecimal totallandvaluetimeofsale) {
        this.totallandvaluetimeofsale = totallandvaluetimeofsale;
    }

    private BigDecimal totalacctvaluetimeofsale;

    
    @Column(name = "TOTALACCTVALUETIMEOFSALE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotalacctvaluetimeofsale() {
        return totalacctvaluetimeofsale;
    }

    public void setTotalacctvaluetimeofsale(BigDecimal totalacctvaluetimeofsale) {
        this.totalacctvaluetimeofsale = totalacctvaluetimeofsale;
    }

    private BigDecimal prioryeartaxrollactualamt;

    
    @Column(name = "PRIORYEARTAXROLLACTUALAMT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPrioryeartaxrollactualamt() {
        return prioryeartaxrollactualamt;
    }

    public void setPrioryeartaxrollactualamt(BigDecimal prioryeartaxrollactualamt) {
        this.prioryeartaxrollactualamt = prioryeartaxrollactualamt;
    }

    private BigDecimal prioryeartaxrollassessed;

    
    @Column(name = "PRIORYEARTAXROLLASSESSED", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPrioryeartaxrollassessed() {
        return prioryeartaxrollassessed;
    }

    public void setPrioryeartaxrollassessed(BigDecimal prioryeartaxrollassessed) {
        this.prioryeartaxrollassessed = prioryeartaxrollassessed;
    }

    private BigDecimal landnetacrecount;

    
    @Column(name = "LANDNETACRECOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandnetacrecount() {
        return landnetacrecount;
    }

    public void setLandnetacrecount(BigDecimal landnetacrecount) {
        this.landnetacrecount = landnetacrecount;
    }

    private String hvactype;

    
    @Column(name = "HVACTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getHvactype() {
        return hvactype;
    }

    public void setHvactype(String hvactype) {
        this.hvactype = hvactype;
    }

    private String impunittype;

    
    @Column(name = "IMPUNITTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getImpunittype() {
        return impunittype;
    }

    public void setImpunittype(String impunittype) {
        this.impunittype = impunittype;
    }

    private String impinterior;

    
    @Column(name = "IMPINTERIOR", nullable = true, insertable = true, updatable = true, length = 30)
    public String getImpinterior() {
        return impinterior;
    }

    public void setImpinterior(String impinterior) {
        this.impinterior = impinterior;
    }

    private String roofcover;

    
    @Column(name = "ROOFCOVER", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRoofcover() {
        return roofcover;
    }

    public void setRoofcover(String roofcover) {
        this.roofcover = roofcover;
    }

    private String rooftype;

    
    @Column(name = "ROOFTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRooftype() {
        return rooftype;
    }

    public void setRooftype(String rooftype) {
        this.rooftype = rooftype;
    }

    private BigInteger inventoryoverrideflag;

    
    @Column(name = "INVENTORYOVERRIDEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getInventoryoverrideflag() {
        return inventoryoverrideflag;
    }

    public void setInventoryoverrideflag(BigInteger inventoryoverrideflag) {
        this.inventoryoverrideflag = inventoryoverrideflag;
    }

    private BigDecimal zonedarea;

    
    @Column(name = "ZONEDAREA", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getZonedarea() {
        return zonedarea;
    }

    public void setZonedarea(BigDecimal zonedarea) {
        this.zonedarea = zonedarea;
    }

    private String nbhdcode1;

    
    @Column(name = "NBHDCODE1", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdcode1() {
        return nbhdcode1;
    }

    public void setNbhdcode1(String nbhdcode1) {
        this.nbhdcode1 = nbhdcode1;
    }

    private String nbhdcode2;

    
    @Column(name = "NBHDCODE2", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdcode2() {
        return nbhdcode2;
    }

    public void setNbhdcode2(String nbhdcode2) {
        this.nbhdcode2 = nbhdcode2;
    }

    private String nbhdcode3;

    
    @Column(name = "NBHDCODE3", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdcode3() {
        return nbhdcode3;
    }

    public void setNbhdcode3(String nbhdcode3) {
        this.nbhdcode3 = nbhdcode3;
    }

    private String nbhdcode4;

    
    @Column(name = "NBHDCODE4", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdcode4() {
        return nbhdcode4;
    }

    public void setNbhdcode4(String nbhdcode4) {
        this.nbhdcode4 = nbhdcode4;
    }

    private String nbhdextension1;

    
    @Column(name = "NBHDEXTENSION1", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdextension1() {
        return nbhdextension1;
    }

    public void setNbhdextension1(String nbhdextension1) {
        this.nbhdextension1 = nbhdextension1;
    }

    private String nbhdextension2;

    
    @Column(name = "NBHDEXTENSION2", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdextension2() {
        return nbhdextension2;
    }

    public void setNbhdextension2(String nbhdextension2) {
        this.nbhdextension2 = nbhdextension2;
    }

    private String nbhdextension3;

    
    @Column(name = "NBHDEXTENSION3", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdextension3() {
        return nbhdextension3;
    }

    public void setNbhdextension3(String nbhdextension3) {
        this.nbhdextension3 = nbhdextension3;
    }

    private String nbhdextension4;

    
    @Column(name = "NBHDEXTENSION4", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdextension4() {
        return nbhdextension4;
    }

    public void setNbhdextension4(String nbhdextension4) {
        this.nbhdextension4 = nbhdextension4;
    }

    private Integer occcode1;

    
    @Column(name = "OCCCODE1", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getOcccode1() {
        return occcode1;
    }

    public void setOcccode1(Integer occcode1) {
        this.occcode1 = occcode1;
    }

    private Integer occcode2;

    
    @Column(name = "OCCCODE2", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getOcccode2() {
        return occcode2;
    }

    public void setOcccode2(Integer occcode2) {
        this.occcode2 = occcode2;
    }

    private Integer occcode3;

    
    @Column(name = "OCCCODE3", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getOcccode3() {
        return occcode3;
    }

    public void setOcccode3(Integer occcode3) {
        this.occcode3 = occcode3;
    }

    private BigDecimal acctadjsaleprice;

    
    @Column(name = "ACCTADJSALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAcctadjsaleprice() {
        return acctadjsaleprice;
    }

    public void setAcctadjsaleprice(BigDecimal acctadjsaleprice) {
        this.acctadjsaleprice = acctadjsaleprice;
    }

    private BigDecimal timeadjsaleprice;

    
    @Column(name = "TIMEADJSALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTimeadjsaleprice() {
        return timeadjsaleprice;
    }

    public void setTimeadjsaleprice(BigDecimal timeadjsaleprice) {
        this.timeadjsaleprice = timeadjsaleprice;
    }

    private String deedcode;

    
    @Column(name = "DEEDCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getDeedcode() {
        return deedcode;
    }

    public void setDeedcode(String deedcode) {
        this.deedcode = deedcode;
    }

    private BigInteger valid1Flag;

    
    @Column(name = "VALID1FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid1Flag() {
        return valid1Flag;
    }

    public void setValid1Flag(BigInteger valid1Flag) {
        this.valid1Flag = valid1Flag;
    }

    private BigInteger valid2Flag;

    
    @Column(name = "VALID2FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid2Flag() {
        return valid2Flag;
    }

    public void setValid2Flag(BigInteger valid2Flag) {
        this.valid2Flag = valid2Flag;
    }

    private String excludecode1;

    
    @Column(name = "EXCLUDECODE1", nullable = true, insertable = true, updatable = true, length = 10)
    public String getExcludecode1() {
        return excludecode1;
    }

    public void setExcludecode1(String excludecode1) {
        this.excludecode1 = excludecode1;
    }

    private String excludecode2;

    
    @Column(name = "EXCLUDECODE2", nullable = true, insertable = true, updatable = true, length = 10)
    public String getExcludecode2() {
        return excludecode2;
    }

    public void setExcludecode2(String excludecode2) {
        this.excludecode2 = excludecode2;
    }

    private BigInteger improvedflag;

    
    @Column(name = "IMPROVEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getImprovedflag() {
        return improvedflag;
    }

    public void setImprovedflag(BigInteger improvedflag) {
        this.improvedflag = improvedflag;
    }

    private BigInteger confirmedflag;

    
    @Column(name = "CONFIRMEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getConfirmedflag() {
        return confirmedflag;
    }

    public void setConfirmedflag(BigInteger confirmedflag) {
        this.confirmedflag = confirmedflag;
    }

    private String businessname;

    
    @Column(name = "BUSINESSNAME", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    private String streetno;

    
    @Column(name = "STREETNO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getStreetno() {
        return streetno;
    }

    public void setStreetno(String streetno) {
        this.streetno = streetno;
    }

    private String predirection;

    
    @Column(name = "PREDIRECTION", nullable = true, insertable = true, updatable = true, length = 2)
    public String getPredirection() {
        return predirection;
    }

    public void setPredirection(String predirection) {
        this.predirection = predirection;
    }

    private String streetname;

    
    @Column(name = "STREETNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    private String streettype;

    
    @Column(name = "STREETTYPE", nullable = true, insertable = true, updatable = true, length = 4)
    public String getStreettype() {
        return streettype;
    }

    public void setStreettype(String streettype) {
        this.streettype = streettype;
    }

    private String postdirection;

    
    @Column(name = "POSTDIRECTION", nullable = true, insertable = true, updatable = true, length = 2)
    public String getPostdirection() {
        return postdirection;
    }

    public void setPostdirection(String postdirection) {
        this.postdirection = postdirection;
    }

    private String propertycity;

    
    @Column(name = "PROPERTYCITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPropertycity() {
        return propertycity;
    }

    public void setPropertycity(String propertycity) {
        this.propertycity = propertycity;
    }

    private String propertyzipcode;

    
    @Column(name = "PROPERTYZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPropertyzipcode() {
        return propertyzipcode;
    }

    public void setPropertyzipcode(String propertyzipcode) {
        this.propertyzipcode = propertyzipcode;
    }

    private BigDecimal outbuildingcount;

    
    @Column(name = "OUTBUILDINGCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getOutbuildingcount() {
        return outbuildingcount;
    }

    public void setOutbuildingcount(BigDecimal outbuildingcount) {
        this.outbuildingcount = outbuildingcount;
    }

    private BigDecimal landexcesssf;

    
    @Column(name = "LANDEXCESSSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandexcesssf() {
        return landexcesssf;
    }

    public void setLandexcesssf(BigDecimal landexcesssf) {
        this.landexcesssf = landexcesssf;
    }

    private String approachtype;

    
    @Column(name = "APPROACHTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getApproachtype() {
        return approachtype;
    }

    public void setApproachtype(String approachtype) {
        this.approachtype = approachtype;
    }

    private String floorcover;

    
    @Column(name = "FLOORCOVER", nullable = true, insertable = true, updatable = true, length = 30)
    public String getFloorcover() {
        return floorcover;
    }

    public void setFloorcover(String floorcover) {
        this.floorcover = floorcover;
    }

    private BigDecimal condoimppercent;

    
    @Column(name = "CONDOIMPPERCENT", nullable = false, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCondoimppercent() {
        return condoimppercent;
    }

    public void setCondoimppercent(BigDecimal condoimppercent) {
        this.condoimppercent = condoimppercent;
    }

    private BigDecimal finalsf;

    
    @Column(name = "FINALSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getFinalsf() {
        return finalsf;
    }

    public void setFinalsf(BigDecimal finalsf) {
        this.finalsf = finalsf;
    }

    private BigDecimal finalsfvalueper;

    
    @Column(name = "FINALSFVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getFinalsfvalueper() {
        return finalsfvalueper;
    }

    public void setFinalsfvalueper(BigDecimal finalsfvalueper) {
        this.finalsfvalueper = finalsfvalueper;
    }

    private BigDecimal zonedareavalueper;

    
    @Column(name = "ZONEDAREAVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getZonedareavalueper() {
        return zonedareavalueper;
    }

    public void setZonedareavalueper(BigDecimal zonedareavalueper) {
        this.zonedareavalueper = zonedareavalueper;
    }

    private BigInteger groupinventoryflag;

    
    @Column(name = "GROUPINVENTORYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getGroupinventoryflag() {
        return groupinventoryflag;
    }

    public void setGroupinventoryflag(BigInteger groupinventoryflag) {
        this.groupinventoryflag = groupinventoryflag;
    }

    private String grantorname1;

    
    @Column(name = "GRANTORNAME1", nullable = true, insertable = true, updatable = true, length = 80)
    public String getGrantorname1() {
        return grantorname1;
    }

    public void setGrantorname1(String grantorname1) {
        this.grantorname1 = grantorname1;
    }

    private String grantorname2;

    
    @Column(name = "GRANTORNAME2", nullable = true, insertable = true, updatable = true, length = 60)
    public String getGrantorname2() {
        return grantorname2;
    }

    public void setGrantorname2(String grantorname2) {
        this.grantorname2 = grantorname2;
    }

    private String grantoraddress1;

    
    @Column(name = "GRANTORADDRESS1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGrantoraddress1() {
        return grantoraddress1;
    }

    public void setGrantoraddress1(String grantoraddress1) {
        this.grantoraddress1 = grantoraddress1;
    }

    private String grantoraddress2;

    
    @Column(name = "GRANTORADDRESS2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGrantoraddress2() {
        return grantoraddress2;
    }

    public void setGrantoraddress2(String grantoraddress2) {
        this.grantoraddress2 = grantoraddress2;
    }

    private String grantorcity;

    
    @Column(name = "GRANTORCITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGrantorcity() {
        return grantorcity;
    }

    public void setGrantorcity(String grantorcity) {
        this.grantorcity = grantorcity;
    }

    private String grantorstatecode;

    
    @Column(name = "GRANTORSTATECODE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getGrantorstatecode() {
        return grantorstatecode;
    }

    public void setGrantorstatecode(String grantorstatecode) {
        this.grantorstatecode = grantorstatecode;
    }

    private String grantorzipcode;

    
    @Column(name = "GRANTORZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getGrantorzipcode() {
        return grantorzipcode;
    }

    public void setGrantorzipcode(String grantorzipcode) {
        this.grantorzipcode = grantorzipcode;
    }

    private String subdivisionname;

    
    @Column(name = "SUBDIVISIONNAME", nullable = true, insertable = true, updatable = true, length = 255)
    public String getSubdivisionname() {
        return subdivisionname;
    }

    public void setSubdivisionname(String subdivisionname) {
        this.subdivisionname = subdivisionname;
    }

    private String lot;

    
    @Column(name = "LOT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    private String block;

    
    @Column(name = "BLOCK", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    private String filingno;

    
    @Column(name = "FILINGNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getFilingno() {
        return filingno;
    }

    public void setFilingno(String filingno) {
        this.filingno = filingno;
    }

    private String tract;

    
    @Column(name = "TRACT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTract() {
        return tract;
    }

    public void setTract(String tract) {
        this.tract = tract;
    }

    private String legaldescription;

    
    @Column(name = "LEGALDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 4000)
    public String getLegaldescription() {
        return legaldescription;
    }

    public void setLegaldescription(String legaldescription) {
        this.legaldescription = legaldescription;
    }

    private String granteename1;

    
    @Column(name = "GRANTEENAME1", nullable = true, insertable = true, updatable = true, length = 80)
    public String getGranteename1() {
        return granteename1;
    }

    public void setGranteename1(String granteename1) {
        this.granteename1 = granteename1;
    }

    private String granteename2;

    
    @Column(name = "GRANTEENAME2", nullable = true, insertable = true, updatable = true, length = 60)
    public String getGranteename2() {
        return granteename2;
    }

    public void setGranteename2(String granteename2) {
        this.granteename2 = granteename2;
    }

    private String granteeaddress1;

    
    @Column(name = "GRANTEEADDRESS1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGranteeaddress1() {
        return granteeaddress1;
    }

    public void setGranteeaddress1(String granteeaddress1) {
        this.granteeaddress1 = granteeaddress1;
    }

    private String granteeaddress2;

    
    @Column(name = "GRANTEEADDRESS2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGranteeaddress2() {
        return granteeaddress2;
    }

    public void setGranteeaddress2(String granteeaddress2) {
        this.granteeaddress2 = granteeaddress2;
    }

    private String granteecity;

    
    @Column(name = "GRANTEECITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGranteecity() {
        return granteecity;
    }

    public void setGranteecity(String granteecity) {
        this.granteecity = granteecity;
    }

    private String granteestatecode;

    
    @Column(name = "GRANTEESTATECODE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getGranteestatecode() {
        return granteestatecode;
    }

    public void setGranteestatecode(String granteestatecode) {
        this.granteestatecode = granteestatecode;
    }

    private String granteezipcode;

    
    @Column(name = "GRANTEEZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getGranteezipcode() {
        return granteezipcode;
    }

    public void setGranteezipcode(String granteezipcode) {
        this.granteezipcode = granteezipcode;
    }

    private BigDecimal saleinventoryon0;

    
    @Column(name = "SALEINVENTORYON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventoryon0() {
        return saleinventoryon0;
    }

    public void setSaleinventoryon0(BigDecimal saleinventoryon0) {
        this.saleinventoryon0 = saleinventoryon0;
    }

    private BigDecimal saleinventoryon1;

    
    @Column(name = "SALEINVENTORYON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventoryon1() {
        return saleinventoryon1;
    }

    public void setSaleinventoryon1(BigDecimal saleinventoryon1) {
        this.saleinventoryon1 = saleinventoryon1;
    }

    private BigDecimal saleinventoryon2;

    
    @Column(name = "SALEINVENTORYON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventoryon2() {
        return saleinventoryon2;
    }

    public void setSaleinventoryon2(BigDecimal saleinventoryon2) {
        this.saleinventoryon2 = saleinventoryon2;
    }

    private String occcodedescription1;

    
    @Column(name = "OCCCODEDESCRIPTION1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getOcccodedescription1() {
        return occcodedescription1;
    }

    public void setOcccodedescription1(String occcodedescription1) {
        this.occcodedescription1 = occcodedescription1;
    }

    private String occcodedescription2;

    
    @Column(name = "OCCCODEDESCRIPTION2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getOcccodedescription2() {
        return occcodedescription2;
    }

    public void setOcccodedescription2(String occcodedescription2) {
        this.occcodedescription2 = occcodedescription2;
    }

    private String occcodedescription3;

    
    @Column(name = "OCCCODEDESCRIPTION3", nullable = true, insertable = true, updatable = true, length = 50)
    public String getOcccodedescription3() {
        return occcodedescription3;
    }

    public void setOcccodedescription3(String occcodedescription3) {
        this.occcodedescription3 = occcodedescription3;
    }

    private Timestamp saleinventoryod0;

    
    @Column(name = "SALEINVENTORYOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleinventoryod0() {
        return saleinventoryod0;
    }

    public void setSaleinventoryod0(Timestamp saleinventoryod0) {
        this.saleinventoryod0 = saleinventoryod0;
    }

    private Timestamp saleinventoryod1;

    
    @Column(name = "SALEINVENTORYOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleinventoryod1() {
        return saleinventoryod1;
    }

    public void setSaleinventoryod1(Timestamp saleinventoryod1) {
        this.saleinventoryod1 = saleinventoryod1;
    }

    private String saleinventoryom0;

    
    @Column(name = "SALEINVENTORYOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventoryom0() {
        return saleinventoryom0;
    }

    public void setSaleinventoryom0(String saleinventoryom0) {
        this.saleinventoryom0 = saleinventoryom0;
    }

    private String saleinventoryom1;

    
    @Column(name = "SALEINVENTORYOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventoryom1() {
        return saleinventoryom1;
    }

    public void setSaleinventoryom1(String saleinventoryom1) {
        this.saleinventoryom1 = saleinventoryom1;
    }

    private String saleinventoryot0;

    
    @Column(name = "SALEINVENTORYOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventoryot0() {
        return saleinventoryot0;
    }

    public void setSaleinventoryot0(String saleinventoryot0) {
        this.saleinventoryot0 = saleinventoryot0;
    }

    private String saleinventoryot1;

    
    @Column(name = "SALEINVENTORYOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventoryot1() {
        return saleinventoryot1;
    }

    public void setSaleinventoryot1(String saleinventoryot1) {
        this.saleinventoryot1 = saleinventoryot1;
    }

    private BigDecimal landnetff;

    
    @Column(name = "LANDNETFF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandnetff() {
        return landnetff;
    }

    public void setLandnetff(BigDecimal landnetff) {
        this.landnetff = landnetff;
    }

    private int jurisdictionid;

    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String outofareasalejurisdiction;

    
    @Column(name = "OUTOFAREASALEJURISDICTION", nullable = true, insertable = true, updatable = true, length = 30)
    public String getOutofareasalejurisdiction() {
        return outofareasalejurisdiction;
    }

    public void setOutofareasalejurisdiction(String outofareasalejurisdiction) {
        this.outofareasalejurisdiction = outofareasalejurisdiction;
    }

    private Timestamp lastupdated;

    
    @Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    private String granteeprovince;

    
    @Column(name = "GRANTEEPROVINCE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGranteeprovince() {
        return granteeprovince;
    }

    public void setGranteeprovince(String granteeprovince) {
        this.granteeprovince = granteeprovince;
    }

    private String granteecountry;

    
    @Column(name = "GRANTEECOUNTRY", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGranteecountry() {
        return granteecountry;
    }

    public void setGranteecountry(String granteecountry) {
        this.granteecountry = granteecountry;
    }

    private String granteepostalcode;

    
    @Column(name = "GRANTEEPOSTALCODE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGranteepostalcode() {
        return granteepostalcode;
    }

    public void setGranteepostalcode(String granteepostalcode) {
        this.granteepostalcode = granteepostalcode;
    }

    private BigDecimal occcompletedpct;

    
    @Column(name = "OCCCOMPLETEDPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getOcccompletedpct() {
        return occcompletedpct;
    }

    public void setOcccompletedpct(BigDecimal occcompletedpct) {
        this.occcompletedpct = occcompletedpct;
    }

    private String primaryusecode;

    
    @Column(name = "PRIMARYUSECODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPrimaryusecode() {
        return primaryusecode;
    }

    public void setPrimaryusecode(String primaryusecode) {
        this.primaryusecode = primaryusecode;
    }

    private String grantorprovince;

    
    @Column(name = "GRANTORPROVINCE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGrantorprovince() {
        return grantorprovince;
    }

    public void setGrantorprovince(String grantorprovince) {
        this.grantorprovince = grantorprovince;
    }

    private String grantorcountry;

    
    @Column(name = "GRANTORCOUNTRY", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGrantorcountry() {
        return grantorcountry;
    }

    public void setGrantorcountry(String grantorcountry) {
        this.grantorcountry = grantorcountry;
    }

    private String grantorpostalcode;

    
    @Column(name = "GRANTORPOSTALCODE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGrantorpostalcode() {
        return grantorpostalcode;
    }

    public void setGrantorpostalcode(String grantorpostalcode) {
        this.grantorpostalcode = grantorpostalcode;
    }

    private BigDecimal landnetunitcount;

    
    @Column(name = "LANDNETUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandnetunitcount() {
        return landnetunitcount;
    }

    public void setLandnetunitcount(BigDecimal landnetunitcount) {
        this.landnetunitcount = landnetunitcount;
    }

    private BigDecimal totalfinishedsf;

    
    @Column(name = "TOTALFINISHEDSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotalfinishedsf() {
        return totalfinishedsf;
    }

    public void setTotalfinishedsf(BigDecimal totalfinishedsf) {
        this.totalfinishedsf = totalfinishedsf;
    }

    private BigDecimal totalunfinishedsf;

    
    @Column(name = "TOTALUNFINISHEDSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotalunfinishedsf() {
        return totalunfinishedsf;
    }

    public void setTotalunfinishedsf(BigDecimal totalunfinishedsf) {
        this.totalunfinishedsf = totalunfinishedsf;
    }

    private Integer bltascode;

    
    @Column(name = "BLTASCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBltascode() {
        return bltascode;
    }

    public void setBltascode(Integer bltascode) {
        this.bltascode = bltascode;
    }

    private BigDecimal saleratio;

    
    @Column(name = "SALERATIO", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getSaleratio() {
        return saleratio;
    }

    public void setSaleratio(BigDecimal saleratio) {
        this.saleratio = saleratio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleInventory that = (SaleInventory) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctadjsaleprice != null ? !acctadjsaleprice.equals(that.acctadjsaleprice) : that.acctadjsaleprice != null)
            return false;
        if (acctadjsalevalueper != null ? !acctadjsalevalueper.equals(that.acctadjsalevalueper) : that.acctadjsalevalueper != null)
            return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null)
            return false;
        if (adjsaleprice != null ? !adjsaleprice.equals(that.adjsaleprice) : that.adjsaleprice != null)
            return false;
        if (adjustedyearbuilt != null ? !adjustedyearbuilt.equals(that.adjustedyearbuilt) : that.adjustedyearbuilt != null)
            return false;
        if (approachtype != null ? !approachtype.equals(that.approachtype) : that.approachtype != null)
            return false;
        if (bathcount != null ? !bathcount.equals(that.bathcount) : that.bathcount != null)
            return false;
        if (bedroomcount != null ? !bedroomcount.equals(that.bedroomcount) : that.bedroomcount != null)
            return false;
        if (block != null ? !block.equals(that.block) : that.block != null)
            return false;
        if (bltascode != null ? !bltascode.equals(that.bltascode) : that.bltascode != null)
            return false;
        if (bltasdescription != null ? !bltasdescription.equals(that.bltasdescription) : that.bltasdescription != null)
            return false;
        if (bltastotalunitcount != null ? !bltastotalunitcount.equals(that.bltastotalunitcount) : that.bltastotalunitcount != null)
            return false;
        if (bltasyearbuilt != null ? !bltasyearbuilt.equals(that.bltasyearbuilt) : that.bltasyearbuilt != null)
            return false;
        if (businessname != null ? !businessname.equals(that.businessname) : that.businessname != null)
            return false;
        if (classcode != null ? !classcode.equals(that.classcode) : that.classcode != null)
            return false;
        if (commercialsf != null ? !commercialsf.equals(that.commercialsf) : that.commercialsf != null)
            return false;
        if (condoimppercent != null ? !condoimppercent.equals(that.condoimppercent) : that.condoimppercent != null)
            return false;
        if (condoimpsf != null ? !condoimpsf.equals(that.condoimpsf) : that.condoimpsf != null)
            return false;
        if (confirmedflag != null ? !confirmedflag.equals(that.confirmedflag) : that.confirmedflag != null)
            return false;
        if (deedcode != null ? !deedcode.equals(that.deedcode) : that.deedcode != null)
            return false;
        if (economicareacode != null ? !economicareacode.equals(that.economicareacode) : that.economicareacode != null)
            return false;
        if (effectiveage != null ? !effectiveage.equals(that.effectiveage) : that.effectiveage != null)
            return false;
        if (excludecode1 != null ? !excludecode1.equals(that.excludecode1) : that.excludecode1 != null)
            return false;
        if (excludecode2 != null ? !excludecode2.equals(that.excludecode2) : that.excludecode2 != null)
            return false;
        if (filingno != null ? !filingno.equals(that.filingno) : that.filingno != null)
            return false;
        if (finalsf != null ? !finalsf.equals(that.finalsf) : that.finalsf != null)
            return false;
        if (finalsfvalueper != null ? !finalsfvalueper.equals(that.finalsfvalueper) : that.finalsfvalueper != null)
            return false;
        if (fixturecount != null ? !fixturecount.equals(that.fixturecount) : that.fixturecount != null)
            return false;
        if (floorcover != null ? !floorcover.equals(that.floorcover) : that.floorcover != null)
            return false;
        if (granteeaddress1 != null ? !granteeaddress1.equals(that.granteeaddress1) : that.granteeaddress1 != null)
            return false;
        if (granteeaddress2 != null ? !granteeaddress2.equals(that.granteeaddress2) : that.granteeaddress2 != null)
            return false;
        if (granteecity != null ? !granteecity.equals(that.granteecity) : that.granteecity != null)
            return false;
        if (granteecountry != null ? !granteecountry.equals(that.granteecountry) : that.granteecountry != null)
            return false;
        if (granteename1 != null ? !granteename1.equals(that.granteename1) : that.granteename1 != null)
            return false;
        if (granteename2 != null ? !granteename2.equals(that.granteename2) : that.granteename2 != null)
            return false;
        if (granteepostalcode != null ? !granteepostalcode.equals(that.granteepostalcode) : that.granteepostalcode != null)
            return false;
        if (granteeprovince != null ? !granteeprovince.equals(that.granteeprovince) : that.granteeprovince != null)
            return false;
        if (granteestatecode != null ? !granteestatecode.equals(that.granteestatecode) : that.granteestatecode != null)
            return false;
        if (granteezipcode != null ? !granteezipcode.equals(that.granteezipcode) : that.granteezipcode != null)
            return false;
        if (grantoraddress1 != null ? !grantoraddress1.equals(that.grantoraddress1) : that.grantoraddress1 != null)
            return false;
        if (grantoraddress2 != null ? !grantoraddress2.equals(that.grantoraddress2) : that.grantoraddress2 != null)
            return false;
        if (grantorcity != null ? !grantorcity.equals(that.grantorcity) : that.grantorcity != null)
            return false;
        if (grantorcountry != null ? !grantorcountry.equals(that.grantorcountry) : that.grantorcountry != null)
            return false;
        if (grantorname1 != null ? !grantorname1.equals(that.grantorname1) : that.grantorname1 != null)
            return false;
        if (grantorname2 != null ? !grantorname2.equals(that.grantorname2) : that.grantorname2 != null)
            return false;
        if (grantorpostalcode != null ? !grantorpostalcode.equals(that.grantorpostalcode) : that.grantorpostalcode != null)
            return false;
        if (grantorprovince != null ? !grantorprovince.equals(that.grantorprovince) : that.grantorprovince != null)
            return false;
        if (grantorstatecode != null ? !grantorstatecode.equals(that.grantorstatecode) : that.grantorstatecode != null)
            return false;
        if (grantorzipcode != null ? !grantorzipcode.equals(that.grantorzipcode) : that.grantorzipcode != null)
            return false;
        if (groupinventoryflag != null ? !groupinventoryflag.equals(that.groupinventoryflag) : that.groupinventoryflag != null)
            return false;
        if (hvactype != null ? !hvactype.equals(that.hvactype) : that.hvactype != null)
            return false;
        if (impabstractcode != null ? !impabstractcode.equals(that.impabstractcode) : that.impabstractcode != null)
            return false;
        if (impbltasother != null ? !impbltasother.equals(that.impbltasother) : that.impbltasother != null)
            return false;
        if (impconditiontype != null ? !impconditiontype.equals(that.impconditiontype) : that.impconditiontype != null)
            return false;
        if (impcount != null ? !impcount.equals(that.impcount) : that.impcount != null)
            return false;
        if (impexterior != null ? !impexterior.equals(that.impexterior) : that.impexterior != null)
            return false;
        if (impinterior != null ? !impinterior.equals(that.impinterior) : that.impinterior != null)
            return false;
        if (impquality != null ? !impquality.equals(that.impquality) : that.impquality != null)
            return false;
        if (improvedflag != null ? !improvedflag.equals(that.improvedflag) : that.improvedflag != null)
            return false;
        if (impunittype != null ? !impunittype.equals(that.impunittype) : that.impunittype != null)
            return false;
        if (inventoryeffectivedate != null ? !inventoryeffectivedate.equals(that.inventoryeffectivedate) : that.inventoryeffectivedate != null)
            return false;
        if (inventoryoverrideflag != null ? !inventoryoverrideflag.equals(that.inventoryoverrideflag) : that.inventoryoverrideflag != null)
            return false;
        if (landabstractcode != null ? !landabstractcode.equals(that.landabstractcode) : that.landabstractcode != null)
            return false;
        if (landcertificationcode != null ? !landcertificationcode.equals(that.landcertificationcode) : that.landcertificationcode != null)
            return false;
        if (landexcesssf != null ? !landexcesssf.equals(that.landexcesssf) : that.landexcesssf != null)
            return false;
        if (landgrossacrecount != null ? !landgrossacrecount.equals(that.landgrossacrecount) : that.landgrossacrecount != null)
            return false;
        if (landgrossff != null ? !landgrossff.equals(that.landgrossff) : that.landgrossff != null)
            return false;
        if (landgrosssf != null ? !landgrosssf.equals(that.landgrosssf) : that.landgrosssf != null)
            return false;
        if (landgrossunitcount != null ? !landgrossunitcount.equals(that.landgrossunitcount) : that.landgrossunitcount != null)
            return false;
        if (landnetacrecount != null ? !landnetacrecount.equals(that.landnetacrecount) : that.landnetacrecount != null)
            return false;
        if (landnetff != null ? !landnetff.equals(that.landnetff) : that.landnetff != null)
            return false;
        if (landnetsf != null ? !landnetsf.equals(that.landnetsf) : that.landnetsf != null)
            return false;
        if (landnetunitcount != null ? !landnetunitcount.equals(that.landnetunitcount) : that.landnetunitcount != null)
            return false;
        if (landtype != null ? !landtype.equals(that.landtype) : that.landtype != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (lea != null ? !lea.equals(that.lea) : that.lea != null)
            return false;
        if (legaldescription != null ? !legaldescription.equals(that.legaldescription) : that.legaldescription != null)
            return false;
        if (lot != null ? !lot.equals(that.lot) : that.lot != null)
            return false;
        if (multipleuseflag != null ? !multipleuseflag.equals(that.multipleuseflag) : that.multipleuseflag != null)
            return false;
        if (nbhdcode1 != null ? !nbhdcode1.equals(that.nbhdcode1) : that.nbhdcode1 != null)
            return false;
        if (nbhdcode2 != null ? !nbhdcode2.equals(that.nbhdcode2) : that.nbhdcode2 != null)
            return false;
        if (nbhdcode3 != null ? !nbhdcode3.equals(that.nbhdcode3) : that.nbhdcode3 != null)
            return false;
        if (nbhdcode4 != null ? !nbhdcode4.equals(that.nbhdcode4) : that.nbhdcode4 != null)
            return false;
        if (nbhdextension1 != null ? !nbhdextension1.equals(that.nbhdextension1) : that.nbhdextension1 != null)
            return false;
        if (nbhdextension2 != null ? !nbhdextension2.equals(that.nbhdextension2) : that.nbhdextension2 != null)
            return false;
        if (nbhdextension3 != null ? !nbhdextension3.equals(that.nbhdextension3) : that.nbhdextension3 != null)
            return false;
        if (nbhdextension4 != null ? !nbhdextension4.equals(that.nbhdextension4) : that.nbhdextension4 != null)
            return false;
        if (occcode1 != null ? !occcode1.equals(that.occcode1) : that.occcode1 != null)
            return false;
        if (occcode2 != null ? !occcode2.equals(that.occcode2) : that.occcode2 != null)
            return false;
        if (occcode3 != null ? !occcode3.equals(that.occcode3) : that.occcode3 != null)
            return false;
        if (occcodedescription1 != null ? !occcodedescription1.equals(that.occcodedescription1) : that.occcodedescription1 != null)
            return false;
        if (occcodedescription2 != null ? !occcodedescription2.equals(that.occcodedescription2) : that.occcodedescription2 != null)
            return false;
        if (occcodedescription3 != null ? !occcodedescription3.equals(that.occcodedescription3) : that.occcodedescription3 != null)
            return false;
        if (occcompletedpct != null ? !occcompletedpct.equals(that.occcompletedpct) : that.occcompletedpct != null)
            return false;
        if (outbuildingcount != null ? !outbuildingcount.equals(that.outbuildingcount) : that.outbuildingcount != null)
            return false;
        if (outbuildingsf != null ? !outbuildingsf.equals(that.outbuildingsf) : that.outbuildingsf != null)
            return false;
        if (outofareasalejurisdiction != null ? !outofareasalejurisdiction.equals(that.outofareasalejurisdiction) : that.outofareasalejurisdiction != null)
            return false;
        if (parcelno != null ? !parcelno.equals(that.parcelno) : that.parcelno != null)
            return false;
        if (physicalage != null ? !physicalage.equals(that.physicalage) : that.physicalage != null)
            return false;
        if (plattedflag != null ? !plattedflag.equals(that.plattedflag) : that.plattedflag != null)
            return false;
        if (postdirection != null ? !postdirection.equals(that.postdirection) : that.postdirection != null)
            return false;
        if (predirection != null ? !predirection.equals(that.predirection) : that.predirection != null)
            return false;
        if (primaryusecode != null ? !primaryusecode.equals(that.primaryusecode) : that.primaryusecode != null)
            return false;
        if (prioryeartaxrollactualamt != null ? !prioryeartaxrollactualamt.equals(that.prioryeartaxrollactualamt) : that.prioryeartaxrollactualamt != null)
            return false;
        if (prioryeartaxrollassessed != null ? !prioryeartaxrollassessed.equals(that.prioryeartaxrollassessed) : that.prioryeartaxrollassessed != null)
            return false;
        if (propertycity != null ? !propertycity.equals(that.propertycity) : that.propertycity != null)
            return false;
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null)
            return false;
        if (propertyzipcode != null ? !propertyzipcode.equals(that.propertyzipcode) : that.propertyzipcode != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (residentialsf != null ? !residentialsf.equals(that.residentialsf) : that.residentialsf != null)
            return false;
        if (roofcover != null ? !roofcover.equals(that.roofcover) : that.roofcover != null)
            return false;
        if (rooftype != null ? !rooftype.equals(that.rooftype) : that.rooftype != null)
            return false;
        if (roomcount != null ? !roomcount.equals(that.roomcount) : that.roomcount != null)
            return false;
        if (saledate != null ? !saledate.equals(that.saledate) : that.saledate != null)
            return false;
        if (saleinventoryod0 != null ? !saleinventoryod0.equals(that.saleinventoryod0) : that.saleinventoryod0 != null)
            return false;
        if (saleinventoryod1 != null ? !saleinventoryod1.equals(that.saleinventoryod1) : that.saleinventoryod1 != null)
            return false;
        if (saleinventoryom0 != null ? !saleinventoryom0.equals(that.saleinventoryom0) : that.saleinventoryom0 != null)
            return false;
        if (saleinventoryom1 != null ? !saleinventoryom1.equals(that.saleinventoryom1) : that.saleinventoryom1 != null)
            return false;
        if (saleinventoryon0 != null ? !saleinventoryon0.equals(that.saleinventoryon0) : that.saleinventoryon0 != null)
            return false;
        if (saleinventoryon1 != null ? !saleinventoryon1.equals(that.saleinventoryon1) : that.saleinventoryon1 != null)
            return false;
        if (saleinventoryon2 != null ? !saleinventoryon2.equals(that.saleinventoryon2) : that.saleinventoryon2 != null)
            return false;
        if (saleinventoryot0 != null ? !saleinventoryot0.equals(that.saleinventoryot0) : that.saleinventoryot0 != null)
            return false;
        if (saleinventoryot1 != null ? !saleinventoryot1.equals(that.saleinventoryot1) : that.saleinventoryot1 != null)
            return false;
        if (saleprice != null ? !saleprice.equals(that.saleprice) : that.saleprice != null)
            return false;
        if (saleratio != null ? !saleratio.equals(that.saleratio) : that.saleratio != null)
            return false;
        if (salevalueper != null ? !salevalueper.equals(that.salevalueper) : that.salevalueper != null)
            return false;
        if (streetname != null ? !streetname.equals(that.streetname) : that.streetname != null)
            return false;
        if (streetno != null ? !streetno.equals(that.streetno) : that.streetno != null)
            return false;
        if (streettype != null ? !streettype.equals(that.streettype) : that.streettype != null)
            return false;
        if (subdivision != null ? !subdivision.equals(that.subdivision) : that.subdivision != null)
            return false;
        if (subdivisionname != null ? !subdivisionname.equals(that.subdivisionname) : that.subdivisionname != null)
            return false;
        if (timeadjsaleprice != null ? !timeadjsaleprice.equals(that.timeadjsaleprice) : that.timeadjsaleprice != null)
            return false;
        if (totalacctvaluetimeofsale != null ? !totalacctvaluetimeofsale.equals(that.totalacctvaluetimeofsale) : that.totalacctvaluetimeofsale != null)
            return false;
        if (totalfinishedsf != null ? !totalfinishedsf.equals(that.totalfinishedsf) : that.totalfinishedsf != null)
            return false;
        if (totalimpsf != null ? !totalimpsf.equals(that.totalimpsf) : that.totalimpsf != null)
            return false;
        if (totallandvaluetimeofsale != null ? !totallandvaluetimeofsale.equals(that.totallandvaluetimeofsale) : that.totallandvaluetimeofsale != null)
            return false;
        if (totalunfinishedsf != null ? !totalunfinishedsf.equals(that.totalunfinishedsf) : that.totalunfinishedsf != null)
            return false;
        if (tract != null ? !tract.equals(that.tract) : that.tract != null)
            return false;
        if (unitname != null ? !unitname.equals(that.unitname) : that.unitname != null)
            return false;
        if (valid1Flag != null ? !valid1Flag.equals(that.valid1Flag) : that.valid1Flag != null)
            return false;
        if (valid2Flag != null ? !valid2Flag.equals(that.valid2Flag) : that.valid2Flag != null)
            return false;
        if (valueareacode != null ? !valueareacode.equals(that.valueareacode) : that.valueareacode != null)
            return false;
        if (zonedarea != null ? !zonedarea.equals(that.zonedarea) : that.zonedarea != null)
            return false;
        if (zonedareavalueper != null ? !zonedareavalueper.equals(that.zonedareavalueper) : that.zonedareavalueper != null)
            return false;
        if (zoningcode != null ? !zoningcode.equals(that.zoningcode) : that.zoningcode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptionno != null ? receptionno.hashCode() : 0;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (parcelno != null ? parcelno.hashCode() : 0);
        result = 31 * result + (inventoryeffectivedate != null ? inventoryeffectivedate.hashCode() : 0);
        result = 31 * result + (saledate != null ? saledate.hashCode() : 0);
        result = 31 * result + (saleprice != null ? saleprice.hashCode() : 0);
        result = 31 * result + (adjsaleprice != null ? adjsaleprice.hashCode() : 0);
        result = 31 * result + (salevalueper != null ? salevalueper.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (economicareacode != null ? economicareacode.hashCode() : 0);
        result = 31 * result + (lea != null ? lea.hashCode() : 0);
        result = 31 * result + (subdivision != null ? subdivision.hashCode() : 0);
        result = 31 * result + (valueareacode != null ? valueareacode.hashCode() : 0);
        result = 31 * result + (propertytype != null ? propertytype.hashCode() : 0);
        result = 31 * result + (impconditiontype != null ? impconditiontype.hashCode() : 0);
        result = 31 * result + (impquality != null ? impquality.hashCode() : 0);
        result = 31 * result + (impabstractcode != null ? impabstractcode.hashCode() : 0);
        result = 31 * result + (bltasdescription != null ? bltasdescription.hashCode() : 0);
        result = 31 * result + (bltasyearbuilt != null ? bltasyearbuilt.hashCode() : 0);
        result = 31 * result + (physicalage != null ? physicalage.hashCode() : 0);
        result = 31 * result + (adjustedyearbuilt != null ? adjustedyearbuilt.hashCode() : 0);
        result = 31 * result + (effectiveage != null ? effectiveage.hashCode() : 0);
        result = 31 * result + (impexterior != null ? impexterior.hashCode() : 0);
        result = 31 * result + (classcode != null ? classcode.hashCode() : 0);
        result = 31 * result + (impcount != null ? impcount.hashCode() : 0);
        result = 31 * result + (bltastotalunitcount != null ? bltastotalunitcount.hashCode() : 0);
        result = 31 * result + (roomcount != null ? roomcount.hashCode() : 0);
        result = 31 * result + (bedroomcount != null ? bedroomcount.hashCode() : 0);
        result = 31 * result + (bathcount != null ? bathcount.hashCode() : 0);
        result = 31 * result + (fixturecount != null ? fixturecount.hashCode() : 0);
        result = 31 * result + (totalimpsf != null ? totalimpsf.hashCode() : 0);
        result = 31 * result + (residentialsf != null ? residentialsf.hashCode() : 0);
        result = 31 * result + (commercialsf != null ? commercialsf.hashCode() : 0);
        result = 31 * result + (condoimpsf != null ? condoimpsf.hashCode() : 0);
        result = 31 * result + (outbuildingsf != null ? outbuildingsf.hashCode() : 0);
        result = 31 * result + (impbltasother != null ? impbltasother.hashCode() : 0);
        result = 31 * result + (landnetsf != null ? landnetsf.hashCode() : 0);
        result = 31 * result + (multipleuseflag != null ? multipleuseflag.hashCode() : 0);
        result = 31 * result + (landtype != null ? landtype.hashCode() : 0);
        result = 31 * result + (landabstractcode != null ? landabstractcode.hashCode() : 0);
        result = 31 * result + (landcertificationcode != null ? landcertificationcode.hashCode() : 0);
        result = 31 * result + (landgrossacrecount != null ? landgrossacrecount.hashCode() : 0);
        result = 31 * result + (landgrosssf != null ? landgrosssf.hashCode() : 0);
        result = 31 * result + (landgrossff != null ? landgrossff.hashCode() : 0);
        result = 31 * result + (landgrossunitcount != null ? landgrossunitcount.hashCode() : 0);
        result = 31 * result + (zoningcode != null ? zoningcode.hashCode() : 0);
        result = 31 * result + (plattedflag != null ? plattedflag.hashCode() : 0);
        result = 31 * result + (unitname != null ? unitname.hashCode() : 0);
        result = 31 * result + (acctadjsalevalueper != null ? acctadjsalevalueper.hashCode() : 0);
        result = 31 * result + (totallandvaluetimeofsale != null ? totallandvaluetimeofsale.hashCode() : 0);
        result = 31 * result + (totalacctvaluetimeofsale != null ? totalacctvaluetimeofsale.hashCode() : 0);
        result = 31 * result + (prioryeartaxrollactualamt != null ? prioryeartaxrollactualamt.hashCode() : 0);
        result = 31 * result + (prioryeartaxrollassessed != null ? prioryeartaxrollassessed.hashCode() : 0);
        result = 31 * result + (landnetacrecount != null ? landnetacrecount.hashCode() : 0);
        result = 31 * result + (hvactype != null ? hvactype.hashCode() : 0);
        result = 31 * result + (impunittype != null ? impunittype.hashCode() : 0);
        result = 31 * result + (impinterior != null ? impinterior.hashCode() : 0);
        result = 31 * result + (roofcover != null ? roofcover.hashCode() : 0);
        result = 31 * result + (rooftype != null ? rooftype.hashCode() : 0);
        result = 31 * result + (inventoryoverrideflag != null ? inventoryoverrideflag.hashCode() : 0);
        result = 31 * result + (zonedarea != null ? zonedarea.hashCode() : 0);
        result = 31 * result + (nbhdcode1 != null ? nbhdcode1.hashCode() : 0);
        result = 31 * result + (nbhdcode2 != null ? nbhdcode2.hashCode() : 0);
        result = 31 * result + (nbhdcode3 != null ? nbhdcode3.hashCode() : 0);
        result = 31 * result + (nbhdcode4 != null ? nbhdcode4.hashCode() : 0);
        result = 31 * result + (nbhdextension1 != null ? nbhdextension1.hashCode() : 0);
        result = 31 * result + (nbhdextension2 != null ? nbhdextension2.hashCode() : 0);
        result = 31 * result + (nbhdextension3 != null ? nbhdextension3.hashCode() : 0);
        result = 31 * result + (nbhdextension4 != null ? nbhdextension4.hashCode() : 0);
        result = 31 * result + (occcode1 != null ? occcode1.hashCode() : 0);
        result = 31 * result + (occcode2 != null ? occcode2.hashCode() : 0);
        result = 31 * result + (occcode3 != null ? occcode3.hashCode() : 0);
        result = 31 * result + (acctadjsaleprice != null ? acctadjsaleprice.hashCode() : 0);
        result = 31 * result + (timeadjsaleprice != null ? timeadjsaleprice.hashCode() : 0);
        result = 31 * result + (deedcode != null ? deedcode.hashCode() : 0);
        result = 31 * result + (valid1Flag != null ? valid1Flag.hashCode() : 0);
        result = 31 * result + (valid2Flag != null ? valid2Flag.hashCode() : 0);
        result = 31 * result + (excludecode1 != null ? excludecode1.hashCode() : 0);
        result = 31 * result + (excludecode2 != null ? excludecode2.hashCode() : 0);
        result = 31 * result + (improvedflag != null ? improvedflag.hashCode() : 0);
        result = 31 * result + (confirmedflag != null ? confirmedflag.hashCode() : 0);
        result = 31 * result + (businessname != null ? businessname.hashCode() : 0);
        result = 31 * result + (streetno != null ? streetno.hashCode() : 0);
        result = 31 * result + (predirection != null ? predirection.hashCode() : 0);
        result = 31 * result + (streetname != null ? streetname.hashCode() : 0);
        result = 31 * result + (streettype != null ? streettype.hashCode() : 0);
        result = 31 * result + (postdirection != null ? postdirection.hashCode() : 0);
        result = 31 * result + (propertycity != null ? propertycity.hashCode() : 0);
        result = 31 * result + (propertyzipcode != null ? propertyzipcode.hashCode() : 0);
        result = 31 * result + (outbuildingcount != null ? outbuildingcount.hashCode() : 0);
        result = 31 * result + (landexcesssf != null ? landexcesssf.hashCode() : 0);
        result = 31 * result + (approachtype != null ? approachtype.hashCode() : 0);
        result = 31 * result + (floorcover != null ? floorcover.hashCode() : 0);
        result = 31 * result + (condoimppercent != null ? condoimppercent.hashCode() : 0);
        result = 31 * result + (finalsf != null ? finalsf.hashCode() : 0);
        result = 31 * result + (finalsfvalueper != null ? finalsfvalueper.hashCode() : 0);
        result = 31 * result + (zonedareavalueper != null ? zonedareavalueper.hashCode() : 0);
        result = 31 * result + (groupinventoryflag != null ? groupinventoryflag.hashCode() : 0);
        result = 31 * result + (grantorname1 != null ? grantorname1.hashCode() : 0);
        result = 31 * result + (grantorname2 != null ? grantorname2.hashCode() : 0);
        result = 31 * result + (grantoraddress1 != null ? grantoraddress1.hashCode() : 0);
        result = 31 * result + (grantoraddress2 != null ? grantoraddress2.hashCode() : 0);
        result = 31 * result + (grantorcity != null ? grantorcity.hashCode() : 0);
        result = 31 * result + (grantorstatecode != null ? grantorstatecode.hashCode() : 0);
        result = 31 * result + (grantorzipcode != null ? grantorzipcode.hashCode() : 0);
        result = 31 * result + (subdivisionname != null ? subdivisionname.hashCode() : 0);
        result = 31 * result + (lot != null ? lot.hashCode() : 0);
        result = 31 * result + (block != null ? block.hashCode() : 0);
        result = 31 * result + (filingno != null ? filingno.hashCode() : 0);
        result = 31 * result + (tract != null ? tract.hashCode() : 0);
        result = 31 * result + (legaldescription != null ? legaldescription.hashCode() : 0);
        result = 31 * result + (granteename1 != null ? granteename1.hashCode() : 0);
        result = 31 * result + (granteename2 != null ? granteename2.hashCode() : 0);
        result = 31 * result + (granteeaddress1 != null ? granteeaddress1.hashCode() : 0);
        result = 31 * result + (granteeaddress2 != null ? granteeaddress2.hashCode() : 0);
        result = 31 * result + (granteecity != null ? granteecity.hashCode() : 0);
        result = 31 * result + (granteestatecode != null ? granteestatecode.hashCode() : 0);
        result = 31 * result + (granteezipcode != null ? granteezipcode.hashCode() : 0);
        result = 31 * result + (saleinventoryon0 != null ? saleinventoryon0.hashCode() : 0);
        result = 31 * result + (saleinventoryon1 != null ? saleinventoryon1.hashCode() : 0);
        result = 31 * result + (saleinventoryon2 != null ? saleinventoryon2.hashCode() : 0);
        result = 31 * result + (occcodedescription1 != null ? occcodedescription1.hashCode() : 0);
        result = 31 * result + (occcodedescription2 != null ? occcodedescription2.hashCode() : 0);
        result = 31 * result + (occcodedescription3 != null ? occcodedescription3.hashCode() : 0);
        result = 31 * result + (saleinventoryod0 != null ? saleinventoryod0.hashCode() : 0);
        result = 31 * result + (saleinventoryod1 != null ? saleinventoryod1.hashCode() : 0);
        result = 31 * result + (saleinventoryom0 != null ? saleinventoryom0.hashCode() : 0);
        result = 31 * result + (saleinventoryom1 != null ? saleinventoryom1.hashCode() : 0);
        result = 31 * result + (saleinventoryot0 != null ? saleinventoryot0.hashCode() : 0);
        result = 31 * result + (saleinventoryot1 != null ? saleinventoryot1.hashCode() : 0);
        result = 31 * result + (landnetff != null ? landnetff.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (outofareasalejurisdiction != null ? outofareasalejurisdiction.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + (granteeprovince != null ? granteeprovince.hashCode() : 0);
        result = 31 * result + (granteecountry != null ? granteecountry.hashCode() : 0);
        result = 31 * result + (granteepostalcode != null ? granteepostalcode.hashCode() : 0);
        result = 31 * result + (occcompletedpct != null ? occcompletedpct.hashCode() : 0);
        result = 31 * result + (primaryusecode != null ? primaryusecode.hashCode() : 0);
        result = 31 * result + (grantorprovince != null ? grantorprovince.hashCode() : 0);
        result = 31 * result + (grantorcountry != null ? grantorcountry.hashCode() : 0);
        result = 31 * result + (grantorpostalcode != null ? grantorpostalcode.hashCode() : 0);
        result = 31 * result + (landnetunitcount != null ? landnetunitcount.hashCode() : 0);
        result = 31 * result + (totalfinishedsf != null ? totalfinishedsf.hashCode() : 0);
        result = 31 * result + (totalunfinishedsf != null ? totalunfinishedsf.hashCode() : 0);
        result = 31 * result + (bltascode != null ? bltascode.hashCode() : 0);
        result = 31 * result + (saleratio != null ? saleratio.hashCode() : 0);
        return result;
    }
}
