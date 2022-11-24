package edu.lucasefdr.B04Exceptions.test;

import edu.lucasefdr.B04Exceptions.model.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexao = null;

        try {
            conexao = new Conexao();
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Erro na conexão");
        } finally {
            assert conexao != null;
            conexao.fecha();
        }
    }
}
