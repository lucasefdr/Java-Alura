package com.github.lucasefdr.B04Exceptions.model;

/**
 * Interface <strong>AutoCloseable:</strong> implementa o método close para fechar automaticamente, tornando o finally implícito
 */
public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException("Erro ao ler dados");
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}