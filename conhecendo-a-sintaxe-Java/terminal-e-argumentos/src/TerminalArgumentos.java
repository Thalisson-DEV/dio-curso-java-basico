public class TerminalArgumentos {
    public static void main(String[] args) {
        /*
         * ===================================
         * Terminal e Argumentos
         * ===================================
         * Quando executamos uma classe que contenha o metodo main, o mesmo permite que passemos um array [] de argumentos do tipo "String".
         * Logo podemos após a definição da classe a ser executada informar estes parâmetros.
         *
         * java MinhaClasse argumentoUm argumentoDois
         */
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura +"cm ");
    }
}