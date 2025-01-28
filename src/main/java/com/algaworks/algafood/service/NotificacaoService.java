package com.algaworks.algafood.service;

import com.algaworks.algafood.notification.NivelUrgencia;
import com.algaworks.algafood.notification.Notificador;
import com.algaworks.algafood.notification.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), " Seu cadastro com o sistema está ativo!");
    }

}
