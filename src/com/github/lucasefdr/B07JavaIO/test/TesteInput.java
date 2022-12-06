package com.github.lucasefdr.B07JavaIO.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteInput {
    /**
     * Exceção do tipo checked: <b>{@code FileNotFoundException}</b>
     */
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo
        // Lê binário
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");

        // Essa classe sabe ler um FileInputStream - transforma os bits e bytes em caracter
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        // Essa classe guarda os caracteres em um buffer
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String linha = bufferedReader.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
