package com.github.lucasefdr.E01Enum;

public class TesteEnum {
    public static void main(String[] args) {
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);

        Thread thread = new Thread(() -> System.out.println("rodando..."));
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println("Name");
        System.out.println(pMin.name());
        System.out.println(pMax.name());

        System.out.println("Ordinal");
        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

        System.out.println("Valor");
        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());
    }
}
