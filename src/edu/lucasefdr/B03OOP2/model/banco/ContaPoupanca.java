package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B02OOP1.model.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    // construtor específico da classe mãe
    public ContaPoupanca(int numero, int agencia) throws Exception {
        super(numero, agencia);
    }


}
