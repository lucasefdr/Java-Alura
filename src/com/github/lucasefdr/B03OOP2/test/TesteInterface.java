package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.empresa.Administrador;
import com.github.lucasefdr.B03OOP2.model.empresa.Cliente;
import com.github.lucasefdr.B03OOP2.model.empresa.Gerente;
import com.github.lucasefdr.B03OOP2.model.empresa.SistemaInterno;

public class TesteInterface {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(1111);

        Administrador administrador = new Administrador();
        administrador.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(3333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }
}
