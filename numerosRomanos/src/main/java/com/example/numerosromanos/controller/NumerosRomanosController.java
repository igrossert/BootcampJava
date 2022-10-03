package com.example.numerosromanos.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/converter-numero")
public class NumerosRomanosController {

    public int [] valores = {10, 5, 1};
    public String [] letras = {"X", "V", "I"};

    @GetMapping("/{numero}")
        public String converterNumeroRomano(@PathVariable int numero) {
        String romano="";
        for(int i=0; i<valores.length;i++){
            while(numero>=valores[i]){
                numero-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }

}
