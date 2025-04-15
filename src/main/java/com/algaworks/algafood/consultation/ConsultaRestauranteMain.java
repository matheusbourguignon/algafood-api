package com.algaworks.algafood.consultation;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.entity.Restaurante;
import com.algaworks.algafood.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.PrintStream;
import java.util.List;

public class ConsultaRestauranteMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
        List<Restaurante> todosRestaurantes = restauranteRepository.findAll();

        for (Restaurante restaurante : todosRestaurantes) {
            PrintStream printf = System.out.printf("%s - %f - %s\n", restaurante.getNome(), restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
        }

    }

}
