package com.github.lucasefdr.B06JavaUtil.model;

public class GuardadorDeRefs {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeRefs() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
