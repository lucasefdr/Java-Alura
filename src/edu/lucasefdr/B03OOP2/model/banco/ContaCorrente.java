package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B03OOP2.model.banco.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    public ContaCorrente(int numero, int agencia) throws Exception {
        super(numero, agencia);
    }

    @Override
    public boolean saca(double valor) {
        double descontoSaque = valor * 0.02;
        valor += descontoSaque;
        return super.saca(valor);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
