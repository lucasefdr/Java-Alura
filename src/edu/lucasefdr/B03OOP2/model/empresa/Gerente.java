package edu.lucasefdr.B03OOP2.model.empresa;

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

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do Gerente");
        return super.getSalario() + 400;
    }
}
