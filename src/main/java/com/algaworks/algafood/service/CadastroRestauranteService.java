package com.algaworks.algafood.service;

import com.algaworks.algafood.domain.expection.EntidadeNaoEncontradaException;
import com.algaworks.algafood.entity.Cozinha;
import com.algaworks.algafood.entity.Restaurante;
import com.algaworks.algafood.repository.CozinhaRepository;
import com.algaworks.algafood.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Restaurante salvar(Restaurante restaurante) {
        Long id = restaurante.getCozinha().getId();

        Cozinha cozinha = cozinhaRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException
                 (String.format("Não existe cadastro de cozinha com código %d", id)));

        restaurante.setCozinha(cozinha);

        return restauranteRepository.save(restaurante);
    }

}
