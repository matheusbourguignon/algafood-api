package com.algaworks.algafood.service;

import com.algaworks.algafood.user.Cliente;
import com.algaworks.algafood.notification.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if(notificador != null) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }else {
            System.out.println("Não existe notificador, mas o cliente foi ativado!");
        }
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
