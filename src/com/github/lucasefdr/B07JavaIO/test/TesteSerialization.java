package com.github.lucasefdr.B07JavaIO.test;

import java.io.*;

public class TesteSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String name = "Lucas Eduardo Ferreira da Rosa";

        // Transformando um objeto em um fluxo de bits e bytes
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(name);
        oos.close();

        // Transformando um binário para um fluxo de caracteres
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String objectInput = (String) ois.readObject();
        System.out.println(objectInput);
    }
}
