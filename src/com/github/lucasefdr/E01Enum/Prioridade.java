package com.github.lucasefdr.E01Enum;

/**
 * <strong>Enum</strong> serve para criarmos constantes.<br>
 * Não é possível instanciar uma enumeração.
 */
public enum Prioridade {
    // 0, 1, 2...
    MIN(1), NORMAL(5), MAX(10);

    private final int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
