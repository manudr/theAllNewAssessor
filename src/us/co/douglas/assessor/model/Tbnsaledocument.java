package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnsaledocumentPK.class)
public class Tbnsaledocument {
    private String receptionno;
    private String documentid;
    private String title;
    private String documentcode;
    private Timestamp lastupdated;
    private int jurisdictionid;

    @Id
    @Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    @Id
    @Column(name = "DOCUMENTID", nullable = false, insertable = true, updatable = true, length = 50)
    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DOCUMENTCODE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getDocumentcode() {
        return documentcode;
    }

    public void setDocumentcode(String documentcode) {
        this.documentcode = documentcode;
    }

    @Basic
    @Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Id
    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
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

        Tbnsaledocument that = (Tbnsaledocument) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (documentcode != null ? !documentcode.equals(that.documentcode) : that.documentcode != null)
            return false;
        if (documentid != null ? !documentid.equals(that.documentid) : that.documentid != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptionno != null ? receptionno.hashCode() : 0;
        result = 31 * result + (documentid != null ? documentid.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (documentcode != null ? documentcode.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        return result;
    }
}
