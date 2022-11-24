package edu.lucasefdr.B04Exceptions.domain;

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
