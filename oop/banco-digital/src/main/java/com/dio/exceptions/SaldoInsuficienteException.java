package com.dio.exceptions;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        System.out.println("O saldo é insuficiente para finalizar a transação.");
    }
}
