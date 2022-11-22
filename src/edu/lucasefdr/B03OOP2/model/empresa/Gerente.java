package edu.lucasefdr.B03OOP2.model.empresa;

/**
 * Gerente <strong>é</strong> um Funcionário. <br>
 * Gerente <strong>herda</strong> de Funcionário. <br>
 * Gerente <strong>implementa</strong> a classe Autenticavel.
 */
public class Gerente extends Funcionario implements Autenticavel {
    /**
     * <strong>Injetando</strong> a classe AutenticacaoUtil
     */
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do Gerente");
        return super.getSalario() + 400;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
