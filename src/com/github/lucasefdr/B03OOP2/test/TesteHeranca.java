package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.empresa.Designer;
import com.github.lucasefdr.B03OOP2.model.empresa.Gerente;

public class TesteHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", "999-333-444-11", 4000);
        Designer designer = new Designer("Gerente", "444-111-222-99", 4000);

        gerente.imprimeInformacoes();
        System.out.println();
        designer.imprimeInformacoes();
    }
}
