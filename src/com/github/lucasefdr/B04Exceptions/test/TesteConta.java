package com.github.lucasefdr.B04Exceptions.test;

import com.github.lucasefdr.B04Exceptions.model.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = null;

        try {
            c.deposita();
        } catch (Exception exception) {
            String msg = exception.getClass().getSimpleName();
            System.out.println(msg);
        }
    }
}
