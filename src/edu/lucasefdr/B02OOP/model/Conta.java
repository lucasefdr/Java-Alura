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
}
