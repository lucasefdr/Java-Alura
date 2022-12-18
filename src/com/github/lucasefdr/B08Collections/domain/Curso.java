package com.github.lucasefdr.B08Collections.domain;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + ", aulas: " + aulas + "]";
    }


    public boolean estaMatriculado(Aluno aluno) {
        return getAlunos().contains(aluno);
    }

    public Aluno buscaMatricula(Integer numeroMatricula) {
        if (!matriculaParaAluno.containsKey(numeroMatricula))
            throw new NoSuchElementException("Matrícula não encontrada");

        return matriculaParaAluno.get(numeroMatricula);
    }

}
