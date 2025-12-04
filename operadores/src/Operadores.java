import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        /*
         *  =====================================
         *  Operadores em Java:
         *  =====================================
         *
         *  =====================================
         *  Operadores de ATRIBUIÇÃO (=)
         *  =====================================
         *  O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
         *  Em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.
         */

        String nome = "Thalisson";
        int idade = 22;
        double peso = 60.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        /*
         *  =====================================
         *  Operadores ARITMÉTICOS (+, -, *, / E %)
         *  =====================================
         *  Os operadores aritméticos são utilizados para realizar operações matemáticas entre valores numéricos, podendo se tornar
         *  ou não uma expressão mais complexa.
         *
         *  OBS: O operador de atribuição (+) se usado em "Strings" realizará uma concatenação de textos.
         */

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // Usado especificamente para coletar o resto da divisão
        double resultado = (10 * 7) + (21.3 / 4);

        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        // Comportamento desse operador em junções entre "Strings" e números;

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        // Resultado esperado, primeiro a realização da expressão matemática e após isso a saida do resultado + a "String".
        // RESULTADO = 31
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        // Resultado esperado, após o compilador entender que estamos a lidar com uma "string" ele passa a tratar o restante como "String"
        // RESULTADO = 1111
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        // Resultado esperado, primeiro o compilador resolverá a expressão entre os parênteses e trará a saida
        // RESULTADO = 13
        System.out.println(concatenacao);

        /*
         *  =====================================
         *  Operadores UNÁRIOS (+, -, ++ E --)
         *  =====================================
         *  Os operadores unários são aplicados com outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar,
         *  decrementar, inverter valores numéricos e booleanos.
         *
         *  (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
         *  (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
         *  (++) Operador unário de incremento de valor - incrementa o valor numa variável numa unidade;
         *  (--) Operador unário de decremento de valor - decrementa o valor numa variável numa unidade;
         *  (!) Operador unário lógico de negação - nega o valor de uma expressão booleana;
         */

        int numero = 5;
        System.out.println(- numero);
        // RESULTADO = - 5
        System.out.println(numero);
        // RESULTADO = 5;

        numero = - numero;
        System.out.println(numero);
        // RESULTADO = - 5

        numero = numero * -1;
        System.out.println(numero);
        // RESULTADO = 5;

        numero = 5;
        // numero++;
        // A expressão abrevia numero = numero + 1;
        System.out.println(numero++);
        // RESULTADO = 5;
        System.out.println(++numero);
        // RESULTADO = 7;
        // O resultado 7 se dá pelo fato de que anteriormente no outro System.out a variável foi incrementada

        boolean variavel = true;
        System.out.println(!variavel);
        // RESULTADO = false

        /*
         *  =====================================
         *  Operadores TERNÁRIO ou Elvis (?:)
         *  =====================================
         *  O operador ternário é uma abreviação do if else,
         *  usado para expressões condicionais simples, como validações, por exemplo.
         */

        // Exemplo sem o operador ternário
        int a, b;
        a = 5;
        b = 6;

        String resultadoCondicao = "";
        if(a==b)
            resultadoCondicao = "Verdadeiro";
        else
            resultadoCondicao = "Falso";

        // Exemplo com o operador ternário
        resultadoCondicao = a==b  ? "Verdadeiro" : "Falso";
        System.out.println(resultadoCondicao);

        /*
         *  =====================================
         *  Operadores RELACIONAIS (==, !=, >, >=, < E <=)
         *  =====================================
         *  Os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
         *  Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual da direita,
         *  retornando um valor booleano como resultado.
         */

        int n1, n2;
        n1 = 1;
        n2 = 2;

        boolean simNao = n1 == n2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);

        simNao = n1 != n2;
        System.out.println("Numero 1 é diferente que numero 2? " + simNao);

        simNao = n1 > n2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);

        simNao = n1 >= n2;
        System.out.println("Numero 1 é maior ou igual que numero 2? " + simNao);

        simNao = n1 < n2;
        System.out.println("Numero 1 é menor que numero 2? " + simNao);

        simNao = n1 <= n2;
        System.out.println("Numero 1 é menor ou igual que numero 2? " + simNao);

        String nomeUm = "Thalisson";
        String nomeDois = new String("Thalisson");
        System.out.println(nomeUm == nomeDois);
        // RESULTADO = false;
        // Por serem dois objetos distintos o resultado sempre será false, para resolvermos isso usamos equals, que analisa o conteúdo dos objetos.
        System.out.println(nomeUm.equals(nomeDois));
        // RESULTADO = true;

        /*
         *  =====================================
         *  Operadores LÓGICOS (&& E ||)
         *  =====================================
         *  Os operadores lógicos representam o recurso que nos permite criar expressões lógicas
         *  maiores a partir da junção de duas ou mais expressões.
         *
         *  (&&) Operador lógico E;
         *  (||) Operador lógico OU;
         */

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        condicao1 = false;
        condicao2 = false;

        if (condicao1 || condicao2 || (1 < 2)) {
            System.out.println("Alguma das duas condições são verdadeiras");
        }
    }
}