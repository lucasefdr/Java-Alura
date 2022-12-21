package com.github.lucasefdr.B10TDD.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    // Parâmetros
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    // Construtor
    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void reajustarSalario(BigDecimal reajuste) {
        this.salario = this.salario.add(reajuste);
    }
}
