package edu.lucasefdr.B03OOP2.test;

import edu.lucasefdr.B03OOP2.model.empresa.Gerente;
import edu.lucasefdr.B03OOP2.model.empresa.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
    }
}
