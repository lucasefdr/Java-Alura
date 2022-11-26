package com.github.lucasefdr.B03OOP2.model.empresa;

public class AutenticacaoUtil {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
