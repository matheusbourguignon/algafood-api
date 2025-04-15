package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    //    List<Estado> listar();

}
