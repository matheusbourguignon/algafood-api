package com.algaworks.algafood.controller;

import com.algaworks.algafood.service.AtivacaoClienteService;
import com.algaworks.algafood.user.Cliente;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController" + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente matheus = new Cliente("Matheus", "matheusmbl21@gmail.com", "982482673");

        ativacaoClienteService.ativar(matheus);

        return "Olá!";
    }


}
