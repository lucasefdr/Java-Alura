package com.github.lucasefdr.B08Collections.domain;

public class Aluno {
    private String nome;
    private Integer numeroMatricula;

    public Aluno(String nome, Integer numeroMatricula) {
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
}
