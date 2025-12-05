public class SwitchCase {
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
         * Estrutura Condicional Switch-Case (Mude/Troque/Modifique CASO)
         * ======================================
         * A estrutura switch compara o valor de cada caso com o da variável sequencialmente,
         * e sempre que encontra um valor correspondente, executa o código associado ao caso.
         * Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado,
         * acrescentamos o comando break no final de cada bloco de código (se for usando -> não é necessário).
         * O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.
         */

        String sigla = "G";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }

    }
}