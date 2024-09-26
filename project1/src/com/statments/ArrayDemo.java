package com.statments;

public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];


        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

        for (int i = (anArray.length - 1); i >= 0; i--) {
            System.out.println(anArray[i]);
        }


    }
}
