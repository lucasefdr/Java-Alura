package com.github.lucasefdr.B07JavaIO.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {
    /**
     * Exceção do tipo checked: <b>{@code FileNotFoundException}</b>
     */
    public static void main(String[] args) throws IOException {
        // Classe para trabalhar direto com escrita
        FileWriter fw = new FileWriter("loremwriter.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bwInLine = new BufferedWriter(new FileWriter("loremwriter.txt"));

        // fw.write("testando FileWriter");
        // fw.write(System.lineSeparator()); // retorna uma string de acordo com o sistema operacional par a \r\n
        // fw.write("testando FileWriter e continuando...");

        bw.write("testando FileWriter");
        bw.newLine();
        bw.write("testando FileWriter e continuando...");

        fw.close();
    }
}
