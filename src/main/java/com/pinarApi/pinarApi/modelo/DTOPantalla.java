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
    private String dni;
    private List<String> informes=new ArrayList<>();
    private byte[] foto;

    public DTOPantalla() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<String> getInformes() {
        return informes;
    }

    public void setInformes(List<String> informes) {
        this.informes = informes;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
}
