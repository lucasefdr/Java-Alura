package edu.lucasefdr.B03OOP2.model;

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

    // sobrescrevendo métodos
    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do Designer");
        return super.getBonificacao() + super.getSalario() + 200;
    }
}
