
import NotificaçõesClima.NotificacaoClima;
import Notificadores.Notificador;
    
public class MonitoradorClima {
 

    NotificacaoClima notificacaoClima;

    public void setNotificacaoClima(NotificacaoClima weatherDescription) {
        this.notificacaoClima = weatherDescription;
    }

    public void notifica(Notificador notifier) {
        notifier.AlertaCondicaoClima(notificacaoClima);
    }
} 
