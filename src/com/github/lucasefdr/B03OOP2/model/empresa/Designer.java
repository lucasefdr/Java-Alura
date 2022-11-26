package com.github.lucasefdr.B03OOP2.model.empresa;

/**
 * Gerente <strong>é</strong> um Funcionário. <br>
 * Gerente <strong>herda</strong> de Funcionário.
 */
public class Designer extends Funcionario {

    public Designer() {
    }

    public Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do Designer");
        return super.getSalario() + 200;
    }
}
