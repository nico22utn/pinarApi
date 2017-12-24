/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.HistorialClinicoEstado;
import com.pinarApi.pinarApi.modelo.HistorialClinicoEstadoModel;

/**
 *
 * @author User
 */
public class HistorialClinicoEstadoConverter {
 
    public static HistorialClinicoEstadoModel historialClinicoEstadoToModel(HistorialClinicoEstado h){
        HistorialClinicoEstadoModel hc= new HistorialClinicoEstadoModel();
        hc.setId(h.getId());
        hc.setFechaEstado(h.getFechaEstado());
        hc.setEstadoHistorialClinico(EstadoHistorialClinicoConverter.estadoHistorialClinicoToModel(h.getEstadoHistorialClinico()));
        return hc;
    }
    public static HistorialClinicoEstado modelToHistorialClinicoEstado(HistorialClinicoEstadoModel h){
        HistorialClinicoEstado hc=new HistorialClinicoEstado();
        hc.setId(h.getId());
        hc.setFechaEstado(h.getFechaEstado());
        hc.setEstadoHistorialClinico(EstadoHistorialClinicoConverter.modelToEstadoHistorial(h.getEstadoHistorialClinico()));
        return hc;
    }
}
