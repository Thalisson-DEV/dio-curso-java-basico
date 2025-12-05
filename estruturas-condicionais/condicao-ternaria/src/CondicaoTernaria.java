public class CondicaoTernaria {
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
         * Estrutura Condicional Ternária
         * ======================================
         * A estrutura ternária serve para abreviarmos o nosso algorítimo
         * refatorando com o conceito de operador ternário.
         */

        int nota = 4;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}