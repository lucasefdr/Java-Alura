package edu.lucasefdr.B03OOP2.model.empresa;

public class Cliente implements Autenticavel {
    private int senha;

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
