package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Conta;

public class TestConstructor {
    public static void main(String[] args) throws Exception {
        Conta novaConta = new Conta(9999, 12);
        Conta novaContaException = new Conta(9999, 0);
    }
}
