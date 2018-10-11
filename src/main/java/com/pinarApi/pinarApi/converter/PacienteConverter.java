/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.Paciente;
import com.pinarApi.pinarApi.modelo.PacienteModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
public class PacienteConverter {
    
    public static PacienteModel pacienteToModel(Paciente paciente){
        PacienteModel model=new PacienteModel();
        model.setApellido(paciente.getApellido());
        model.setDni(paciente.getDni());
        model.setEdad(paciente.getEdad());
        model.setFechaAlta(paciente.getFechaAlta());
        model.setFechaBaja(paciente.getFechaBaja());
        model.setFechadeNacimiento(paciente.getFechadeNacimiento());
        model.setId(paciente.getId());
        model.setMotivoBaja(paciente.getMotivoBaja());
        model.setPeso(paciente.getPeso());
        model.setTalla(paciente.getTalla());
        return model;
    }
    public static Paciente modelToPaciente(PacienteModel paciente){
        Paciente model=new Paciente();
        model.setApellido(paciente.getApellido());
        model.setDni(paciente.getDni());
        model.setEdad(paciente.getEdad());
        model.setFechaAlta(paciente.getFechaAlta());
        model.setFechaBaja(paciente.getFechaBaja());
        model.setFechadeNacimiento(paciente.getFechadeNacimiento());
        model.setId(paciente.getId());
        model.setMotivoBaja(paciente.getMotivoBaja());
        model.setPeso(paciente.getPeso());
        model.setTalla(paciente.getTalla());
        return model;
    }
}
