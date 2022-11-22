package edu.lucasefdr.B03OOP2;

public class Interface {
    public static void main(String... args) {
        Cliente cliente = new Cliente();
        cliente.autentica();

        Gerente gerente = new Gerente();
        gerente.autentica();
    }
}

interface Autenticavel {
    void autentica();
}

class Cliente implements Autenticavel {
    @Override
    public void autentica() {
        System.out.println("Cliente autenticado");
    }
}

class Gerente implements Autenticavel {
    @Override
    public void autentica() {
        System.out.println("Gerente autenticado");
    }
}

