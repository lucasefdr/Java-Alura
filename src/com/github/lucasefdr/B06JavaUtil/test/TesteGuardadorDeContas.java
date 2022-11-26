package com.github.lucasefdr.B06JavaUtil.test;

import com.github.lucasefdr.B06JavaUtil.model.Object;
import com.github.lucasefdr.B06JavaUtil.model.ContaCorrente;
import com.github.lucasefdr.B06JavaUtil.model.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente contaCorrente1 = new ContaCorrente(2222, 80);
        ContaCorrente contaCorrente2 = new ContaCorrente(1092, 88);

        guardador.adiciona(contaCorrente1);
        guardador.adiciona(contaCorrente2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Object ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
