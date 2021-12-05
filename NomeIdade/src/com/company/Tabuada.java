package com.company;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de: ");
        int tabuada = scan.nextInt();
        int res;

        if(tabuada < 0 | tabuada > 10) {
            throw new ArithmeticException("Select a number between 0 and 10");
        }
        else {
            System.out.println("Tabuada de " + tabuada);
            for(int i=1;i<11;i++){
                res = tabuada * i;
                System.out.println(tabuada + " x " + i + " = " + res);
            }
        }

    }

}
