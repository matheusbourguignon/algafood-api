package com.algaworks.algafood.service;

import com.algaworks.algafood.user.Cliente;
import com.algaworks.algafood.notification.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
