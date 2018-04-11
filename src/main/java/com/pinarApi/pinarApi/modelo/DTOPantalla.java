/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DTOPantalla {
    private String nombrePaciente;
    private String dniPaciente;
    private byte[] fotoPaciente;
    private List<DTODetalleInforme> listInformes=new ArrayList<>();
    
    public DTOPantalla() {
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dni) {
        this.dniPaciente = dni;
    }

    public byte[] getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(byte[] foto) {
        this.fotoPaciente = foto;
    }

    public List<DTODetalleInforme> getListInformes() {
        return listInformes;
    }

    public void setListInformes(List<DTODetalleInforme> listInforme) {
        this.listInformes = listInforme;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    
    
       
}
