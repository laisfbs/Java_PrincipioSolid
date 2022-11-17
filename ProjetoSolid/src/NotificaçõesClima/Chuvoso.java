package NotificaçõesClima;

public class Chuvoso implements NotificacaoClima {

    @Override
    public void notificaClima() {
        System.out.println("Esta chovendo, pegue um guarda-chuva");
    }
}

