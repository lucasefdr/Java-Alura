package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.empresa.Gerente;
import com.github.lucasefdr.B03OOP2.model.empresa.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
    }
}
