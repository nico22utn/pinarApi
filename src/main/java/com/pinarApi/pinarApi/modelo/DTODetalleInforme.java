/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.modelo;

/**
 *
 * @author Nicolas
 */
public class DTODetalleInforme {
    private String informe;
    private byte[] fotoInforme;
    private DTOMedico medico;
    
    public DTODetalleInforme() {
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public byte[] getFotoInforme() {
        return fotoInforme;
    }

    public void setFotoInforme(byte[] fotoInforme) {
        this.fotoInforme = fotoInforme;
    }

    public DTOMedico getMedico() {
        return medico;
    }

    public void setMedico(DTOMedico medico) {
        this.medico = medico;
    }
    
}
