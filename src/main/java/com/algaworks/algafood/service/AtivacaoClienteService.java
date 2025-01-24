package com.algaworks.algafood.service;

import com.algaworks.algafood.notification.Notificador;
import com.algaworks.algafood.user.Cliente;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}
