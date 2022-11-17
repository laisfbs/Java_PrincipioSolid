import Notificadores.Celular;
import Notificadores.EmailCliente;
import Notificadores.Notificador;
import NotificaçõesClima.Chuvoso;
import NotificaçõesClima.Ensolarado;
import NotificaçõesClima.Frio;
import NotificaçõesClima.NotificacaoClima;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TesteInterativo {
    
    public static void main(String[] args) {
        
        Fabrica fabrica = new Fabrica();
        
        List<Notificador> notificadores = new ArrayList<>();
        
        notificadores.add(fabrica.getCelular());
        notificadores.add(fabrica.getEmailCliente());
        
        List<NotificacaoClima> notificacoesClima = new ArrayList<>();
        
        notificacoesClima.add(fabrica.getChuvoso());
        notificacoesClima.add(fabrica.getEnsolarado());
        notificacoesClima.add(fabrica.getFrio());
        
        System.out.println("Escolha por qual plataforma notificar: "
                + "\n1=Celular\n2=Email");
        
       Scanner scan = new Scanner (System.in);
       
       int notificador = scan.nextInt();
       
       System.out.println("Como esta o clima hoje? \n1=Chuvoso\n2=Ensolarado\n3=Frio");
        
       int resposta = scan.nextInt();
       
       MonitoradorClima monitorador = fabrica.getMonitorador();
       monitorador.setNotificacaoClima(notificacoesClima.get(resposta -1));
       monitorador.notifica(notificadores.get(notificador -1));
       
    }
    
    
}
