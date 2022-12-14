package com.github.lucasefdr.B06JavaUtil.model;

import com.github.lucasefdr.B03OOP2.exception.SacaException;

/**
 * <strong>Classes abstratas:</strong> abstração do mundo real. "Não existe" e não pode ser instanciada.
 */
public abstract class Conta implements Comparable<Conta> {
    /**
     * <strong>Atributos:</strong> são as propriedades das classes
     */
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    /**
     * <strong>Construtores:</strong> indicam o que será passado como argumentos na hora da instanciação dos objetos.
     */
    public Conta() {
        Conta.totalDeContas++;
        System.out.println("Total de contas: " + totalDeContas);
    }

    public Conta(int numero, int agencia) throws RuntimeException {
        if (numero <= 0) throw new RuntimeException("Número da conta não pode ser 0 ou negativo");
        if (agencia <= 0) throw new RuntimeException("Número da conta não pode ser 0 ou negativo");
        this.agencia = agencia;
        this.numero = numero;
    }

    /**
     * <strong>Métodos:</strong> são as ações que um objeto instanciado através da classe pode realizar.
     */
    public abstract void deposita(double valor);

    public void saca(double valor) throws SacaException {
        if (this.saldo <= valor) {
            throw new SacaException("Saldo: R$" + this.saldo + ", Valor: R$" + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SacaException {
        // Usamos o método saca(valor) primeiro pois se o mesmo der erro, ele já sai do método
        this.saca(valor);
        destino.deposita(valor);
    }

    /**
     * <strong>Getters:</strong> usado para "obter" valores que não são públicos.
     */
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    /**
     * <strong>Setters:</strong> usados para "modificar" valores que não são públicos.
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Saldo = R$" + saldo + ", Agência = " + agencia + ", Número = " + numero + ", titular = " + titular.getNome();
    }

    /**
     * O método {@code equals} é usado para implementar uma regra de negócio para comparar os objetos
     *
     * @param ref
     * @return {@code true} se os objetos são iguais de acordo com a regra implementada
     */
    @Override
    public boolean equals(Object ref) {
        if (this == ref) return true;
        if (ref == null || getClass() != ref.getClass()) return false;

        Conta conta = (Conta) ref;

        if (agencia != conta.agencia) return false;
        return numero == conta.numero;
    }

    @Override
    public int hashCode() {
        int result = agencia;
        result = 31 * result + numero;
        return result;
    }


    /**
     * Ordenando as contas pro saldo
     */
    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }
}


