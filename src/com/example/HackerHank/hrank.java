package com.example.HackerHank;

import java.util.Scanner;


public class hrank {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            int resultado;
            resultado = i * N;

            System.out.println(N +  " x " + i + " = " + resultado);
        }
    }
}
