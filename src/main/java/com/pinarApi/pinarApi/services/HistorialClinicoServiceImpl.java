/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.services;

import com.pinarApi.pinarApi.Repository.DetalleInformeRepository;
import com.pinarApi.pinarApi.Repository.HistorialClinicoRepository;
import com.pinarApi.pinarApi.Repository.InformeRepository;
import com.pinarApi.pinarApi.Repository.PacienteRepository;
import com.pinarApi.pinarApi.converter.DetalleInformeConverter;
import com.pinarApi.pinarApi.converter.HistorialClinicoConverter;
import com.pinarApi.pinarApi.entidades.DetalleInforme;
import com.pinarApi.pinarApi.entidades.DetalleInforme.TipoInforme;
import com.pinarApi.pinarApi.entidades.HistorialClinico;
import com.pinarApi.pinarApi.entidades.Informe;
import com.pinarApi.pinarApi.entidades.Paciente;
import com.pinarApi.pinarApi.modelo.DetalleInformeModel;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    @Autowired
    private InformeRepository informeRepository;
    @Autowired
    private DetalleInformeRepository detalleInformeRepository;
    @Override
    public List<DetalleInformeModel> buscarHistorialInformePorDni(String dni) {
        
        Paciente paciente = pacienteRepository.findByDni(dni);
        HistorialClinico historial =historialClinicoRepository.findByPaciente(paciente);
        List<Informe> listInforme=informeRepository.findByHistorialClinico(historial);
        List<DetalleInforme> list=new ArrayList<>();
        for(Informe i:listInforme){
            List<DetalleInforme> listAux=new ArrayList<>();
            listAux=detalleInformeRepository.findByInformeAndTipoInforme(i, TipoInforme.BASICO);
            list.addAll(listAux);
        }
        //List<Long> ids=new ArrayList<>();
        //ids= entityManager.createQuery("SELECT i.id FROM Informe i where i.historialClinico=:h ").setParameter("h", historial).getResultList();
        //List<DetalleInforme> list=entityManager.createQuery("SELECT * FROM DetalleInforme de where de.informe.id in :ids AND de.tipoInforme=:tipo").setParameter("ids",ids).setParameter("tipo",TipoInforme.BASICO).getResultList();
        List<DetalleInformeModel> listConverter=new ArrayList<>();
        for(DetalleInforme d: list){
            DetalleInformeModel model=DetalleInformeConverter.detalleInformeToModel(d);
            listConverter.add(model);
        }
        return listConverter;
    }
    
    
}
