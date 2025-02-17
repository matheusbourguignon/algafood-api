package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Restaurante;

import java.util.List;

public interface RestauranteRepository {
    List<Restaurante> todas();

    Restaurante porId(Long id);

    Restaurante taxaFrete(Restaurante restaurante);

    Restaurante adicionar(Restaurante restaurante);

    void remover(Restaurante restaurante);

}
