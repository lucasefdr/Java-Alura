package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.banco.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(400);
        try {
            conta.saca(518);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
