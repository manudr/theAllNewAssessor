package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnsaledocumentPK implements Serializable {
    private String receptionno;
    private String documentid;
    private int jurisdictionid;

    @Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    @Id
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    @Column(name = "DOCUMENTID", nullable = false, insertable = true, updatable = true, length = 50)
    @Id
    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

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

        TbnsaledocumentPK that = (TbnsaledocumentPK) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (documentid != null ? !documentid.equals(that.documentid) : that.documentid != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptionno != null ? receptionno.hashCode() : 0;
        result = 31 * result + (documentid != null ? documentid.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        return result;
    }
}
