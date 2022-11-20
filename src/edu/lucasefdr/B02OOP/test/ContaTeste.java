package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Conta;

public class ContaTeste {
    public static void main(String... args) {
        // criando e instanciando um objeto
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
    }
}
