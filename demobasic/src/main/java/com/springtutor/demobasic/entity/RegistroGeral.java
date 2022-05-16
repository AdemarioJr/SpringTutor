package com.springtutor.demobasic.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroGeral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "rgnumero", nullable = false)
    private String rgNumber;
    @Column(name = "nome")
    private String name;
    @Column(name = "pai", nullable = false)
    private String nameFather;
    @Column(name = "mae", nullable = false)
    private String nameMother;
    @Column(name = "datacadastro", nullable = false)
    private Date datecreation;
    @Column(name = "datavalidade", nullable = true)
    private Date expirationdate;
    @Column(name = "estadoexpedicao", nullable = true)
    private Date expeditionstate;

    public RegistroGeral() {
    }

    public RegistroGeral(Long id, String rgNumber, String name, String nameDad, String nameMon,
            Date dtCreation, Date expirationdate, Date state) {
        Date current = new Date();

        this.rgNumber = rgNumber;
        this.nameFather = nameDad;
        this.name = name;
        this.nameMother = nameMon;
        this.datecreation = current;
        this.expirationdate = current;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRgNumber() {
        return rgNumber;
    }

    public void setRgNumber(String rgNumber) {
        this.rgNumber = rgNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Date getExpeditionstate() {
        return expeditionstate;
    }

    public void setExpeditionstate(Date expeditionstate) {
        this.expeditionstate = expeditionstate;
    }

    @Override
    public String toString() {
        return "RegistroGeral [datecreation=" + datecreation + ", expeditionstate=" + expeditionstate
                + ", expirationdate=" + expirationdate + ", id=" + id + ", name=" + name + ", nameFather=" + nameFather
                + ", nameMother=" + nameMother + ", rgNumber=" + rgNumber + "]";
    }

}
