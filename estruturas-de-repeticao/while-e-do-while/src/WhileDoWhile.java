import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WhileDoWhile {
    public static void main(String[] args) {
        /*
         * =======================================
         * Laços de Repetição
         * =======================================
         * Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops,
         * são comandos que permitem iteração de código, ou seja,
         * que comandos presentes no bloco sejam repetidos diversas vezes.
         *
         * For (Para)
         * While (Enquanto)
         * Do While (Faça Enquanto)
         *
         * =======================================
         * Laço While
         * =======================================
         * o While determina que enquanto uma condição for valida, o bloco de código será executado.
         * O laço while testa a condição antes de executar o código, logo, caso a condição seja invalida no primeiro teste,
         * o bloco de código não será executado.
         *
         * while (expressão booleana de validação) {}
         */

        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada) valorDoce = mesada;

            System.out.println("Doce do valor: " + String.format("%.2f", valorDoce) + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Valor atual da mesada: " + mesada);
        }
        System.out.println("Mesada: " + String.format("%.2f", mesada));
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*
        * =======================================
         * Laço Do While
         * =======================================
         * O do while, assim como no laço while, considera que enquanto uma determinada condição for válido
         * o bloco de código será executado. Entretanto, do/while testa a condição após executar o código,
         * sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado
         * pelo menos uma vez.
         *
         * do
         * {
         *   Bloco de código a ser executado
         * }
         * while (expressão booleana de validação);
         */

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        } while(tocando());
        System.out.println("Alôô!!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}