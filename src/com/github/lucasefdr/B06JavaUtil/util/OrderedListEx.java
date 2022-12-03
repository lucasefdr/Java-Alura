package com.github.lucasefdr.B06JavaUtil.util;

import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderedListEx {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(41241, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(12334, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(87632, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(11245, 22);
        cc4.deposita(222.0);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        for (Conta contas : listaDeContas) {
            System.out.println(contas);
        }

        ListaDeContasComparator comparator = new ListaDeContasComparator();

        System.out.println("\nOrdenando listas com o comparator\n");
        // Ordenando a listaDeContas
        listaDeContas.sort(comparator);

        for (Conta contas : listaDeContas) {
            System.out.println(contas);
        }
    }
}

/**
 * Implementação de classe para ordenar listas
 */
class ListaDeContasComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        /*if (c1.getNumero() > c2.getNumero()) return 1;
        if (c1.getNumero() < c2.getNumero()) return -1;
        return 0;*/

        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}