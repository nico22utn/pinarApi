/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.services;

import com.pinarApi.pinarApi.Repository.HistorialClinicoRepository;
import com.pinarApi.pinarApi.Repository.PacienteRepository;
import com.pinarApi.pinarApi.converter.HistorialClinicoConverter;
import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.entidades.Paciente;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service("HistorialClinicoServiceImpl")
public class HistorialClinicoServiceImpl implements HistorialClinicoService {
    @Autowired
    private HistorialClinicoRepository historialClinicoRepository;
    @Autowired
    private HistorialClinicoConverter historialClinicoConverter;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Override
    public HistorialClinicoModel buscarHistorialPorDni(String dni) {
        Paciente paciente = pacienteRepository.findByDni(dni);
        HistorialClinico historial =historialClinicoRepository.findByPaciente(paciente);
        HistorialClinicoModel model= historialClinicoConverter.historialClinicoToModel(historial);
        return model;
    }
    
    
}
