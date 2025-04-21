package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
// eu declaro a interface cozinhaRepository e uso a herança extends do JpaRepositoryu
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

    //
    List<Cozinha> findTodasByNomeContaining(String nome);

    Optional<Cozinha> findByNome(String nome);

    boolean existsByNome(String nome);

}
