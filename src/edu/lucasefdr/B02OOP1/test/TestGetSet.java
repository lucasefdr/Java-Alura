package edu.lucasefdr.B02OOP1.test;

import edu.lucasefdr.B02OOP1.model.Cliente;
import edu.lucasefdr.B02OOP1.model.Conta;

public class TestGetSet {
    public static void main(String... args) {
        Cliente clienteLucas = new Cliente();
        clienteLucas.setNome("Lucas Eduardo Ferreira da Rosa");
        clienteLucas.setCpf("999.999.999-99");
        clienteLucas.setProfissao("Desenvolvedor");

        Conta contaDoLucas = new Conta();
        contaDoLucas.setTitular(clienteLucas);
        contaDoLucas.deposita(700);

        System.out.println("Titular da conta: " + contaDoLucas.getTitular().getNome());
        System.out.println("Saldo da conta: R$" + contaDoLucas.getSaldo());
    }
}
