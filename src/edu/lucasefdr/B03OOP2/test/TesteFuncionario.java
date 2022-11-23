package edu.lucasefdr.B03OOP2.test;

import edu.lucasefdr.B03OOP2.model.empresa.Gerente;

public class TesteFuncionario {
    public static void main(String... args) {
        Gerente lucas = new Gerente("Lucas Ferreira", "999-999-111-11", 4400);
        lucas.imprimeInformacoes();
    }
}
