package com.github.lucasefdr.B10TDD.test;

import com.github.lucasefdr.B10TDD.model.Funcionario;
import com.github.lucasefdr.B10TDD.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService bonusService = new BonusService();
        assertThrows(IllegalArgumentException.class,
                () -> bonusService.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("12000"))));

        try {
            bonusService.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("12000")));
            fail("Não deu a exception");
        } catch (Exception e) {
            assertEquals("O funcionário tem salário maior que R$ 10.000,00", e.getMessage());;
        }
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("7000")));

        // Utilzizando com o import static
        assertEquals(new BigDecimal("700.0"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeDezMil() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000")));

        // Utilzizando com o import static
        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}