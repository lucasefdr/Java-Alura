package com.github.lucasefdr.B07JavaIO.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);

            Scanner lineScanner = new Scanner(line);

            lineScanner.useDelimiter(",");
            lineScanner.useLocale(Locale.US);

            String value1 = lineScanner.next();
            int value2 = lineScanner.nextInt();
            int value3 = lineScanner.nextInt();
            String value4 = lineScanner.next();
            double value5 = lineScanner.nextDouble();

            // formatador de Strings
            String valueFormat = String.format(new Locale("pt", "BR"),
                    "%s - %04d-%d, %s: R$ %.2f%n", value1, value2, value3, value4, value5);
            System.out.println(valueFormat);

            lineScanner.close();
            // String[] values = line.split(",");
            // System.out.println(Arrays.toString(values));
            // System.out.println(values[3]);
        }

        scanner.close();
    }
}
