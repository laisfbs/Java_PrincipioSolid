import Notificadores.Celular;
import Notificadores.EmailCliente;
import Notificadores.Notificador;
import NotificaçõesClima.Chuvoso;
import NotificaçõesClima.Ensolarado;
import NotificaçõesClima.Frio;
import NotificaçõesClima.NotificacaoClima;


public class TesteNovaVersao {

    public static void main(String[] args) {
        
       Fabrica fabrica = new Fabrica();
       
       MonitoradorClima monitorador = fabrica.getMonitorador();
       
       Notificador celular = fabrica.getCelular();
       Notificador emailCliente = fabrica.getEmailCliente();
       
       monitorador.setNotificacaoClima(fabrica.getChuvoso());
       monitorador.notifica(celular);
      
       monitorador.setNotificacaoClima(fabrica.getEnsolarado());
       monitorador.notifica(emailCliente);
    }
}
