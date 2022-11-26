package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.empresa.ControleBonificacao;
import com.github.lucasefdr.B03OOP2.model.empresa.Funcionario;
import com.github.lucasefdr.B03OOP2.model.empresa.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Eduardo Ferreira", "444-111-999-99", 8000);
        gerente.imprimeInformacoes();

        // POLIMORFISMO: é possível instanciar um objeto através de uma referência mais genérica
        Funcionario funcionario = new Gerente();

        // O método recebe um funcionário como parâmetro, porém, Gerente É um Funcionário
        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        System.out.println(controleBonificacao.getSoma());
    }
}
