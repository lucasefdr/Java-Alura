package com.github.lucasefdr.B07JavaIO.test;

import com.github.lucasefdr.B07JavaIO.model.Cliente;

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
        ois.close();

        // Transformando um objeto Cliente em um stream de bits e bytes
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Eduardo");
        cliente.setProfissao("Desenvolvedor");

//        ObjectOutputStream oosCliente = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oosCliente.writeObject(cliente);
//        oosCliente.close();

        // Transformando um binário para um stream de caracteres
        ObjectInputStream oisCliente = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente objectInputCliente = (Cliente) oisCliente.readObject();
        System.out.println(objectInputCliente.getNome());
        System.out.println(objectInputCliente.getProfissao());
        oisCliente.close();
    }
}
