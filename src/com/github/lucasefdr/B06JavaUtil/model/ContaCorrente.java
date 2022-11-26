package com.github.lucasefdr.B06JavaUtil.model;

import com.github.lucasefdr.B03OOP2.exception.SacaException;
import com.github.lucasefdr.B03OOP2.model.banco.Tributavel;

public class ContaCorrente extends Object implements Tributavel {
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
    public double getValorImposto() {
        return super.saldo * 0.1;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
