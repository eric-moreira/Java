package com.Fila;

public class Main {
    public static void main(String[] args) {
        Fila testeFila = new Fila();
        int contador = 0;
        while (true){
            testeFila.enqueue(contador);
            contador++;
            if (contador == 10){
                break;
            }
        }

        System.out.println(testeFila + "\n");

        System.out.println(testeFila.first() + "\n");

        System.out.println(testeFila + "\n");

        System.out.println(testeFila.dequeue() + "\n");

        System.out.println(testeFila + "\n");

        testeFila.enqueue(99);

        System.out.println(testeFila + "\n");

    }
}
