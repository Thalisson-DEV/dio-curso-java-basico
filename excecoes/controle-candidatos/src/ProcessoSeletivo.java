
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        ArrayList<String> candidatosSelecionados = selecaoCandidatos();
        System.out.println("Candidatos selecionados: " + candidatosSelecionados + ", entrando em contato...");

        for (String candiato : candidatosSelecionados) {
            entradoEmContato(candiato);
        }
    }

    static ArrayList<String> selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Machado", "Clarinha", "Gleyson", "Juninho", "Magali", "Marcel", "Marcia", "Sergio", "Talisson", "Thaise", "Samire"};
        ArrayList<String> candidatosSelecionados = new ArrayList<>(5);
        int candiatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados.toArray().length < 5 && candiatoAtual < candidatos.length) {
            String candidato = candidatos[candiatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados.add(candidatos[candiatoAtual]);
            }
            candiatoAtual++;
        }

        return candidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entradoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) tentativasRealizadas++;
        } while (continuarTentando && tentativasRealizadas <= 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos conato com " + candidato);
        }
    }
}