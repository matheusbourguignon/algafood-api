package com.algaworks.algafood.register;

import com.algaworks.algafood.entity.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroCozinha {
    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        return manager.createQuery("from Cozinha ", Cozinha.class).getResultList();
    }

}
