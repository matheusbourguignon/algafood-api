package com.algaworks.algafood.main;

import com.algaworks.algafood.notification.NotifcadorEmail;
import com.algaworks.algafood.notification.Notificador;
import com.algaworks.algafood.notification.NotificadorSMS;
import com.algaworks.algafood.service.AtivacaoClienteService;
import com.algaworks.algafood.user.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Matheus", "matheusmbl21@gmail.com", "21982482673");
        Cliente cliente2 = new Cliente("Ana", "anasouza@gmail.com", "21982412121");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);

        ativacaoCliente.ativar(cliente1);
        ativacaoCliente.ativar(cliente2);
    }
}
