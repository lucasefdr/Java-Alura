package com.github.lucasefdr.B06JavaUtil.util;

import com.github.lucasefdr.B06JavaUtil.model.Cliente;
import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasEx {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(90, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(33, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(43, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(12, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        // method reference
        listaDeContas.forEach(System.out::println);

        // Implementando uma função lambda para a classe Comparator usando o sort de String
        listaDeContas.sort((c1, c2) -> {
            String nomeTitularC1 = c1.getTitular().getNome();
            String nomeTitularC2 = c2.getTitular().getNome();
            return nomeTitularC1.compareTo(nomeTitularC2);
        });

        System.out.println();

        // method reference
        listaDeContas.forEach(System.out::println);

        // Implementando uma função lambda para a classe Comparator usando o sort de Integer
        listaDeContas.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        System.out.println();

        // method reference
        listaDeContas.forEach(System.out::println);

        listaDeContas.sort(Comparator.comparingInt(Conta::getNumero));
    }
}
