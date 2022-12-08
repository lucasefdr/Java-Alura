package com.github.lucasefdr.B07JavaIO.test;

import java.io.*;

public class TestePrintWriter {
    /**
     * Exceção do tipo checked: <b>{@code FileNotFoundException}</b>
     */
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("loremwriter.txt");
        ps.println("testando PrintStream");
        ps.println();
        ps.println("testando PrintStream e continuando");
        ps.close();

        PrintWriter psTesteCaminhoArquivo = new PrintWriter(new File("src/com/github/lucasefdr/B07JavaIO/testecaminho.txt"));
        psTesteCaminhoArquivo.println("Escrevendo no arquivo especificado pelo caminho");
    }
}
