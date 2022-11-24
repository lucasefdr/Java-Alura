package edu.lucasefdr.B03OOP2.test;

import edu.lucasefdr.B03OOP2.model.banco.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(400);
        conta.saca(518);
    }
}
