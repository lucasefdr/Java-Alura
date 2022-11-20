package edu.lucasefdr.B03OOP2.model;

/**
 * Gerente <strong>é</strong> um Funcionário. <br>
 * Gerente <strong>herda</strong> de Funcionário.
 */
public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    // Sobrescrevendo métodos
    @Override
    public double getBonificacao() {
        return this.salario * 0.5;
    }
}
