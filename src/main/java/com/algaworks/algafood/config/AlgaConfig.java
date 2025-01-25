package com.algaworks.algafood.config;

import com.algaworks.algafood.notification.NotificadorEmail;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {

    //Dentro do container, por padrão o bean será nomeado como "notificadorEmail", que é exatamente
    // o nome do método de definição bean
    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
      return new AtivacaoClienteService(notificadorEmail());
    }

}
