public class CondicionalEncadeada {
    public static void main(String[] args) {
        /*
         * ======================================
         * Estrutura Condicional
         * ======================================
         * A estrutura condicional possibilita a escolha de um grupo de ações e comportamentos
         * a serem executadas quando determinadas condições são ou não satisfeitas.
         * A estrutura condicional pode ser Simples ou Composta
         *
         * ======================================
         * Estrutura Condicional Encadeada
         * ======================================
         * Em uma estrutura condicional podemos ter uma terceira, quarta e/ou inúmeras condições
         */

        int nota = 4;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}