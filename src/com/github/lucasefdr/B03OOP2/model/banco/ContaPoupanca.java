package com.github.lucasefdr.B03OOP2.model.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, int agencia) throws Exception {
        super(numero, agencia);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
