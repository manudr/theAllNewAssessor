package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnsubaddressPK implements Serializable {
    private String subno;

    @Column(name = "SUBNO", nullable = false, insertable = true, updatable = true, length = 30)
    @Id
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    private String filingno;

    @Column(name = "FILINGNO", nullable = false, insertable = true, updatable = true, length = 30)
    @Id
    public String getFilingno() {
        return filingno;
    }

    public void setFilingno(String filingno) {
        this.filingno = filingno;
    }

    private int addresscode;

    @Column(name = "ADDRESSCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(int addresscode) {
        this.addresscode = addresscode;
    }

    private int jurisdictionid;

    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbnsubaddressPK that = (TbnsubaddressPK) o;

        if (addresscode != that.addresscode) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (filingno != null ? !filingno.equals(that.filingno) : that.filingno != null)
            return false;
        if (subno != null ? !subno.equals(that.subno) : that.subno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subno != null ? subno.hashCode() : 0;
        result = 31 * result + (filingno != null ? filingno.hashCode() : 0);
        result = 31 * result + addresscode;
        result = 31 * result + jurisdictionid;
        return result;
    }
}
