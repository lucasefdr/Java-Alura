package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B02OOP1.model.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    // construtor específico da classe mãe
    public ContaCorrente(int numero, int agencia) throws Exception {
        super(numero, agencia);
    }

    // sobrescrita de método
    @Override
    public boolean saca(double valor) {
        double descontoSaque = valor * 0.02;
        valor += descontoSaque;
        return super.saca(valor);
    }
}
