/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.entidades.Paciente;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface HistorialClinicoRepository extends JpaRepository<HistorialClinico, Serializable>{
    
      public HistorialClinico findByPaciente(Paciente paciente);
}
