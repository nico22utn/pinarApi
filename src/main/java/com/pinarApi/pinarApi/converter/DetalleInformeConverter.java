/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.DetalleInforme;
import com.pinarApi.pinarApi.modelo.DetalleInformeModel;

/**
 *
 * @author User
 */
public class DetalleInformeConverter {
    
    public static DetalleInformeModel detalleInformeToModel(DetalleInforme detalle){
        DetalleInformeModel d= new DetalleInformeModel();
        d.setId(detalle.getId());
        d.setInformeMedico(detalle.getInformeMedico()!=null?detalle.getInformeMedico():"");
        d.setFotoPaciente(detalle.getFotoPaciente()!=null?detalle.getFotoPaciente():null);
        d.setInforme(detalle.getInforme()!=null?InformeConverter.informeToModel(detalle.getInforme()):null);
        return d;
    }
}
