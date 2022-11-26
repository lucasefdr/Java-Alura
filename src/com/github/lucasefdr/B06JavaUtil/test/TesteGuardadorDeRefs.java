package com.github.lucasefdr.B06JavaUtil.test;

import com.github.lucasefdr.B06JavaUtil.model.Conta;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.GuardadorDeRefs;

public class TesteGuardadorDeRefs {
    public static void main(String[] args) {
        GuardadorDeRefs guardador = new GuardadorDeRefs();

        ContaCorrente contaCorrente1 = new ContaCorrente(2222, 80);
        ContaCorrente contaCorrente2 = new ContaCorrente(1092, 88);

        guardador.adiciona(contaCorrente1);
        guardador.adiciona(contaCorrente2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
