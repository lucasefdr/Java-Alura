package edu.lucasefdr.B03OOP2.test;

import edu.lucasefdr.B03OOP2.model.Funcionario;

public class TestFuncionario {
    public static void main(String... args) {
        Funcionario lucas = new Funcionario("Lucas Ferreira", "999-999-111-11", 7400);
        lucas.imprimeInformacoes();
    }
}
