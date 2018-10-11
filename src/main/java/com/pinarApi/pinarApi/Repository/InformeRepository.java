/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.entidades.Informe;
import java.io.Serializable;
import java.util.List;

import com.pinarApi.pinarApi.entidades.Paciente;
import com.pinarApi.pinarApi.entidades.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface InformeRepository extends JpaRepository<Informe, Serializable>{
    
    public List<Informe> findByHistorialClinico(HistorialClinico historial);

    public List<Informe> findByPersonalAndPaciente(Personal personal, Paciente paciente);

}
