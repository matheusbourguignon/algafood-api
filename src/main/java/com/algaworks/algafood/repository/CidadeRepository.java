package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

//    List<Cidade> listar();

}
