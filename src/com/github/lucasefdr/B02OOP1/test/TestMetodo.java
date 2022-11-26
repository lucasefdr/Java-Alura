package com.github.lucasefdr.B02OOP1.test;

import com.github.lucasefdr.B02OOP1.model.Conta;

public class TestMetodo {
    public static void main(String... args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(560);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        // método com retorno
        boolean conseguiuRetirar = primeiraConta.saca(500);
        if (conseguiuRetirar) System.out.println("O saque foi feito com sucesso");
        System.out.println("Saldo primeiraConta: R$" + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);
        System.out.println("Saldo segundaConta: R$" + segundaConta.getSaldo());

        System.out.println();

        if (segundaConta.transfere(300, primeiraConta)) {
            System.out.println("Transferência realizada com sucesso");
            System.out.println("Saldo primeiraConta: R$" + primeiraConta.getSaldo());
            System.out.println("Saldo segundaConta: R$" + segundaConta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }

    }
}
