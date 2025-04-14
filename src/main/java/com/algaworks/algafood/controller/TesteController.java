package com.algaworks.algafood.controller;

import com.algaworks.algafood.entity.Cozinha;
import com.algaworks.algafood.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping("/cozinhas/por-nome")
    public List<Cozinha> cozinhasPornome(@RequestParam("nome") String nome) {
        return cozinhaRepository.consultarPornome(nome);
    }

}
