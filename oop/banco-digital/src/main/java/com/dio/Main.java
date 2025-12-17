package com.dio;

import com.dio.models.Cliente;
import com.dio.models.Conta;
import com.dio.models.ContaCorrente;
import com.dio.models.ContaPoupanca;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1. Criando o Cliente
        Cliente cliente = new Cliente("Thalisson Damião", "999.999.999-00", new Date(1 / 2003));

        // 2. Criando as Contas
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        // 3. Estado Inicial
        System.out.println("=== Estado Inicial ===");
        cc.depositar(new BigDecimal("1000"));
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // 4. Realizando a Transferência
        System.out.println("\n=== Realizando Transferência de R$ 250,00 ===");
        cc.transferir(poupanca, new BigDecimal("250"));

        // 5. Estado Final
        System.out.println("\n=== Estado Final Pós-Transferência ===");
        cc.imprimirExtrato(); // Deve ter 750
        poupanca.imprimirExtrato(); // Deve ter 250
    }
}