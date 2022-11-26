package com.github.lucasefdr.B02OOP1.test;

import com.github.lucasefdr.B02OOP1.model.Conta;

public class TestConta {
    public static void main(String... args) {
        // criando e instanciando um objeto
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(250);
        System.out.println(segundaConta.getSaldo());

        // os objetos são referências de memória e não valor
        Conta terceiraConta = primeiraConta;
        terceiraConta.deposita(500);
        System.out.println(primeiraConta);
        System.out.println(terceiraConta);

        if (primeiraConta == terceiraConta) System.out.println("é a mesma conta");
    }
}
