package com.Fila;

public class Main {
    public static void main(String[] args) {
        Fila testeFila = new Fila();
        int contador = 0;
        NoFila i;
        while (true){
            i = new NoFila(contador);
            testeFila.enqueue(i);
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

        testeFila.enqueue(new NoFila(99));

        System.out.println(testeFila + "\n");

    }
}
