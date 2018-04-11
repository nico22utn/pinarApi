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
import com.pinarApi.pinarApi.modelo.DTODetalleInforme;
import com.pinarApi.pinarApi.modelo.DTOPantalla;
import com.pinarApi.pinarApi.modelo.DetalleInformeModel;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import com.pinarApi.pinarApi.pinarUtils.PinarUtils;
import java.util.ArrayList;
import java.util.Arrays;
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
    public DTOPantalla buscarHistorialInformePorDni(String dni) {
        DTOPantalla dto= new DTOPantalla();
        Paciente paciente = pacienteRepository.findByDni(dni);
        HistorialClinico historial =historialClinicoRepository.findByPaciente(paciente);
        List<Informe> listInforme=informeRepository.findByHistorialClinico(historial);
        dto.setNombrePaciente(paciente.getApellido()+", "+paciente.getNombre());
        dto.setDniPaciente(dni);
        dto.setFotoPaciente(paciente.getFotoPaciente()==null?paciente.getFotoPaciente():null);
        List<DetalleInforme> listAux=new ArrayList<>();
        for(Informe i:listInforme){
            listAux=detalleInformeRepository.findByInformeAndTipoInforme(i, TipoInforme.BASICO);       
        }
        dto.setListInformes(buildListDTO(listAux));
        return dto;
    }
    public List<DTODetalleInforme> buildListDTO(List<DetalleInforme> lista){
        if(lista!=null && !lista.isEmpty()){
            List<DTODetalleInforme> listaReturn= new ArrayList<>();
            for(DetalleInforme d: lista){
                listaReturn.add(PinarUtils.buildDTODetalleInforme(d));
            }
            return listaReturn;
        }
        return new ArrayList(Arrays.asList(new Long(-1)));
    }
    
    
}
