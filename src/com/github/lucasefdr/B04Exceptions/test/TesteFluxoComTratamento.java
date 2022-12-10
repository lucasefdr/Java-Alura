package com.github.lucasefdr.B04Exceptions.test;

import com.github.lucasefdr.B04Exceptions.model.Conta;

public class TesteFluxoComTratamento {
    /**
     * Exemplo de call stack
     */
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException | NullPointerException ex) {
            // ex.printStackTrace();
            String msg = ex.getClass().getSimpleName() + ": " + ex.getMessage();
            System.out.println(msg);
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // int a = i / 0;
            Conta c = null;
            try {
                c.deposita();
            } catch (Exception ex) {
                String msg = ex.getClass().getSimpleName() + ": " + ex.getMessage();
                System.out.println(msg);
            }
        }
        System.out.println("Fim do metodo2");
    }
}