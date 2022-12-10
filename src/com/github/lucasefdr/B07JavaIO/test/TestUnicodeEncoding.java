package com.github.lucasefdr.B07JavaIO.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestUnicodeEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "C";
        // retorna o valor da tabela Unicode
        System.out.println(s.codePointAt(0));

        // padrão de caracter da máquina
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName()); // UTF-8

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " byte UTF-8");

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length + " byte UTF-16");

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + " byte US-ASCII");

        String newString = new String(bytes, StandardCharsets.UTF_16);
        System.out.println(newString);
    }
}
