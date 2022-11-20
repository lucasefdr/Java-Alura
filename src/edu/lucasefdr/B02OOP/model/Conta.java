package edu.lucasefdr.B02OOP.model;

public class Conta {
    // atributos
    // encapsulamento: private
    private double getSaldo;
    private int agencia;
    private int numero;
    public Cliente titular;

    // métodos
    public void deposita(double valor) {
        this.getSaldo += valor;
    }

    public boolean saca(double valor) {
        if (this.getSaldo >= valor) {
            this.getSaldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.getSaldo <= valor) {
            return false;
        }
        this.saca(valor);
        destino.deposita(valor);
        return true;
    }

    // getter
    public double getSaldo() {
        return getSaldo;
    }
}
