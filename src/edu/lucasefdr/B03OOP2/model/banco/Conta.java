package edu.lucasefdr.B03OOP2.model.banco;

import edu.lucasefdr.B02OOP1.model.Cliente;

/**
 * <strong>Classes abstratas:</strong> abstração do mundo real. "Não existe" e não pode ser instanciada.
 */
public abstract class Conta {
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

    public Conta(int numero, int agencia) throws Exception {
        if (numero <= 0) throw new Exception("Número da conta não pode ser 0 ou negativo");
        if (agencia <= 0) throw new Exception("Número da conta não pode ser 0 ou negativo");
        this.agencia = agencia;
        this.numero = numero;
    }

    /**
     * <strong>Métodos:</strong> são as ações que um objeto instanciado através da classe pode realizar.
     */
    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo <= valor) {
            return false;
        }
        this.saca(valor);
        destino.deposita(valor);
        return true;
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
}

