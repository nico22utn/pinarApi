/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/historialService")
public class ConsultaHistorialClinico {
    
    @Autowired @Qualifier("historialClinicoService")
    private HistorialClinicoService historialClinicoService;
    
}
