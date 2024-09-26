package com.example;

public class logicaloper {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Logical Operators Demo:");

        // Logical AND
        System.out.println("a && b: " + (a && b));  // false
        // Logical OR
        System.out.println("a || b: " + (a || b));  // true
        // Logical NOT
        System.out.println("!a: " + (!a));  // false
        System.out.println("!b: " + (!b));  // true

        // Logical AND with both true
        boolean c = true;
        System.out.println("a && c: " + (a && c));  // true
    }
}
