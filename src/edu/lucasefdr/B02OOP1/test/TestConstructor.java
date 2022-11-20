package edu.lucasefdr.B02OOP1.test;

import edu.lucasefdr.B02OOP1.model.Conta;

public class TestConstructor {
    public static void main(String[] args) throws Exception {
        Conta novaConta1 = new Conta(9999, 12);
        Conta novaConta2 = new Conta(1111, 94);

        // Conta novaContaException = new Conta(9999, 0);

        System.out.println("Total de contas acessando pelo método static: " + Conta.getTotalDeContas());
    }
}
