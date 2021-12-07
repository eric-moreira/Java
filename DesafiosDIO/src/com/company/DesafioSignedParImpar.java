package com.company;

import java.util.Scanner;

public class DesafioSignedParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int numero = leitor.nextInt();
            if (numero < 0){
                if (numero % 2 == 0){
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            } else if (numero == 0) {
                System.out.println("NULL");
            } else {
                if (numero % 2 == 0){
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }

            }

        }
        leitor.close();
    }
}
