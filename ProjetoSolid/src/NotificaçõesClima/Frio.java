package NotificaçõesClima;

public class Frio implements NotificacaoClima{

    @Override
    public void notificaClima() {
        System.out.println("Esta muito frio, não se esqueça do casaco !!!" +
                " \nNão va pegar um resfriado mlk");
    }
}

