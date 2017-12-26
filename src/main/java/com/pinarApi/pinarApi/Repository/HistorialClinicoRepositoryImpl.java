/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.pinarApi.pinarApi.entidades.HistorialClinico;
import javax.transaction.Transactional;

/**
 *
 * @author User
 */
@Transactional
public class HistorialClinicoRepositoryImpl implements HistorialClinicoRepositoryCustom {
    
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public HistorialClinico buscarHistorialPorDni(String dni) {
        Query query = entityManager.createNativeQuery("select h from HistorialClinico h " +
                "where h.paciente.dni =:dni ", HistorialClinico.class);
        query.setParameter("dni", dni);
        return (HistorialClinico)query.getSingleResult();
    }
    
    
    
}
