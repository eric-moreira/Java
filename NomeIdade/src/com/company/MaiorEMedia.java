package com.company;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        /*
        for (int i=0; i<5; i++) {
            System.out.println("Numero: ");
            numero = scan.nextInt();
        }
        */
        int count = 0;
        float media;
        int maior = 0;

        media=0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            media += numero;
            count++;
            if(numero > maior){
                maior = numero;
            }
        } while (count < 5);

        media /= 5;
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
    }
}
