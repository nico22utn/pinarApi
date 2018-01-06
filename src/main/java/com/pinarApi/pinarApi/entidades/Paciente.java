/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name="paciente")
public class Paciente {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String apellido;
    @Column
    private Double peso;
    @Column
    private Double talla;
    @Column
    private String dni;
    @Column
    private int edad;
    @Column(name="fechade_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechadeNacimiento;
    @Column(name="fecha_alta")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAlta;
    @Column(name="fecha_baja")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaBaja;
    @Column(name="motivo_baja")
    private String motivoBaja;
    @Lob
    @Column(name="foto",nullable=false)
    private byte[] fotoPaciente;
    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name="obra_social_id")
    private ObraSocial obraSocial;
    
    public Paciente() {
    }

    public Paciente(Long id, String apellido, Double peso, Double talla, String dni, int edad, Date fechadeNacimiento, Date fechaAlta, Date fechaBaja, String motivoBaja, byte[] fotoPaciente, String nombre, ObraSocial obraSocial) {
        this.id = id;
        this.apellido = apellido;
        this.peso = peso;
        this.talla = talla;
        this.dni = dni;
        this.edad = edad;
        this.fechadeNacimiento = fechadeNacimiento;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.fotoPaciente = fotoPaciente;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public Long getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getTalla() {
        return talla;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public byte[] getFotoPaciente() {
        return fotoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public void setFotoPaciente(byte[] fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
            
}
