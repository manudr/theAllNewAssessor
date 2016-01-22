package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsubnewparcelabstractlist {
    private int subnewparcelabstractlistid;

    @Id
    @javax.persistence.Column(name = "SUBNEWPARCELABSTRACTLISTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubnewparcelabstractlistid() {
        return subnewparcelabstractlistid;
    }

    public void setSubnewparcelabstractlistid(int subnewparcelabstractlistid) {
        this.subnewparcelabstractlistid = subnewparcelabstractlistid;
    }

    private String subnewparcelno;

    @Basic
    @javax.persistence.Column(name = "SUBNEWPARCELNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubnewparcelno() {
        return subnewparcelno;
    }

    public void setSubnewparcelno(String subnewparcelno) {
        this.subnewparcelno = subnewparcelno;
    }

    private String abstractcode;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTCODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getAbstractcode() {
        return abstractcode;
    }

    public void setAbstractcode(String abstractcode) {
        this.abstractcode = abstractcode;
    }

    private int parcelsequence;

    @Basic
    @javax.persistence.Column(name = "PARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getParcelsequence() {
        return parcelsequence;
    }

    public void setParcelsequence(int parcelsequence) {
        this.parcelsequence = parcelsequence;
    }

    private int subparcelrangedefaultid;

    @Basic
    @javax.persistence.Column(name = "SUBPARCELRANGEDEFAULTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubparcelrangedefaultid() {
        return subparcelrangedefaultid;
    }

    public void setSubparcelrangedefaultid(int subparcelrangedefaultid) {
        this.subparcelrangedefaultid = subparcelrangedefaultid;
    }

    private String landclass;

    @Basic
    @javax.persistence.Column(name = "LANDCLASS", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandclass() {
        return landclass;
    }

    public void setLandclass(String landclass) {
        this.landclass = landclass;
    }

    private String landsubclass;

    @Basic
    @javax.persistence.Column(name = "LANDSUBCLASS", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandsubclass() {
        return landsubclass;
    }

    public void setLandsubclass(String landsubclass) {
        this.landsubclass = landsubclass;
    }

    private BigDecimal landacres;

    @Basic
    @javax.persistence.Column(name = "LANDACRES", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandacres() {
        return landacres;
    }

    public void setLandacres(BigDecimal landacres) {
        this.landacres = landacres;
    }

    private BigDecimal landsf;

    @Basic
    @javax.persistence.Column(name = "LANDSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandsf() {
        return landsf;
    }

    public void setLandsf(BigDecimal landsf) {
        this.landsf = landsf;
    }

    private BigDecimal landff;

    @Basic
    @javax.persistence.Column(name = "LANDFF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandff() {
        return landff;
    }

    public void setLandff(BigDecimal landff) {
        this.landff = landff;
    }

    private BigDecimal landunitcount;

    @Basic
    @javax.persistence.Column(name = "LANDUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandunitcount() {
        return landunitcount;
    }

    public void setLandunitcount(BigDecimal landunitcount) {
        this.landunitcount = landunitcount;
    }

    private String block;

    @Basic
    @javax.persistence.Column(name = "BLOCK", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    private String lot;

    @Basic
    @javax.persistence.Column(name = "LOT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    private String tract;

    @Basic
    @javax.persistence.Column(name = "TRACT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTract() {
        return tract;
    }

    public void setTract(String tract) {
        this.tract = tract;
    }

    private String newaccountno;

    @Basic
    @javax.persistence.Column(name = "NEWACCOUNTNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getNewaccountno() {
        return newaccountno;
    }

    public void setNewaccountno(String newaccountno) {
        this.newaccountno = newaccountno;
    }

    private String owneraccountno;

    @Basic
    @javax.persistence.Column(name = "OWNERACCOUNTNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getOwneraccountno() {
        return owneraccountno;
    }

    public void setOwneraccountno(String owneraccountno) {
        this.owneraccountno = owneraccountno;
    }

    private BigDecimal landoverridetotal;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDETOTAL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandoverridetotal() {
        return landoverridetotal;
    }

    public void setLandoverridetotal(BigDecimal landoverridetotal) {
        this.landoverridetotal = landoverridetotal;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "NOTE", nullable = true, insertable = true, updatable = true, length = 4000)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String assignedto;

    @Basic
    @javax.persistence.Column(name = "ASSIGNEDTO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    private int jurisdictionid;

    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String legal;

    @Basic
    @javax.persistence.Column(name = "LEGAL", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    private Timestamp lastupdated;

    @Basic
    @javax.persistence.Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbnsubnewparcelabstractlist that = (Tbnsubnewparcelabstractlist) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (parcelsequence != that.parcelsequence) return false;
        if (subnewparcelabstractlistid != that.subnewparcelabstractlistid)
            return false;
        if (subparcelrangedefaultid != that.subparcelrangedefaultid)
            return false;
        if (abstractcode != null ? !abstractcode.equals(that.abstractcode) : that.abstractcode != null)
            return false;
        if (assignedto != null ? !assignedto.equals(that.assignedto) : that.assignedto != null)
            return false;
        if (block != null ? !block.equals(that.block) : that.block != null)
            return false;
        if (landacres != null ? !landacres.equals(that.landacres) : that.landacres != null)
            return false;
        if (landclass != null ? !landclass.equals(that.landclass) : that.landclass != null)
            return false;
        if (landff != null ? !landff.equals(that.landff) : that.landff != null)
            return false;
        if (landoverridetotal != null ? !landoverridetotal.equals(that.landoverridetotal) : that.landoverridetotal != null)
            return false;
        if (landsf != null ? !landsf.equals(that.landsf) : that.landsf != null)
            return false;
        if (landsubclass != null ? !landsubclass.equals(that.landsubclass) : that.landsubclass != null)
            return false;
        if (landunitcount != null ? !landunitcount.equals(that.landunitcount) : that.landunitcount != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (legal != null ? !legal.equals(that.legal) : that.legal != null)
            return false;
        if (lot != null ? !lot.equals(that.lot) : that.lot != null)
            return false;
        if (newaccountno != null ? !newaccountno.equals(that.newaccountno) : that.newaccountno != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null)
            return false;
        if (owneraccountno != null ? !owneraccountno.equals(that.owneraccountno) : that.owneraccountno != null)
            return false;
        if (subnewparcelno != null ? !subnewparcelno.equals(that.subnewparcelno) : that.subnewparcelno != null)
            return false;
        if (tract != null ? !tract.equals(that.tract) : that.tract != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subnewparcelabstractlistid;
        result = 31 * result + (subnewparcelno != null ? subnewparcelno.hashCode() : 0);
        result = 31 * result + (abstractcode != null ? abstractcode.hashCode() : 0);
        result = 31 * result + parcelsequence;
        result = 31 * result + subparcelrangedefaultid;
        result = 31 * result + (landclass != null ? landclass.hashCode() : 0);
        result = 31 * result + (landsubclass != null ? landsubclass.hashCode() : 0);
        result = 31 * result + (landacres != null ? landacres.hashCode() : 0);
        result = 31 * result + (landsf != null ? landsf.hashCode() : 0);
        result = 31 * result + (landff != null ? landff.hashCode() : 0);
        result = 31 * result + (landunitcount != null ? landunitcount.hashCode() : 0);
        result = 31 * result + (block != null ? block.hashCode() : 0);
        result = 31 * result + (lot != null ? lot.hashCode() : 0);
        result = 31 * result + (tract != null ? tract.hashCode() : 0);
        result = 31 * result + (newaccountno != null ? newaccountno.hashCode() : 0);
        result = 31 * result + (owneraccountno != null ? owneraccountno.hashCode() : 0);
        result = 31 * result + (landoverridetotal != null ? landoverridetotal.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (assignedto != null ? assignedto.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (legal != null ? legal.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
