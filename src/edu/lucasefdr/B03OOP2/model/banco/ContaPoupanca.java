package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B03OOP2.model.banco.Conta;

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
