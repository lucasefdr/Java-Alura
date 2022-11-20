package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Conta;

public class TestaConta {
    public static void main(String... args) {
        // criando e instanciando um objeto
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 250;
        System.out.println(segundaConta.saldo);

        // os objetos são referências de memória e não valor
        Conta terceiraConta = primeiraConta;
        terceiraConta.saldo = 500;
        System.out.println(primeiraConta);
        System.out.println(terceiraConta);

        if (primeiraConta == terceiraConta) System.out.println("é a mesma conta");
    }
}
