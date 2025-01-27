package com.algaworks.algafood.notification;


import com.algaworks.algafood.user.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
/* O meu notificador SMS é o meu principal a maior prioridade é pra ele. */
@Component
public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.printf("Notificando %s por SMS através do telefone  %s: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }
}
