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
public class HistorialClinicoServiceImpl {
    @Autowired @Qualifier("historialClinicoRepository")
    private HistorialClinicoRepository historialClinicoRepository;
    
    public List<HistorialClinicoModel> listAll(){
        List<HistorialClinico> lista= historialClinicoRepository.findAll();
        List<HistorialClinicoModel> model=new ArrayList<>();
        for(HistorialClinico h:lista){
            model.add(HistorialClinicoConverter.historialClinicoToModel(h));
        }
        return model;
    }
}
