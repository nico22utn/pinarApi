/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.Informe;
import com.pinarApi.pinarApi.modelo.InformeModel;

/**
 *
 * @author User
 */
public class InformeConverter {
    
    public static InformeModel informeToModel(Informe i){
        InformeModel in=new InformeModel();
        in.setFechaElaboracion(i.getFechaElaboracion()!=null?i.getFechaElaboracion():null);
        in.setPaciente(i.getPaciente()!=null?PacienteConverter.pacienteToModel(i.getPaciente()):null);
        return in;
    }
}
