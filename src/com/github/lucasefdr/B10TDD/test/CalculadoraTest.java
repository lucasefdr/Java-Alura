package com.github.lucasefdr.B10TDD.test;

import com.github.lucasefdr.B10TDD.model.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    @Test
    void deveriaSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(40, 12);

        // Asserte que o resultado (expected) da soma seja 52
        Assertions.assertEquals(52, soma);
    }
}