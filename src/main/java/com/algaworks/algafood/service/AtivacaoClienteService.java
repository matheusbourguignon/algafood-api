package com.algaworks.algafood.service;


import com.algaworks.algafood.notification.Notificador;
import com.algaworks.algafood.notification.NotificadorEmail;
import com.algaworks.algafood.user.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;


        System.out.println("AtivacaoClienteService: " + notificador);

    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}
