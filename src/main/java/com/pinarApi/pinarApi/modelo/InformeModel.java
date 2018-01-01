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
public class InformeModel {
    
    private Long id;
    private Date fechaElaboracion;
    private int numero;
    private PacienteModel paciente;
    private PersonalModel personal;
    private HistorialClinicoModel historialClinico;
    
    public InformeModel() {
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

    public PacienteModel getPaciente() {
        return paciente;
    }

    public PersonalModel getPersonal() {
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

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public void setPersonal(PersonalModel personal) {
        this.personal = personal;
    }

    public HistorialClinicoModel getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinicoModel historialClinico) {
        this.historialClinico = historialClinico;
    }
}
