package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

    List<Restaurante> findByNomeContainingAndId(String nome, Long id);

    Optional<Restaurante> findFirstRestauranteByNomeContaining(String nome);

    // findtop - vai apenas pegar dois nomes de restaurantes
    List<Restaurante> findTop2ByNomeContaining(String nome);

    int countById(Long id);
}
