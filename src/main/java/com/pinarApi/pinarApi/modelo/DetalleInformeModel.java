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
public class DetalleInformeModel {
    
    public enum TipoInforme {BASICO,AVANZADO};
    private Long id;
    private String informeMedico;
    private InformeModel informe;
    private byte[] fotoPaciente;
    public TipoInforme tipoInforme;
    
    public DetalleInformeModel() {
    }

    public Long getId() {
        return id;
    }

    public String getInformeMedico() {
        return informeMedico;
    }

    public InformeModel getInforme() {
        return informe;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setInformeMedico(String informeMedico) {
        this.informeMedico = informeMedico;
    }

    public void setInforme(InformeModel informe) {
        this.informe = informe;
    }

    public byte[] getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(byte[] fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public void setTipoInforme(TipoInforme tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public TipoInforme getTipoInforme() {
        return tipoInforme;
    }
}
