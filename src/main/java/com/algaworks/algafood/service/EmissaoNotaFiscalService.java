package com.algaworks.algafood.service;

import com.algaworks.algafood.notification.Notificador;
import com.algaworks.algafood.notification.NotificadorSMS;
import com.algaworks.algafood.products.Produto;
import com.algaworks.algafood.user.Cliente;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;

    }
    public void emitir(Cliente cliente, Produto produto) {
        // Todo emite a nota fiscal aqui...

        this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida!");
    }

}
