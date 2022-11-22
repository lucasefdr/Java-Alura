package edu.lucasefdr.B03OOP2.model.empresa;

import edu.lucasefdr.B03OOP2.model.empresa.Gerente;

public class SistemaInterno {

    public void autentica(Autenticavel autenticavel) {
        int senha = 2222;
        boolean autenticou = autenticavel.autentica(senha);

        if (autenticou) System.out.println("Pode entrar no sistema");
        else System.out.println("Não pode entrar no sistema");
    }
}
