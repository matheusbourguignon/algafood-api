package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listar();

    Cozinha buscar(Long id);
    List<Cozinha> consultarPornome(String nome);

    Cozinha salvar(Cozinha cozinha);

    void remover(Long id);
}
