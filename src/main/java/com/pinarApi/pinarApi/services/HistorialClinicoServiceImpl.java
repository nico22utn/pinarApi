/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.services;

import com.pinarApi.pinarApi.Repository.HistorialClinicoRepository;
import com.pinarApi.pinarApi.converter.HistorialClinicoConverter;
import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author User
 */
public class HistorialClinicoServiceImpl implements HistorialClinicoService {
    @Autowired @Qualifier("historialClinicoRepository")
    private HistorialClinicoRepository historialClinicoRepository;
    @Autowired @Qualifier("historialClinicoConverter")
    private HistorialClinicoConverter historialClinicoConverter;

    @Override
    public HistorialClinicoModel buscarHistorialPorDni(String dni) {
        HistorialClinico h=historialClinicoRepository.buscarHistorialPorDni(dni);
        HistorialClinicoModel model= new HistorialClinicoModel();
        model=HistorialClinicoConverter.historialClinicoToModel(h);
        return model;
    }
    
    
}
