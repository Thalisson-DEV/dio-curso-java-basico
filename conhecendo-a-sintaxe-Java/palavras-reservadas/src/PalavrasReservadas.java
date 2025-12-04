public class PalavrasReservadas {
    public static void main(String[] args) {
        /*
         * =====================================
         * Palavras Reservadas
         * =====================================
         * Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica,
         * portanto não podem ser utilizadas para nomear variáveis, classes, métodos ou atributos.
         *
         * Java possui 52 palavras reservadas. Todas essas palavras são classificadas e escritas com letra minúscula,
         * sendo identificada com uma cor especial na maioria das IDE's.
         */

        /*
         * =====================================
         * Grupo 1: Tipos Primitivos e Retorno
         * =====================================
         * Usadas para declaração de variáveis simples e tipos de retorno de métodos.
         * Palavras: boolean, byte, char, double, float, int, long, short, void.
         */
        class TiposPrimitivos {
            public void exemplo() {
                boolean isJavaFun = true;
                char letra = 'J';
                int numero = 10;
                double decimal = 5.99;
                // void metodoSemRetorno() { }; // void indica ausência de retorno

                // int int = 5; // Erro de compilação: 'int' é palavra reservada
            }
        }

        /*
         * =====================================
         * Grupo 2: Controle de Fluxo
         * =====================================
         * Usadas para controlar a ordem de execução do código (condicionais e loops).
         * Palavras: break, case, continue, default, do, else, for, if, return, switch, while.
         */
        class ControleFluxo {
            public void testarFluxo(int n) {
                if (n > 0) {
                    // faz algo
                } else {
                    // faz outra coisa
                }

                while (n < 10) {
                    n++;
                    if (n == 5) continue; // Pula iteração
                    if (n == 8) break;    // Para o loop
                }

                switch (n) {
                    case 1: break;
                    default: return; // Retorna o valor/encerra métodos
                }
            }
        }

        /*
         * =====================================
         * Grupo 3: Modificadores de Acesso e Outros
         * =====================================
         * Definem a visibilidade e comportamento de classes, métodos e variáveis.
         * Palavras: private, protected, public, abstract, final, static, synchronized,
         * transient, volatile, native, strictfp.
         */
        abstract class Modificadores { // abstract: classe não pode ser instanciada
            public static final double PI = 3.14; // public (acesso total), static (classe), final (constante)

            private int segredo; // private: visível apenas nesta classe

            protected void metodoFilho() {} // protected: visível para filhos e pacote

            public synchronized void threadSafe() {} // synchronized: controle de concorrência
        }

        /*
         * =====================================
         * Grupo 4: Definição de Classes, Objetos e Pacotes
         * =====================================
         * Usadas para estruturar o código, criar objetos e relações de herança.
         * Palavras: class, interface, enum, extends, implements, package, import,
         * new, this, super, instanceof.
         */
// package com.exemplo; // package: define o pacote
// import java.util.List; // import: traz classes de fora

         // class Carro extends Veiculo implements Motor { // class, extends (herança), implements (interface)

            //Carro() {
            //super(); // super: refere-se à classe pai
            //this.cor = "Azul"; // this: refere-se à instância atual
            //}

            //void verificar() {
            //Object obj = new Carro(); // new: cria novo objeto
            //if (obj instanceof Carro) { // instanceof: testa o tipo
                    // é um carro
                //}
            //}
        //}

        /*
         * =====================================
         * Grupo 5: Tratamento de Erros (Exceções)
         * =====================================
         * Usadas para capturar e lançar exceções e asserções.
         * Palavras: try, catch, finally, throw, throws, assert.
         */
        class TratamentoErros {
            public void dividir(int a, int b) throws Exception { // throws: avisa que pode dar erro
                assert b != 0; // assert: validação para depuração

                try {
                    if (b == 0) throw new Exception("Zero!"); // throw: lança o erro
                    int r = a / b;
                } catch (Exception e) { // catch: captura o erro
                    System.out.println("Erro");
                } finally { // finally: executa sempre
                    System.out.println("Fim");
                }
            }
        }

        /*
         * =====================================
         * Grupo 6: Reservadas, mas não utilizadas
         * =====================================
         * Palavras que foram reservadas para uso futuro ou legado do C++, mas não têm função no Java atual.
         * Palavras: const, goto.
         */
        class NaoUsadas {
            public void teste() {
                // const int x = 10; // Erro: 'const' é reservada, mas não funciona. Use 'final'.
                // goto label; // Erro: 'goto' é reservada, mas não implementada no Java.
            }
        }
    }
}