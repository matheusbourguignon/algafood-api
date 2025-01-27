package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Qualifier - é uma implementação para qualificar o nosso componente.
@Qualifier("normal")
@Component
public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.printf("Notificando %s por SMS através do telefone  %s: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }
}
