
public class TesteRefatorar {

    public static void main(String[] args) {

        PessoaFisica fulano = new PessoaFisica();

        System.out.println(fulano.getNome());

        fulano.setNome("Fulano da Silva");

        System.out.println(fulano.getNome());

        int resultado = soma(2, 4);

        System.out.println(resultado);

    }

    public static int soma(int num1, int num2) {

        return num1 + num2;

    }
}
