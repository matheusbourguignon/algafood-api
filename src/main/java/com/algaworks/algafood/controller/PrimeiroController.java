package com.algaworks.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Olá!";
    }



}
