package com.dio.models;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= Extrato da Conta Corrente =");
        System.out.printf("Titular %s%n", this.titular.getNome());
        System.out.printf("Agência %d%n", this.agencia);
        System.out.printf("Numero %d%n", this.numero);
        System.out.printf("Agência %.2f%n", this.saldo);
    }
}
