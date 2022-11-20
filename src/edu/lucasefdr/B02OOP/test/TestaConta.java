package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Conta;

public class TestaConta {
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
