/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.services;

import com.pinarApi.pinarApi.modelo.DetalleInformeModel;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import java.util.List;
/**
 *
 * @author User
 */
public interface HistorialClinicoService {
    
        List<DetalleInformeModel> buscarHistorialInformePorDni(String dni);

}
