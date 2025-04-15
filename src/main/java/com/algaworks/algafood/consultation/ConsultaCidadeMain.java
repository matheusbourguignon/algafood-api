package com.algaworks.algafood.consultation;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.entity.Cidade;
import com.algaworks.algafood.repository.CidadeRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.PrintStream;
import java.util.List;

public class ConsultaCidadeMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CidadeRepository restauranteRepository = applicationContext.getBean(CidadeRepository.class);
        List<Cidade> todasCidades = restauranteRepository.findAll();

        for (Cidade cidade : todasCidades) {
            PrintStream printf = System.out.printf("%s - %s\n", cidade.getNome(), cidade.getEstado(), cidade.getEstado().getNome());
        }

    }

}
