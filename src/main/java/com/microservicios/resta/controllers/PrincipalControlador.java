package com.microservicios.resta.controllers;

import com.microservicios.resta.models.OperadoresDigitos;
import com.microservicios.resta.services.CalculaRestaServicio;
import org.springframework.web.bind.annotation.*;

/**
 * @author Felipe Garrido
 */
@RestController
public class PrincipalControlador {

    @PostMapping(value = "/resta", consumes = "application/json", produces = "application/json")
    public OperadoresDigitos restar(@RequestBody OperadoresDigitos operadoresDigitos) throws Exception {
        CalculaRestaServicio calculaRestaServicio = new CalculaRestaServicio();
        OperadoresDigitos operadoresDigitosRetorno = calculaRestaServicio.calcularResta(operadoresDigitos);
        return operadoresDigitosRetorno;
    }
}
