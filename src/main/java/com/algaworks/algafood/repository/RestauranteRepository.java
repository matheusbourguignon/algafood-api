package com.algaworks.algafood.repository;

import com.algaworks.algafood.domain.expection.RestauranteRepositoryQueries;
import com.algaworks.algafood.entity.Cozinha;
import com.algaworks.algafood.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

// estou herdando o JPARepositroy e RestauranteRepositoryQueries
@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>, RestauranteRepositoryQueries {
    List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

    //  Anotação - @Query("from Restaurante where nome like %:nome% and id= :id")
    List<Restaurante> consultarPorNome(String nome, @Param("id") Long id);

    //    List<Restaurante> findByNomeContainingAndId(String nome, Long id);
    Optional<Restaurante> findFirstRestauranteByNomeContaining(String nome);

    // findtop - vai apenas pegar dois nomes de restaurantes
    List<Restaurante> findTop2ByNomeContaining(String nome);

    int countById(Long id);
}
