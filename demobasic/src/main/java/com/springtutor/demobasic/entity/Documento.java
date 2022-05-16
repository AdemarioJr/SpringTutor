package com.springtutor.demobasic.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;
//import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nomefornecedor", nullable = false)
    private String name_provider;

    @Column(name = "observacao")
    private String observation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_rg_id")
    private RegistroGeral rg;

    @Column(name = "datacadastro", nullable = false)
    private Instant datecreation = Instant.now();

    public Documento() {
    }

    public Documento(String name_provider, String observation, RegistroGeral rg, Instant datecreation) {
        this.name_provider = name_provider;
        this.observation = observation;
        this.rg = rg;
        this.datecreation = datecreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_provider() {
        return name_provider;
    }

    public void setName_provider(String name_provider) {
        this.name_provider = name_provider;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public RegistroGeral getRg() {
        return rg;
    }

    public void setRg(RegistroGeral rg) {
        this.rg = rg;
    }

    public Instant getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Instant datecreation) {
        this.datecreation = datecreation;
    }

    @Override
    public String toString() {
        return "Documento [datecreation=" + datecreation + ", id=" + id + ", name_provider=" + name_provider
                + ", observation=" + observation + ", rg=" + rg + "]";
    }

}
