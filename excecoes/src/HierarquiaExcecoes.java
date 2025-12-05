import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HierarquiaExcecoes {
    public static void main(String[] args) {
        /*
         * =====================================
         * Exceções
         * =====================================
         * Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador,
         * erros devido à entrada errada ou outros imprevistos.
         *
         * Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é:
         * "Java lançara uma exceção".
         *
         * =====================================
         * Hierarquia das exceções (Estrutura)
         * =====================================
         * Toda exceção e erro em Java herda da classe mãe java.lang.Throwable.
         * A estrutura básica é:
         *
         *               Throwable
         *               /       \
         *             Error      Exception
         *           /       \
         * RuntimeException  Outras (Checked)
         */
    }
}

/*
 * =====================================
 * Grupo 1: java.lang.Error (Erros Fatais)
 * =====================================
 * Representam problemas graves na máquina virtual (JVM) e não no seu código lógico.
 * O programador geralmente NÃO deve tentar tratar esses erros (catch), pois são irrecuperáveis.
 * Exemplos: OutOfMemoryError (Falta de memória RAM), StackOverflowError (Estouro de pilha).
 */
class ErroFatal {
    public void causarEstouroDePilha() {
        // Exemplo de StackOverflowError: Um método chamando a si mesmo infinitamente
        causarEstouroDePilha();
    }
}

/*
 * =====================================
 * Grupo 2: Unchecked Exceptions (Não Checadas)
 * =====================================
 * São exceções que herdam de 'RuntimeException'.
 *
 * - Por que "Não Checadas"? O compilador NÃO obriga você a tratar (usar try-catch).
 * - Causa: Geralmente são falhas de lógica do programador.
 * - Solução ideal: Corrigir o código (o bug), e não apenas colocar um try-catch.
 *
 * Exemplos: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
 */
class ExcecoesNaoChecadas {
    public void exemploRuntime() {
        // ArithmeticException
        int a = 10;
        int b = 0;
        // O compilador deixa passar, mas vai quebrar na execução (Runtime)
        // int resultado = a / b; 

        // NullPointerException
        String texto = null;
        // Tentar acessar método de algo nulo quebra o programa
        // texto.toUpperCase(); 

        // Não usar try-catch para esconder isso. Verifique se é nulo antes!
        if (texto != null) {
            texto.toUpperCase();
        }
    }
}

/*
 * =====================================
 * Grupo 3: Checked Exceptions (Checadas)
 * =====================================
 * São exceções que herdam de 'Exception', mas NÃO herdam de RuntimeException.
 *
 * - Por que "Checadas"? O compilador VERIFICA e OBRIGA você a tratar o erro.
 * O código nem compila se não resolver.
 * - Causa: Fatores externos fora do controle do programador (arquivo não existe, banco de dados caiu, rede falhou).
 * - Solução: Usar bloco 'try-catch' ou lançar para quem chamou com 'throws'.
 *
 * Exemplos: FileNotFoundException, SQLException, IOException.
 */
class ExcecoesChecadas {

    // Opção A: Avisar que o método é perigoso (throws)
    public void abrirArquivo() throws FileNotFoundException {
        File file = new File("arquivo.txt");
        FileReader fr = new FileReader(file); // O compilador obriga a lidar com isso aqui
    }

    // Opção B: Tratar o perigo agora mesmo (try-catch)
    public void tentarAbrirArquivo() {
        File file = new File("arquivo_inexistente.txt");

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // Se der erro, o programa não para, ele entra aqui.
            System.out.println("O arquivo não foi encontrado, verifique o nome.");
        }
    }
}