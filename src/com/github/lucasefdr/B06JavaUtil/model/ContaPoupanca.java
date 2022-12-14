package com.github.lucasefdr.B06JavaUtil.model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
