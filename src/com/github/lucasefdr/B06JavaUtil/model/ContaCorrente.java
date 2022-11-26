package com.github.lucasefdr.B06JavaUtil.model;

import com.github.lucasefdr.B03OOP2.exception.SacaException;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void saca(double valor) throws SacaException {
        double descontoSaque = valor * 0.02;
        valor += descontoSaque;
        super.saca(valor);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
