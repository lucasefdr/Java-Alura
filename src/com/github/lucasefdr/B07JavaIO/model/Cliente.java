package com.github.lucasefdr.B07JavaIO.model;

import java.io.Serial;
import java.io.Serializable;

public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String nome;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
