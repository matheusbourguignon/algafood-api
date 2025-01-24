package com.algaworks.algafood.notification;

import com.algaworks.algafood.user.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}
