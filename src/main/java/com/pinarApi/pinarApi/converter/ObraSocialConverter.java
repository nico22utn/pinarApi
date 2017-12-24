/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.converter;

import com.pinarApi.pinarApi.entidades.ObraSocial;
import com.pinarApi.pinarApi.modelo.ObraSocialModel;

/**
 *
 * @author User
 */
public class ObraSocialConverter {
    
    public ObraSocialModel obraSocialToModel(ObraSocial obraSocial){
        ObraSocialModel model= new ObraSocialModel();
        model.setCredencialDeAfiliacion(obraSocial.getCredencialDeAfiliacion());
        model.setDisposicionNro(obraSocial.getDisposicionNro());
        model.setDomicilio(obraSocial.getDomicilio());
        model.setEmitidoPor(obraSocial.getEmitidoPor());
        model.setExpedienteNro(obraSocial.getExpedienteNro());
        model.setFechaAltaCredencial(obraSocial.getFechaAltaCredencial());
        model.setFechaEmisionCredencial(obraSocial.getFechaEmisionCredencial());
        model.setFechaVencimientoCredencial(obraSocial.getFechaVencimientoCredencial());
        model.setFechaVigenciaCredencial(obraSocial.getFechaVigenciaCredencial());
        model.setFechaVigenciaMedico(obraSocial.getFechaVigenciaMedico());
        model.setFechaVigenciaModulo(obraSocial.getFechaVigenciaModulo());
        model.setGp(obraSocial.getGp());
        model.setId(obraSocial.getId());
        model.setLocalidad(obraSocial.getLocalidad());
        model.setModuloInternacion(obraSocial.getModuloInternacion());
        model.setNombreObraSocial(obraSocial.getNombreObraSocial());
        model.setNombremedicoCabecera(obraSocial.getNombremedicoCabecera());
        model.setNroModulo(obraSocial.getNroModulo());
        model.setNumeroBeneficio(obraSocial.getNumeroBeneficio());
        model.setNumeroMedicoCabecera(obraSocial.getNumeroMedicoCabecera());
        return model;
    }
    
    public ObraSocial modelToObraSocial(ObraSocialModel modelo){
        ObraSocial obraSocial= new ObraSocial();
        obraSocial.setCredencialDeAfiliacion(modelo.getCredencialDeAfiliacion());
        obraSocial.setDisposicionNro(modelo.getDisposicionNro());
        obraSocial.setDomicilio(modelo.getDomicilio());
        obraSocial.setEmitidoPor(modelo.getEmitidoPor());
        obraSocial.setExpedienteNro(modelo.getExpedienteNro());
        obraSocial.setFechaAltaCredencial(modelo.getFechaAltaCredencial());
        obraSocial.setFechaEmisionCredencial(modelo.getFechaEmisionCredencial());
        obraSocial.setFechaVencimientoCredencial(modelo.getFechaVencimientoCredencial());
        obraSocial.setFechaVigenciaCredencial(modelo.getFechaVigenciaCredencial());
        obraSocial.setFechaVigenciaMedico(modelo.getFechaVigenciaMedico());
        obraSocial.setFechaVigenciaModulo(modelo.getFechaVigenciaModulo());
        obraSocial.setGp(modelo.getGp());
        obraSocial.setId(modelo.getId());
        obraSocial.setLocalidad(modelo.getLocalidad());
        obraSocial.setModuloInternacion(modelo.getModuloInternacion());
        obraSocial.setNombreObraSocial(modelo.getNombreObraSocial());
        obraSocial.setNombremedicoCabecera(modelo.getNombremedicoCabecera());
        obraSocial.setNroModulo(modelo.getNroModulo());
        obraSocial.setNumeroBeneficio(modelo.getNumeroBeneficio());
        obraSocial.setNumeroMedicoCabecera(modelo.getNumeroMedicoCabecera());
        return obraSocial;
    }
}
