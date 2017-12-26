/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.HistorialClinico;

/**
 *
 * @author User
 */
public interface HistorialClinicoRepositoryCustom {
    HistorialClinico buscarHistorialPorDni(String dni);
}
