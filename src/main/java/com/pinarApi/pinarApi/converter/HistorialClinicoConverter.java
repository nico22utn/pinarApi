/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;

/**
 *
 * @author User
 */
public class HistorialClinicoConverter {
    
    public static HistorialClinicoModel historialClinicoToModel(HistorialClinico historialClinico){
        HistorialClinicoModel model= new HistorialClinicoModel();
        model.setId(historialClinico.getId());
        model.setPaciente(PacienteConverter.pacienteToModel(historialClinico.getPaciente()));
        model.setHistorialEstado(HistorialClinicoEstadoConverter.historialClinicoEstadoToModel(historialClinico.getHistorial()));
        return model;
    }
    public static HistorialClinico modelToHistorialClinico(HistorialClinicoModel model){
        HistorialClinico historial= new HistorialClinico();
        historial.setId(model.getId());
        historial.setPaciente(PacienteConverter.modelToPaciente(model.getPaciente()));
        return historial;
    }
}
