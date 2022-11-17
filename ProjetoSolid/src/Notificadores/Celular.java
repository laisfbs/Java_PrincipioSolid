package Notificadores;

import NotificaçõesClima.NotificacaoClima;

/**
 * Created by mrk on 4/8/14.
 */
public class Celular implements Notificador {
    public void AlertaCondicaoClima(NotificacaoClima notificacao) {
        notificacao.notificaClima();
    }

    public void AlertaCondicaoClima(Object notificacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
