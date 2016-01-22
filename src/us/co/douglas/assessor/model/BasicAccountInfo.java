package us.co.douglas.assessor.model;

/**
 * Created by mdronamr on 12/29/15.
 */
public class BasicAccountInfo {
    private String accountNo;
    private String parcelNo;
    private String ownerName;
    private String businessName;
    private String businessLicense;
    private String propertyAddress;
    private String ownerAddress;
    private String neighborhood;
    private String subdivisionName;
    private String filingDescription;
    private String location;

    public BasicAccountInfo() {

    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    public String getFilingDescription() {
        return filingDescription;
    }

    public void setFilingDescription(String filingDescription) {
        this.filingDescription = filingDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicAccountInfo)) return false;

        BasicAccountInfo that = (BasicAccountInfo) o;

        if (!accountNo.equals(that.accountNo)) return false;
        if (!propertyAddress.equals(that.propertyAddress)) return false;
        if (!businessLicense.equals(that.businessLicense)) return false;
        if (!businessName.equals(that.businessName)) return false;
        if (!ownerName.equals(that.ownerName)) return false;
        if (!parcelNo.equals(that.parcelNo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountNo.hashCode();
        result = 31 * result + parcelNo.hashCode();
        result = 31 * result + ownerName.hashCode();
        result = 31 * result + businessName.hashCode();
        result = 31 * result + businessLicense.hashCode();
        result = 31 * result + propertyAddress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BasicAccountInfo{" +
                "accountNo='" + accountNo + '\'' +
                ", parcelNo='" + parcelNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                '}';
    }
}
