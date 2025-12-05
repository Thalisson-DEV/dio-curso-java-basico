import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        /*
         * =====================================
         * Estruturas excepcionais
         * =====================================
         * Exceções
         * =====================================
         * Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador,
         * erros devido à entrada errada ou outros imprevistos.
         *
         * Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é:
         * "Java lançara uma exceção".
         *
         * =====================================
         * Tratamento de exceções
         * =====================================
         * Quando inevitavelmente ocorrer uma exceção? Como nós podemos ajustar o nosso algoritmo para amenizar o ocorrido?
         * Para isso usamos Try/Catch
         *
         * Try (Tente) - Permite que você defina um bloco de código para ser testado quanto a erros enquanto está a ser executado.
         * Catch (Pegue) - Permite definir um bloco de código a ser executado caso ocorra um erro no try.
         * Finally (Finalmente) - Permite definir um bloco de código a ser executado independente de ocorrer um erro ou não.
         * Sendo apenas o finally opcional para termos essa estrutura de tratamento de exceção
         */

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura +"cm ");
        } catch (InputMismatchException e) {
            System.out.println("Os campos de idade e altura precisam ser numericos e se tiverem casas decimais, use um ponto no lugar da virgula.");
        }
    }
}