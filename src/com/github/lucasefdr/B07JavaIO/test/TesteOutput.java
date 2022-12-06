package com.github.lucasefdr.B07JavaIO.test;

import java.io.*;

public class TesteOutput {
    /**
     * Exceção do tipo checked: <b>{@code FileNotFoundException}</b>
     */
    public static void main(String[] args) throws IOException {
        // Fluxo de saída com arquivo
        // Escreve em binário
        FileOutputStream fileOutputStream = new FileOutputStream("loremwriter.txt");

        // Essa classe sebe escrever um FileInputStream - transforma os bits e bytes em caracter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        // Essa classe guarda os caracteres em um buffer
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("treinando java.io");
        bufferedWriter.newLine();
        bufferedWriter.write("treinando java.io - new line");
        bufferedWriter.close();

        FileInputStream fis = new FileInputStream("loremwriter.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
