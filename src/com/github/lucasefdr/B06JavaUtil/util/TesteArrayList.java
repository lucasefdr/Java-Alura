package com.github.lucasefdr.B06JavaUtil.util;

import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(9002, 333);
        Conta cc2 = new ContaCorrente(8762, 220);
        Conta cc3 = new ContaCorrente(3392, 112);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();
        System.out.println("Primeiro elemento da lista: " + lista.get(0).toString());
        System.out.println("Segundo elemento da lista: " + lista.get(1).toString());
        System.out.println("Terceiro elemento da lista: " + lista.get(2).toString());

        lista.remove(1);

        System.out.println();

        for (Object conta : lista) {
            System.out.println(conta);
        }


    }
}
