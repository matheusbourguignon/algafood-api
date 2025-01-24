package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;

//implements é uma palavra-chave em Java que estabelece uma relação de implementação entre uma classe e uma interface.
public class NotifcadorEmail implements Notificador{
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atráves do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
