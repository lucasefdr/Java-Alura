package edu.lucasefdr.B01Introduction;

public class A04ControlStructures {
    public static void main(String[] args) {
        System.out.println("while structure");
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        count = 1;
        int sum = 0;

        while (count <= 100) {
            sum += count;
            count++;
        }

        System.out.println(sum);

        System.out.println();

        System.out.println("for structure");

        for(int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }


}
