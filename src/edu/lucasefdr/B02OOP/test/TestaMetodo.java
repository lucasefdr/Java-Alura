package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Conta;

public class TestaMetodo {
    public static void main(String... args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 560;
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.saldo);

        // método com retorno
        boolean conseguiuRetirar = primeiraConta.saca(500);
        if (conseguiuRetirar) System.out.println("O saque foi feito com sucesso");
        System.out.println("Saldo primeiraConta: R$" + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);
        System.out.println("Saldo segundaConta: R$" + segundaConta.saldo);

        System.out.println();

        if (segundaConta.transfere(300, primeiraConta)) {
            System.out.println("Transferência realizada com sucesso");
            System.out.println("Saldo primeiraConta: R$" + primeiraConta.saldo);
            System.out.println("Saldo segundaConta: R$" + segundaConta.saldo);
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }

    }
}
