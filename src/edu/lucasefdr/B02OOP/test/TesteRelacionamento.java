package edu.lucasefdr.B02OOP.test;

import edu.lucasefdr.B02OOP.model.Cliente;
import edu.lucasefdr.B02OOP.model.Conta;

public class TesteRelacionamento {
    public static void main(String... args) {
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas Eduardo Ferreira da Rosa";
        lucas.cpf = "999.999.999-99";
        lucas.profissao = "Desenvolvedor";

        Conta contaDoLucas = new Conta();
        contaDoLucas.titular = lucas;
        System.out.println("Nome do titular: " + contaDoLucas.titular.nome);
    }
}
