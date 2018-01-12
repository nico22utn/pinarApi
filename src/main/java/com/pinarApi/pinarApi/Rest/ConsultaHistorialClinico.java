/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinarApi.pinarApi.Rest;

import com.pinarApi.pinarApi.modelo.DTOPantalla;
import com.pinarApi.pinarApi.modelo.DetalleInformeModel;
import com.pinarApi.pinarApi.modelo.HistorialClinicoModel;
import com.pinarApi.pinarApi.services.HistorialClinicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/historialClinico")
public class ConsultaHistorialClinico {
    
    @Autowired @Qualifier("HistorialClinicoServiceImpl")
    private HistorialClinicoService historialClinicoService;
    
    @GetMapping("/find")
    public ResponseEntity<DTOPantalla> getFindEntityCliente
        (@RequestParam(value="dni",required=true) String dni){
            DTOPantalla list = historialClinicoService.buscarHistorialInformePorDni(dni);
            return new ResponseEntity<DTOPantalla>(list, HttpStatus.OK);
    }
    
}
