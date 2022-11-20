package edu.lucasefdr.B02OOP.model;

public class Conta {
    // atributos
    // encapsulamento: private
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    // constructors
    public Conta() {
    }

    public Conta(int numero, int agencia) throws Exception {
        if (numero <= 0) throw new Exception("Número da conta não pode ser 0 ou negativo");
        if (agencia <= 0) throw new Exception("Número da conta não pode ser 0 ou negativo");
        this.agencia = agencia;
        this.numero = numero;
    }

    // métodos
    public void deposita(double valor) {
        this.saldo += valor;
    }

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

    // getters
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

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

