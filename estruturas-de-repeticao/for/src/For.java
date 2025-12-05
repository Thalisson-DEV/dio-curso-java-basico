public class For {
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
         * Laço For
         * =======================================
         * Permite que uma variável contadora seja testada e incrementada a cada iteração,
         * sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora,
         * a condição e o valor de incrementação.
         *
         * for (bloco de inicialização; expressão booleana de validação; bloco de atualização ou incrementação) {}
         */

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
    }
}