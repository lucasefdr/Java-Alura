package edu.lucasefdr.B02OOP.model;

public class Conta {
    // atributos
    // encapsulamento: private
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

