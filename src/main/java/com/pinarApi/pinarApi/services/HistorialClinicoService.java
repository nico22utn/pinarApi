/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.services;

import com.pinarApi.pinarApi.modelo.DTOPantalla;
import com.pinarApi.pinarApi.modelo.PacienteModel;

/**
 *
 * @author User
 */
public interface HistorialClinicoService {
    
        DTOPantalla buscarHistorialInformePorDni(String dni);

        PacienteModel buscarPaciente(String dni);

        DTOPantalla buscarHistorialInformePorArea(String dni,String area);

}
