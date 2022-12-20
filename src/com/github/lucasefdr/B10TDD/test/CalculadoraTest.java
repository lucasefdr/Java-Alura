package com.github.lucasefdr.B10TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    @Test
    void deveSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(40, 12);

        // Asserte que o resultado (expected) da soma seja 52
        Assertions.assertEquals(52, soma);
    }
}