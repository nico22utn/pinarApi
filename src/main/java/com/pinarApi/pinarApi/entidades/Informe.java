/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
@Table(name="informe")
public class Informe implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name="fechaElaboracion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaElaboracion;
    @Column(name="numero")
    private int numero;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Personal personal;
    @ManyToOne
    private HistorialClinico historialClinico;
    
    public Informe() {
    }

    public Long getId() {
        return id;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public int getNumero() {
        return numero;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

}

