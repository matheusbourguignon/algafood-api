package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;
import org.springframework.stereotype.Component;

//implements é uma palavra-chave em Java que estabelece uma relação de implementação entre uma classe e uma interface.
@Component
public class NotificadorEmail implements Notificador {

    public  NotificadorEmail(){
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atráves do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
