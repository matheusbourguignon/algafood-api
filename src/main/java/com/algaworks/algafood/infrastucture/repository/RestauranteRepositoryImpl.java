package com.algaworks.algafood.infrastucture.repository;

import com.algaworks.algafood.domain.expection.RestauranteRepositoryQueries;
import com.algaworks.algafood.entity.Restaurante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositoryQueries {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal) {

        /*Em essência, JPQL é uma linguagem de consulta para entidades.
         Pense nela como SQL, mas em vez de operar em tabelas e colunas, você trabalha com suas entidades Java e seus atributos.*/

        var jpql = "from Restaurante where nome like :nome " + "and taxaFrete between :taxaInicial and :taxaFinal";

        return manager.createQuery(jpql, Restaurante.class)
                .setParameter("nome", "%" + nome + "%")
                .setParameter("taxaInicial", taxaFreteInicial)
                .setParameter("taxaFinal", taxaFreteFinal)
                .getResultList();
    }

}
