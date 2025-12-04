@SuppressWarnings("SpellCheckingInspection")
public class TiposVariaveis {
    public static void main(String[] args) {

        /*
         * ============================================
         *  Declaração de Variáveis
         * ============================================
         *
         *  Variável é uma identificação de um espaço em memória utilizado pelo nosso programa.
         *  Seguindo as convenções em linguagem de programação, toda variável é composta por:
         *  Tipo de dados + identificação + valor atribuído.
         *
         *  <Tipo> <nomeVariável> = <atribuiçãoDeValorOpcional>
         */

        byte idade = 123;
        short ano = 2021;
        int cep = 48905347;
        long cpf = 98765432109L; // Variaveis do tipo long devem possuir o L no final
        float pi = 3.14F; // Variaveis do tipo float devem possuir o F no final
        double salario = 1275.33;


        /*
         * Possível problema de implementação com double ou float
         */
        double salarioMinimo = 2500; // Corresponde ao valor de dois mil e quinhentos
        salarioMinimo = 2.500; // Corresponde ao literal valor dois virgula quinhentos e não dois mil e quinhentos

        /*
         * Em alguns casos criamos uma variável, definimos um valor correspondente,
         * manipulamos esta variável e temos consciência do seu valor na aplicação. Mas devemos tomar alguns cuidados, já que,
         * o Java é fortemente tipado.
         */

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Para termos um valor de precisão menor neste caso devemos fazer um casting


        /*
         * ============================================
         *  Constantes em Java
         * ============================================
         *
         * Constantes tambem são valores armazenados na memória, mas que não podem ser modificados após serem declaradas,
         * no Java, estes valores são representados pela palavra reservada final, seguida do tipo.
         * Por convenção, constantes são sempre escritas em CAIXA ALTA.
         *
         * final <Tipo> <nomeVariável> = <atribuiçãoDeValorOpcional>
         */

        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 12; neste caso a variavel não pode ser modificada em nenhum outro local do codigo.
    }
}