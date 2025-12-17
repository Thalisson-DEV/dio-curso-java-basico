public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("99999191919");
        meuIphone.atender();

        // Testando Navegador
        meuIphone.exibirPagina("google.com");
        meuIphone.adicionarNovaAba();
    }
}