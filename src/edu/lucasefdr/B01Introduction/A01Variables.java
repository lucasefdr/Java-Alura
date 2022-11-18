package edu.lucasefdr.B01Introduction;

public class A01Variables {
    public static void main(String... args) {
        // declarando variáveis numéricas através de var e int
        var varAge = 22;
        int intAge = 24;

        System.out.println(varAge);
        System.out.println(intAge);

        // declarando variáveis numéricas através de var e double
        var varSalary = 2000.95;
        double doubleSalary;
        doubleSalary = 4900.10;

        System.out.println(varSalary);
        System.out.println(doubleSalary);

        // casting de double para int
        int castDoubleToInt = (int) varSalary;

        System.out.println(castDoubleToInt);
    }
}
