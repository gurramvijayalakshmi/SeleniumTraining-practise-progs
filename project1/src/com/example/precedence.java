package com.example;

public class precedence {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 5;

        // Relational operators (<, >) have higher precedence than logical (&&)
        boolean result = x < y && y > z;  // (x < y) && (y > z)

        System.out.println("x < y && y > z: " + result);  // true
    }
}
