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
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
    }
}
