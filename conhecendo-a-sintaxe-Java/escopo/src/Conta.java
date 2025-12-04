public class Conta {

    double saldo = 10.0;

    public void sacar(double valor) {
        // Variável local do metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // Variável disponível em toda a a classe
        System.out.println(saldo);
        // System.out.println(novoSaldo);
        // Somente o metodo sacar conhece esta variável
    }

    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x=1; x<=5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        // x e valorCalculado nunca estarão disponíveis fora do bloco deste código.
        return valorMontante;
    }
}
