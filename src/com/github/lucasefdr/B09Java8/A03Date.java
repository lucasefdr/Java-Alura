package com.github.lucasefdr.B09Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class A03Date {
    public static void main(String[] args) {
        // Nova API de datas
        LocalDate hoje = LocalDate.now();

        LocalDate copaDoMundoUSA = LocalDate.of(2026, Month.JUNE, 14);
        System.out.println(copaDoMundoUSA);

        Period periodo = Period.between(hoje, copaDoMundoUSA);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = copaDoMundoUSA.format(formatter);
        System.out.println(dataFormatada);

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatter));
    }
}
