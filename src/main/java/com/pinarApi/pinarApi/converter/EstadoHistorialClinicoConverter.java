/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.EstadoHistorialClinico;
import com.pinarApi.pinarApi.modelo.EstadoHistorialClinicoModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */

public class EstadoHistorialClinicoConverter {
    public static EstadoHistorialClinicoModel estadoHistorialClinicoToModel(EstadoHistorialClinico estado){
        EstadoHistorialClinicoModel eh=new EstadoHistorialClinicoModel();
        eh.setId(estado.getId());
        eh.setNombre(estado.getNombre());
        return eh;
    }
    public static EstadoHistorialClinico modelToEstadoHistorial(EstadoHistorialClinicoModel estado){
        EstadoHistorialClinico eh= new EstadoHistorialClinico();
        eh.setId(estado.getId());
        eh.setNombre(estado.getNombre());
        return eh;
    }
}
