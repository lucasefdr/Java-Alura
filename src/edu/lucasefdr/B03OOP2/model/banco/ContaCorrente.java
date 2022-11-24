package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B03OOP2.exception.SacaException;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente() {
    }

    public ContaCorrente(int numero, int agencia) throws Exception {
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
}
