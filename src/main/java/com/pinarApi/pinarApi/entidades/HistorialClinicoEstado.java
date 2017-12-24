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

/**
 *
 * @author User
 */
@Entity
@Table(name="historialclinicoestado")
public class HistorialClinicoEstado {
    @Id @GeneratedValue
    private Long id;
    @Column
    private Date fechaEstado;
    @ManyToOne
    private EstadoHistorialClinico estadoHistorialClinico;
    

    public HistorialClinicoEstado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoHistorialClinico getEstadoHistorialClinico() {
        return estadoHistorialClinico;
    }

    public void setEstadoHistorialClinico(EstadoHistorialClinico estadoHistorialClinico) {
        this.estadoHistorialClinico = estadoHistorialClinico;
    }

    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

  
}
