/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.modelo;

/**
 *
 * @author User
 */
public class HistorialClinicoModel {
    
    private Long id;
    private PacienteModel paciente;
    private HistorialClinicoEstadoModel historialEstado;

    public HistorialClinicoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public HistorialClinicoEstadoModel getHistorialEstado() {
        return historialEstado;
    }

    public void setHistorialEstado(HistorialClinicoEstadoModel historialEstado) {
        this.historialEstado = historialEstado;
    }
    
    
}
