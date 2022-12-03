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
    }
}
