package com.company;
import java.math.BigInteger;
import java.util.Scanner;

/*
A queen requested the services of a monk and told him she would pay any price.
The monk, in need of food, asked the queen if payment could be made in grains
of wheat arranged on a checkerboard, so that the first square had only one grain,
and subsequent squares twice the previous square. The queen considered the payment
cheap and asked that the service be performed, however, one of the knights who was
present and understood a little math warned her that it would be impossible to perform the payment,
as the amount of grain would be too high. Curious, the queen then asked this knight,
who was good at calculus, to make a program that received as input the number of squares
to be used in a checkerboard and presented the corresponding amount of kg of wheat,
knowing that each 12 grains of cereal correspond to one gram. Finally, the quantity calculation
must fit into an unsigned 64-bit integer value.
 */

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
