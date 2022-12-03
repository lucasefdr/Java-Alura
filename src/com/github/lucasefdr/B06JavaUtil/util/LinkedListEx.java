package com.github.lucasefdr.B06JavaUtil.util;

import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Conta> lista = new LinkedList<>();

        ContaCorrente cc1 = new ContaCorrente(9002, 333);
        ContaCorrente cc2 = new ContaCorrente(8762, 220);
        ContaCorrente cc3 = new ContaCorrente(3392, 112);
        ContaPoupanca cp1 = new ContaPoupanca(3424, 330);
        ContaPoupanca cp2 = new ContaPoupanca(1624, 332);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cp1);
        lista.add(cp2);

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();
        System.out.println("Primeiro elemento da lista: " + lista.get(0).toString());
        System.out.println("Segundo elemento da lista: " + lista.get(1).toString());
        System.out.println("Terceiro elemento da lista: " + lista.get(2).toString());

        lista.remove(1);

        System.out.println();

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
