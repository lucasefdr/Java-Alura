package edu.lucasefdr.B04Exceptions.test;

import edu.lucasefdr.B04Exceptions.model.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        // Conexao conexao = null;\

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception e) {
            String message = e.getClass().getSimpleName() + ": " + e.getMessage();
            System.out.println(message);
        }

        /*try {
            conexao = new Conexao();
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Erro na conexão");
        } finally {
            assert conexao != null;
            conexao.fecha();
        }*/
    }
}
