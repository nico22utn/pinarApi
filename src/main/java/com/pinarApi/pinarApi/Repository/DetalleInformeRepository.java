/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.DetalleInforme;
import com.pinarApi.pinarApi.entidades.DetalleInforme.TipoInforme;
import com.pinarApi.pinarApi.entidades.Informe;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface DetalleInformeRepository extends JpaRepository<DetalleInforme, Serializable>{
 
    public List<DetalleInforme> findByInformeAndTipoInforme(Informe informe,TipoInforme tipoInforme);
}
