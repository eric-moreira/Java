package com.company;

import java.util.Scanner;

public class Fatorial {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int fatorial;

        System.out.println("Este programa gera o fatorial de um número.");
        System.out.println("Selecione o número: ");
        num = scan.nextInt();
        fatorial = num;
        for (int i=num-1; i>=1; i--){
             fatorial *= i;
        }
        System.out.println("Fatorial de " + num + ":" + fatorial);
    }
}
