package edu.lucasefdr.B03OOP2.model.empresa;

/**
 * Administrador <strong>é</strong> um Funcionário. <br>
 * Administrador <strong>herda</strong> de Funcionário.
 * Administrador <strong>implementa</strong> a classe Autenticavel.
 */
public class Administrador extends Funcionario implements Autenticavel {
    private int senha;

    public Administrador() {
    }

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do Gerente");
        return super.getSalario() + 650;
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
