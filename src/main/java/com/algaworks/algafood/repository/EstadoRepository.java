package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Estado;

import java.util.List;

public interface EstadoRepository {
    List<Estado> listar();

    Estado buscar(Long id);

    Estado salvar(Estado estado);

    void remover(Long id);

}
