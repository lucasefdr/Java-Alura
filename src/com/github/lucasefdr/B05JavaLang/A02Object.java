package com.github.lucasefdr.B05JavaLang;

public class A02Object {
    public static void main(String[] args) {
        // Todas as classes herdam de Object.
        ContaCorrente contaCorrente = new ContaCorrente();
        Conta conta = new ContaCorrente();
        Object object = new ContaCorrente();

        ContaCorrente contaCorrenteConstructor = new ContaCorrente(2094, 200);
        System.out.println(contaCorrenteConstructor);
        contaCorrenteConstructor.deposita(200);
        System.out.println(contaCorrenteConstructor);
    }
}
