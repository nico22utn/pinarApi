/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.pinarUtils;

import com.pinarApi.pinarApi.entidades.DetalleInforme;
import com.pinarApi.pinarApi.entidades.Personal;
import com.pinarApi.pinarApi.modelo.DTODetalleInforme;
import com.pinarApi.pinarApi.modelo.DTOMedico;
import java.util.Arrays;

/**
 *
 * @author Nicolas
 */
public class PinarUtils {
     
   //Podrían parametrizarse estos build muy facilmente. Pensarlo para futuro.
   public static DTODetalleInforme buildDTODetalleInforme(DetalleInforme d){
       DTODetalleInforme dto= new DTODetalleInforme();
       if(d!=null){
           dto.setFotoInforme(d.getFotoPaciente()!=null?d.getFotoPaciente():"".getBytes());
           dto.setInforme(d.getInformeMedico()!=null?d.getInformeMedico():"");
           dto.setMedico(d.getInforme().getPersonal()!=null?buildDTOMedico(d.getInforme().getPersonal()):null);
       }
       return dto;
   }
   public static DTOMedico buildDTOMedico(Personal p){
       DTOMedico dto= new DTOMedico();
       if(p!=null){
           dto.setAreaMedico(p.getArea()!=null?p.getArea().getNombreArea():" ");
           dto.setNombreMedico(p.getNombre()!=null?p.getNombre():"");
       }
       return dto;
   }
}
