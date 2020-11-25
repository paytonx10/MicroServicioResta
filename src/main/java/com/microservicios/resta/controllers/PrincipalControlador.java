package com.microservicios.resta.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalControlador {
    @RequestMapping("/restar")
    public Integer restar(@RequestParam(value="calculoRestar") String valores) {
        String[] valoresArr = valores.split(",");
        int valoresRes = Integer.valueOf(valoresArr[0]) - Integer.valueOf(valoresArr[1]);
        System.out.println("Resta: "+valoresRes);
        return valoresRes;
    }
}
