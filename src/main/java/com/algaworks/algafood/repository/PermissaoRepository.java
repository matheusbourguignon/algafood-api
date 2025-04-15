package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

//    List<Permissao> listar();

}
