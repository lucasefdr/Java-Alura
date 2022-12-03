package com.github.lucasefdr.B06JavaUtil.util;

import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.ContaPoupanca;

import java.util.ArrayList;

public class ArrayListEqualsEx {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        ContaCorrente cc1 = new ContaCorrente(9002, 333);
        ContaCorrente cc2 = new ContaCorrente(8762, 220);
        ContaCorrente cc3 = new ContaCorrente(3392, 112);
        ContaPoupanca cp1 = new ContaPoupanca(3424, 330);
        ContaPoupanca cp2 = new ContaPoupanca(1624, 332);
        ContaPoupanca cp3 = new ContaPoupanca(1624, 332);

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);

        boolean contaExiste;
        String mensagemSeExiste;

        contaExiste = contas.contains(cp2);
        mensagemSeExiste = contaExiste ? "A conta existe" : "A conta não existe";

        System.out.println(mensagemSeExiste);

        contaExiste = contas.contains(cp3);
        mensagemSeExiste = contaExiste ? "A conta existe" : "A conta não existe";

        System.out.println(mensagemSeExiste);

        boolean isEqualsTo = cp2.equals(cp3);
        if (isEqualsTo) System.out.println("A agência e número das contas cp2 e cp3 são iguais");
    }
}
