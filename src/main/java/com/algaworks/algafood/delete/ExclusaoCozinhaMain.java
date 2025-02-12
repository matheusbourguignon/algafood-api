package com.algaworks.algafood.delete;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.entity.Cozinha;
import com.algaworks.algafood.register.CadastroCozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ExclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE).run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha = new Cozinha();
        cozinha.setId(1L);

        cadastroCozinha.remover(cozinha);


    }

}
