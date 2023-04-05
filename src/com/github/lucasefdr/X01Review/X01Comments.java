package com.github.lucasefdr.X01Review;

public class X01Comments {

    public static void main(String[] args) {
        // Inline comment

        /*
        Multiline comment
         */

        System.out.println(sayMyName("Lucas"));
    }

    /**
     * JavaDoc comment
     */
    public static String sayMyName(String name) {
        return "My name is " + name;
    }
}
