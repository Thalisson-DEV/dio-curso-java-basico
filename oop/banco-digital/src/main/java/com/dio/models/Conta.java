package com.dio.models;

import com.dio.exceptions.SaldoInsuficienteException;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Conta implements com.dio.interfaces.Conta {

    protected static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected BigDecimal saldo = BigDecimal.ZERO;
    protected Cliente titular;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
    }

    @Override
    public void depositar(BigDecimal valor) {
        if(valor != null && valor.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(valor);
            System.out.println("O valor " + valor + " foi depositado com sucesso");
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    @Override
    public void sacar(BigDecimal valor) {
        if(valor != null && valor.compareTo(BigDecimal.ZERO) > 0 && this.saldo.compareTo(BigDecimal.ZERO) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            System.out.println("O valor " + valor + " foi sacado com sucesso");
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    @Override
    public void transferir(com.dio.interfaces.Conta contaDestino, BigDecimal valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("O valor " + valor + " foi transferido com sucesso para a conta " + contaDestino);
    }
}
