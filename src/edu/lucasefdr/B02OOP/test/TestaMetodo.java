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
        System.out.println(primeiraConta.saldo);
    }
}
