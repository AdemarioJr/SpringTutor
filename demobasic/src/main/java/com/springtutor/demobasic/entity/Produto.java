package com.springtutor.demobasic.entity;

import javax.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nomecomercial", nullable = false)
    private String name;
    @Column(name = "descricao")
    private String description;
    @Column(name = "nomefornecedor", nullable = false)
    private String name_provider;
    @Column(name = "datacadastro", nullable = false)
    private Date datecreation;
    @Column(name = "datavalidade", nullable = true)
    private Date expirationdate;

    public Produto() {
    }

    public Produto(Long id, String name, String description, String name_provider, Date datecreation,
            Date expirationdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.name_provider = name_provider;
        this.datecreation = datecreation;
        this.expirationdate = expirationdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName_provider() {
        return name_provider;
    }

    public void setName_provider(String name_provider) {
        this.name_provider = name_provider;
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

}
