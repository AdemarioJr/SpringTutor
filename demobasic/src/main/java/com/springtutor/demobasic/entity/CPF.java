package com.springtutor.demobasic.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CPF implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpfnumero", nullable = false)
    private String cpfNumber;

    @Column(name = "datacadastro", nullable = false)
    private Instant datecreation = Instant.now();

    @Column(name = "dataexpedicao", nullable = false)
    private Date dateexpedition;

    @Column(name = "estadoorigem", nullable = false)
    private String origemstate;

    public CPF() {
    }

    public CPF(Long id, String cpfNumber, Date dateexpedition, String origemstate) {

        this.id = id;
        this.cpfNumber = cpfNumber;
        this.datecreation = Instant.now();
        this.dateexpedition = dateexpedition;
        this.origemstate = origemstate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
    }

    public Instant getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Instant datecreation) {
        this.datecreation = datecreation;
    }

    public Date getDateexpedition() {
        return dateexpedition;
    }

    public void setDateexpedition(Date dateexpedition) {
        this.dateexpedition = dateexpedition;
    }

    public String getOrigemstate() {
        return origemstate;
    }

    public void setOrigemstate(String origemstate) {
        this.origemstate = origemstate;
    }

    @Override
    public String toString() {
        return "CPF [cpfNumber=" + cpfNumber + ", datecreation=" + datecreation + ", dateexpedition=" + dateexpedition
                + ", id=" + id + ", origemstate=" + origemstate + "]";
    }

}
