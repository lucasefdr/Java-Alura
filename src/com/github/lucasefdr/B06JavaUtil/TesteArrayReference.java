package com.github.lucasefdr.B06JavaUtil;

public class TesteArrayReference {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(2244, 333);
        ContaCorrente cc2 = new ContaCorrente(1199, 999);
        Cliente c1 = new Cliente();
        c1.setNome("Lucas Eduardo");

        ContaCorrente[] contaCorrentes = new ContaCorrente[2];
        contaCorrentes[0] = cc1;
        contaCorrentes[1] = cc2;

        ContaCorrente ref = contaCorrentes[1];

        // cc2, contaCorrentes2 e ref apontam para o MESMO objeto
        System.out.println(cc2.getNumero());
        System.out.println(contaCorrentes[1].getNumero());
        System.out.println(ref.getNumero());

        ref.setTitular(c1);

        System.out.println(cc2.getTitular().getNome());
        System.out.println(contaCorrentes[1].getTitular().getNome());
        System.out.println(ref.getTitular().getNome());
    }
}
