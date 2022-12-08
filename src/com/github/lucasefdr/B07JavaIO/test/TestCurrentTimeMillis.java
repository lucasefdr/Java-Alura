package com.github.lucasefdr.B07JavaIO.test;

import java.io.*;

public class TestCurrentTimeMillis {
    public static void main(String[] args) throws IOException {
        // Testando performance

        long ini = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream("teste_currentTimeMillis.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.write("teste FileOutputStream, OutputStreamWriter, BufferedWriter");
        bw.newLine();

        long end = System.currentTimeMillis();
        System.out.println("FOS, OSW, BW = " + (end - ini));
    }
}
