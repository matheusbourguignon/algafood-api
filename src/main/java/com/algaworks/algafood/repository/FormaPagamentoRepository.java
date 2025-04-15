package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

//    List<FormaPagamento> listar();

}