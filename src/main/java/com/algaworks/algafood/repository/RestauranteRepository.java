package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Restaurante;

import java.util.List;

public interface RestauranteRepository {
    List<Restaurante> listar();

    Restaurante porId(Long id);

    Restaurante buscar(Long id);

    Restaurante taxaFrete(Restaurante restaurante);

    Restaurante salvar(Restaurante restaurante);

    void remover(Restaurante restaurante);

}
