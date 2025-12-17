package com.dio.interfaces;

import java.math.BigDecimal;

public interface Conta {
    void sacar(BigDecimal valor);
    void depositar(BigDecimal valor);
    void transferir(Conta contaDestino, BigDecimal valor);
    void imprimirExtrato();
}
