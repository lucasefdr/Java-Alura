package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.banco.AcaoBolsa;
import com.github.lucasefdr.B03OOP2.model.banco.CalculadorDeImposto;
import com.github.lucasefdr.B03OOP2.model.banco.ContaCorrente;

public class TesteCalculadorImposto {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposita(1000);

        AcaoBolsa acaoBolsa = new AcaoBolsa();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(acaoBolsa);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
