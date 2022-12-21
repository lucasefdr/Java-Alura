package com.github.lucasefdr.B10TDD.service;

import com.github.lucasefdr.B10TDD.model.Funcionario;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("O funcionário tem salário maior que R$ 10.000,00");
        }
        return valor;
    }
}
