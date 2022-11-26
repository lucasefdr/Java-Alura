package com.github.lucasefdr.B06JavaUtil.test;

import com.github.lucasefdr.B06JavaUtil.model.Cliente;
import com.github.lucasefdr.B06JavaUtil.model.Object;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.ContaPoupanca;

public class TesteArrayReference {
    public static void main(String[] args) {

        Object cc1 = new ContaPoupanca(2244, 333);
        Object cc2 = new ContaCorrente(1199, 999);
        Cliente c1 = new Cliente();
        c1.setNome("Lucas Eduardo");

        java.lang.Object[] referencias = new java.lang.Object[10];
        referencias[0] = cc1;
        referencias[1] = cc2;
        referencias[2] = c1;

        // type cast para indicar que a Conta do array é uma ContaCorrente
        ContaCorrente refContaCorrente = (ContaCorrente) referencias[1];
        Cliente refClente = (Cliente) referencias[2];

        // cc2, contaCorrentes2 e ref apontam para o MESMO objeto
        System.out.println(cc2.getNumero());
        // System.out.println(referencias[1].getNumero());
        System.out.println(refContaCorrente.getNumero());

        System.out.println();

        System.out.println(refClente.getNome());

        System.out.println();

        refContaCorrente.setTitular(c1);

        System.out.println(cc2.getTitular().getNome());
        // System.out.println(referencias[1].getTitular().getNome());
        System.out.println(refContaCorrente.getTitular().getNome());
    }
}
