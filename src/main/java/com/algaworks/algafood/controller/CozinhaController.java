package com.algaworks.algafood.controller;

import com.algaworks.algafood.entity.Cozinha;
import com.algaworks.algafood.model.CozinhasXmlWrapper;
import com.algaworks.algafood.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping
    public List<Cozinha> listar() {
        return cozinhaRepository.listar();
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public CozinhasXmlWrapper listarXml() {
        return new CozinhasXmlWrapper(cozinhaRepository.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinha> buscar(@PathVariable("id") Long id) {
        Cozinha cozinha = cozinhaRepository.buscar(id);

//        return ResponseEntity.status(HttpStatus.OK).body(cozinha);
//        return ResponseEntity.ok(cozinha);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.LOCATION, "http://api.algafood.local:8088/cozinhas");

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .headers(headers)
                .build();

    }

}
