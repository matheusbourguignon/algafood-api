package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listar();

    Cozinha buscar(Long id);

    Cozinha adicionar(Cozinha cozinha);

    void remover(Cozinha cozinha);
}
