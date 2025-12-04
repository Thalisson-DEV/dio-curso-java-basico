import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class ContaBanco {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Conta!");
            numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine();

            System.out.println("Por favor, digite o seu Nome!");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o seu Saldo Atual!");
            saldo = scanner.nextDouble();

            System.out.println(
                    "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo R$ "
                    + String.format("%.2f", saldo) + " já está disponível para saque."
            );
        } catch (InputMismatchException e) {
            System.out.println("Alguma entrada esta inválida! Por favor, siga as instruções abaixo:");
            System.out.println("Digitar apenas números inteiros para a conta");
            System.out.println("Digitar o saldo usando ponto (.) como separador decimal por exemplo 1500.50");
        }
    }
}