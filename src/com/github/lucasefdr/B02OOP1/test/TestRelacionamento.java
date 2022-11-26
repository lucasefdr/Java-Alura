package com.github.lucasefdr.B02OOP1.test;

import com.github.lucasefdr.B02OOP1.model.Cliente;
import com.github.lucasefdr.B02OOP1.model.Conta;

public class TestRelacionamento {
    public static void main(String... args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Eduardo Ferreira da Rosa");
        lucas.setCpf("999.999.999-99");
        lucas.setProfissao("Desenvolvedor");

        Conta contaDoLucas = new Conta();
        contaDoLucas.setTitular(lucas);
        System.out.println("Nome do titular: " + contaDoLucas.getTitular().getNome());
    }
}
