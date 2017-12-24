/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class HistorialClinicoEstadoModel {
    
    private Long id;
    private Date fechaEstado;
    private EstadoHistorialClinicoModel estadoHistorialClinico;

    public HistorialClinicoEstadoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public EstadoHistorialClinicoModel getEstadoHistorialClinico() {
        return estadoHistorialClinico;
    }

    public void setEstadoHistorialClinico(EstadoHistorialClinicoModel estadoHistorialClinico) {
        this.estadoHistorialClinico = estadoHistorialClinico;
    }
   
    
    
}
