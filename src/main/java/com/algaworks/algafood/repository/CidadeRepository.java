package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar();

    Cidade buscar(Long id);

    Cidade salvar(Cidade cidade);

    void remover(Long id);
}
