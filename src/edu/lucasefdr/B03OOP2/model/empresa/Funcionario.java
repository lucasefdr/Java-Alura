package edu.lucasefdr.B03OOP2.model.empresa;

/**
 * <strong>Classes abstratas</strong>: abstração do mundo real. "Não existe" e não pode ser instanciada.
 */
public abstract class Funcionario {
    // modificador de acesso protected = os 'filhos' também enxergam os atributos
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getBonificacao() {
        return getSalario() * 0.1;
    }

    public void imprimeInformacoes() {
        System.out.println("Nome do funcionário: " + this.getNome());
        System.out.println("CPF do funcionário: " + this.cpf);
        System.out.println("Salário do funcionário: R$" + this.salario);
        System.out.println("Bonificação: R$" + getBonificacao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
