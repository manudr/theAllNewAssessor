package us.co.douglas.assessor.model;

/**
 * Created by mdronamr on 2/3/16.
 */
public class Parcel {
    Account account;
    Appeal appeal;
    Sale sale;
    PropertyAddress propertyAddress;
    OwnerAddress ownerAddress;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Appeal getAppeal() {
        return appeal;
    }

    public void setAppeal(Appeal appeal) {
        this.appeal = appeal;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public PropertyAddress getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(PropertyAddress propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public OwnerAddress getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(OwnerAddress ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}
