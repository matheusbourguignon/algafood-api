package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMook implements Notificador {

    public NotificadorEmailMook() {
        System.out.println("NotificadorEmail MOOK");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.printf("MOCK: Notificação seria enviada para %s através do email  %s: %s\n", cliente.getNome(),
                cliente.getEmail(), mensagem);
    }
}


