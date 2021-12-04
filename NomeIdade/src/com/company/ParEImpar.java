package com.company;

import java.util.Scanner;

/*
    Faça um programa que peça N numeros inteiros
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares
 */
public class ParEImpar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int N; // define quantos números inteiros de entrada
        int num; // variável de conteúdo para os números de entrada
        int count = 0; // contador
        int impar=0 , par=0;

        System.out.println("Número de Inteiros que serão inseridos: ");
        N = scan.nextInt();

        do {
            System.out.println("Número: ");
            num = scan.nextInt();
            if (num % 2 != 0){
                impar++;
            } else {
                par++;
            }
            count++;
        } while (count < N);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }

}
