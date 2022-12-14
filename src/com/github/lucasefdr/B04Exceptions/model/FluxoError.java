package com.github.lucasefdr.B04Exceptions.model;

public class FluxoError {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    /**
     * Forçando erro na JVM
     */
    private static void metodo2() {
        System.out.println("Ini do metodo 2");
        metodo2();
        System.out.println("Fim do metodo 2");
    }
}