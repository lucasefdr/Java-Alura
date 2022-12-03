package com.github.lucasefdr.B06JavaUtil.util;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx {
    public static void main(String[] args) {
        int idade = 30;
        // Uma lista só aceita referências
        List<Integer> idadesList = new ArrayList<>();

        // Autoboxing -> o Java transforma o tipo primitivo int para Integer
        idadesList.add(idade);

        // Convertendo de tipo primitivo para wrapper - Autoboxing
        Integer idadeWrapper = Integer.valueOf(idade);
        // Convertendo de wrapper para tipo primitivo - Unboxing
        int idadePrimitivo = idadeWrapper.intValue();

        String anoString = "1997";
        Integer anoInteger = Integer.valueOf(anoString);
        int anoInt = Integer.parseInt(anoString);

        System.out.println(anoInteger);
        System.out.println(anoInt);

        System.out.println();

        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Integer min value: " + Integer.MIN_VALUE);
        System.out.println("Integer bytes: " + Integer.BYTES);
        System.out.println("Integer bits: " + Integer.SIZE);
        System.out.println("Integer primitive tipe: " + Integer.TYPE);

        System.out.println();

        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
        System.out.println("Double bytes: " + Double.BYTES);
        System.out.println("Double bits: " + Double.SIZE);
        System.out.println("Double primitive tipe: " + Double.TYPE);

        System.out.println();

        // Lista de números a partir da classe genérica Number
        List<Number> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(49.4);
        numeros.add(94F);
        numeros.add(421L);

        for (Number numero : numeros) System.out.println(numero + ", class " + numero.getClass().getSimpleName());
    }
}
