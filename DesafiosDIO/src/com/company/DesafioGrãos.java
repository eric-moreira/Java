package com.company;


import jdk.jfr.Unsigned;

import java.math.BigInteger;
import java.util.Scanner;

public class DesafioGrãos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger peso;
        BigInteger casa = BigInteger.valueOf(1);
        BigInteger graos = BigInteger.valueOf(0);
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            for(int j=0; j<x; j++){
                graos = graos.add(casa);
                casa= casa.multiply(BigInteger.valueOf(2));
            }
            peso = graos.divide(BigInteger.valueOf(12));
            peso = peso.divide(BigInteger.valueOf(1000));
            System.out.printf( peso + " kg\n");   //Complete o código aqui.
            peso = BigInteger.valueOf(0);
            graos = BigInteger.valueOf(0);
            casa = BigInteger.valueOf(1);
        }
        sc.close();
    }
}
