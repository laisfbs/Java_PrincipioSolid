import Notificadores.Celular;
import Notificadores.EmailCliente;
import Notificadores.Notificador;
import NotificaçõesClima.NotificacaoClima;
import NotificaçõesClima.Chuvoso;
import NotificaçõesClima.Ensolarado;
import NotificaçõesClima.Frio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 40415873
 */
public class Fabrica {
    
    public MonitoradorClima getMonitorador() {
        
        return new MonitoradorClima();
    }
    
    public Notificador getCelular() {
        
        return new Celular();
    }
    public Notificador getEmailCliente(){
      
        return new EmailCliente();
      
    }
   public NotificacaoClima getChuvoso() {
       
       return new Chuvoso();
       
   } 
    public NotificacaoClima getEnsolarado() {
       
       return new Ensolarado();
       
   } public NotificacaoClima getFrio() {
       
       return new Frio();
       
   } 
}
