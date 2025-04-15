package com.algaworks.algafood.repository;

import com.algaworks.algafood.entity.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// eu declaro a interface cozinhaRepository e uso a herança extends do JpaRepositoryu
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

    //    List<Cozinha> consultarPornome(String nome);

}
