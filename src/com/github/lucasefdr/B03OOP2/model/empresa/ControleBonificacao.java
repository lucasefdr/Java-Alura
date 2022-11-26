package com.github.lucasefdr.B03OOP2.model.empresa;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
