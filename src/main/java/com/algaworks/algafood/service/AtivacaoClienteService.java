package com.algaworks.algafood.service;

import com.algaworks.algafood.notification.NivelUrgencia;
import com.algaworks.algafood.notification.TipoDoNotificador;
import com.algaworks.algafood.user.Cliente;
import com.algaworks.algafood.notification.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}

