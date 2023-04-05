package com.github.lucasefdr.X01Review;

import java.util.Arrays;
import java.util.List;

public class X06ArraysClass {
    public static void main(String[] args) {
        Integer[] numbers1 = {32, 16, 4, 8, 1, 2};
        Integer[] numbers2 = {1, 2, 4, 8, 16, 32};

        // Sorting the array
        Arrays.sort(numbers1);
        for (Integer number : numbers1) System.out.println(number);

        // Returns if the array is equal
        boolean arraysIsEquals = Arrays.equals(numbers1, numbers2);
        System.out.println("Are the arrays equals? " + arraysIsEquals);

        List<Integer> arraysAsList = Arrays.asList(numbers1);
        System.out.println("Array as List: " + arraysAsList);
    }
}
