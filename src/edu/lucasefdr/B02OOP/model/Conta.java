package edu.lucasefdr.B02OOP.model;

public class Conta {
    // atributos
    public double saldo;
    public int agencia;
    public int numero;
    public String titular;

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
}
