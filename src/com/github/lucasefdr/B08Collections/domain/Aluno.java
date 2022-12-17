package com.github.lucasefdr.B08Collections.domain;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroMatricula;

    public Aluno(String nome, Integer numeroMatricula) {
        if (nome == null) throw new NullPointerException("Nome não pode ser nulo");
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + this.nome + ", número da matrícula: " + this.numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
