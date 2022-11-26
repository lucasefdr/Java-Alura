package com.github.lucasefdr.B03OOP2.test;

import com.github.lucasefdr.B03OOP2.model.banco.ContaCorrente;
import com.github.lucasefdr.B03OOP2.model.banco.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente(1111, 9999);
        cc.deposita(900);

        ContaPoupanca cp = new ContaPoupanca(9999, 3333);
        cp.deposita(200);

        // a ContaCorrente tem uma taxa de 2% no caso de 'saque'
        // como o método 'transfere' usa o método de 'saque', há um desconto de R$ 6,00 na transferência
        cc.transfere(300, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.saca(100);
        System.out.println(cc.getSaldo());
    }
}
