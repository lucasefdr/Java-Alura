package com.github.lucasefdr.B10TDD.test;

import com.github.lucasefdr.B10TDD.model.Funcionario;
import com.github.lucasefdr.B10TDD.model.Desempenho;
import com.github.lucasefdr.B10TDD.service.ReajusteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {
    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("1700"));
    }

    @Test
    void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1751.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1955.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("2040.00"), funcionario.getSalario());
    }
}
