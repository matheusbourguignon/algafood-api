package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//implements é uma palavra-chave em Java que estabelece uma relação de implementação entre uma classe e uma interface.

/* O meu notificador email é o meu principal a maior prioridade é pra ele. */
//@Primary

//Qualifier - é uma implementação para qualificar o nosso componente.

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;


    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta " + properties.getPortaServidor());
        System.out.printf("Notificando %s atráves do e-mail %s: %s\n", cliente.getNome(),
                cliente.getEmail(), mensagem);
    }


}
