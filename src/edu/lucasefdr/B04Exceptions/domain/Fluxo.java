package edu.lucasefdr.B04Exceptions.domain;

public class Fluxo {
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
            String message = ex.getClass().getSimpleName() + ": " + ex.getMessage();
            System.out.println(message);
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        // "Jogando" a exception para baixo
        throw new ArithmeticException("throw exception");
        // System.out.println("Fim do metodo2");
    }
}