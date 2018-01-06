/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.entidades;


import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="detalleinforme")
public class DetalleInforme implements Serializable{
    
    public enum TipoInforme {BASICO,AVANZADO};
    @Id @GeneratedValue
    private Long id;
    @Column(name="informeMedico")
    private String informeMedico;
    @OneToOne(fetch = FetchType.LAZY)
    private Informe informe;
    @Lob
    @Column(name="foto",nullable=true)
    private byte[] fotoPaciente;
    @Enumerated(EnumType.STRING)
    @Column
    public TipoInforme tipoInforme;
    
    public DetalleInforme() {
    }

    public Long getId() {
        return id;
    }

    public String getInformeMedico() {
        return informeMedico;
    }

    public Informe getInforme() {
        return informe;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setInformeMedico(String informeMedico) {
        this.informeMedico = informeMedico;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public byte[] getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(byte[] fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public void setTipoInforme(TipoInforme tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public TipoInforme getTipoInforme() {
        return tipoInforme;
    }
}
