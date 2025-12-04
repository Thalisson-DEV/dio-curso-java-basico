public class JavaDoc {
    public static void main(String[] args) {

    }

    /*
     * =====================================
     * Javadoc
     * =====================================
     * O Javadoc é o padrão oficial de documentação em Java. Ele permite que você escreva
     * comentários especiais no código que podem ser processados para gerar páginas HTML
     * de documentação (como a documentação oficial da Oracle).
     *
     * Um comentário Javadoc sempre começa com /** (barra e dois asteriscos) e termina com */
    /*
     * Ele deve ser posicionado imediatamente antes de classes, interfaces, métodos ou atributos.
     */


    /*
     * =====================================
     * Metadados da Classe
     * =====================================
     * Usadas geralmente no topo da classe para identificar responsabilidade, autor e versão.
     * Tags principais: @author, @version, @since.
     */
    /**
     * Representa uma conta bancária simples para fins de demonstração.
     * Esta classe é responsável por gerenciar saldo e titularidade.
     *
     * @author Seu Nome
     * @version 1.0
     * @since 15/09/2025
     */
    public class ContaBancaria {}

    /*
     * =====================================
     * Documentação de Métodos (Entrada e Saída)
     * =====================================
     * Usadas para explicar o que métodos recebem, o que eles devolvem e quais erros podem gerar.
     * Tags principais: @param, @return, @throws (ou @exception).
     */
    public class Operacoes {
        /**
         * Realiza a divisão entre dois números inteiros.
         *
         * @param dividendo O número a ser dividido.
         * @param divisor O número pelo qual se divide (não pode ser zero).
         * @return O resultado da divisão como um número decimal (double).
         * @throws ArithmeticException Se o divisor for igual a zero.
         */
        public double dividir(int dividendo, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return (double) dividendo / divisor;
        }
    }

    /*
     * =====================================
     * Links e Referências
     * =====================================
     * Usadas para criar links para outras partes da documentação ou sites externos.
     * Tags principais: @see (cria uma sessão "Veja também"), {@link} (link inline no texto).
     */
    /**
     * Classe utilitária para pagamentos.
     * Para entender as taxas, verifique a classe {@link br.com.projeto.Taxas}.
     *
     * @see "https://docs.oracle.com/en/java/"
     * @see ContaBancaria
     */
    public class Pagamento {
        // Métodos de pagamento...
    }

    /*
     * =====================================
     * Grupo 4: Formatação e Status do Código
     * =====================================
     * O Javadoc aceita tags HTML para formatação e tags especiais para indicar o status do código.
     * Tags/HTML principais: <p>, <code>, <ul>, <li>, @deprecated, {@code}.
     */
    public class Legado {

        /**
         * Calcula o imposto de forma antiga.
         * <p>
         * Este método utiliza uma regra de negócio desatualizada.
         * Exemplo de uso: {@code calcularImposto(100.0);}
         * </p>
         *
         * @param valor O valor base.
         * @deprecated Use o método {@link #novoCalcularImposto(double)} que é mais eficiente.
         */
        @Deprecated
        public void calcularImposto(double valor) {
            // Código antigo...
        }

        /**
         * Novo método de cálculo.
         * <ul>
         * <li>Taxa fixa: 5%</li>
         * <li>Isento se valor < 100</li>
         * </ul>
         */
        public void novoCalcularImposto(double valor) {
            // Código novo...
        }
    }
}