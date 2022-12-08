package com.github.lucasefdr.B07JavaIO.test;

import java.io.*;

public class TesteInputSystem {
    /**
     * Exceção do tipo checked: <b>{@code FileNotFoundException}</b>
     */
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com o console
        InputStream is = System.in;
        Reader r = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(r);

        // Fluxo de saída com arquivo
        OutputStream os = System.out;
        Writer w = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(w);

        String line = br.readLine();

        while (line != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            // libera o buffer
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
