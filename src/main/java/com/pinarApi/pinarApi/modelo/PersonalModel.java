/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class PersonalModel {
    
    private Long id;
    private String apellido;
    private String dni;
    private Date fechaAlta;
    private Date fechaBaja;
    private String nombre;
    private RolModel rol;
    private AreaModel area;
    private List<EspecialidadModel> especialidad;

    public PersonalModel() {
    }

    public List<EspecialidadModel> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<EspecialidadModel> especialidad) {
        this.especialidad = especialidad;
    }
    
    public RolModel getRol() {
        return rol;
    }

    public void setRol(RolModel rol) {
        this.rol = rol;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaModel getArea() {
        return area;
    }

    public void setArea(AreaModel area) {
        this.area = area;
    }
}
