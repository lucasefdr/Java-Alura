package edu.lucasefdr.B03OOP2.model.empresa;

import edu.lucasefdr.B03OOP2.model.empresa.Gerente;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Gerente gerente) {
        boolean autenticou = gerente.autentica(this.senha);

        if (autenticou) System.out.println("Pode entrar no sistema");
        else System.out.println("Não pode entrar no sistema");
    }
}
