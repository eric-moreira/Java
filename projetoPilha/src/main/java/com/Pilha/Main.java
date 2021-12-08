package com.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha testePilha = new Pilha();
        NoPilha i;
        int contador = 0;
        while (true) {
            i = new NoPilha(contador);
            contador++;
            testePilha.push(i);
            if(contador == 10){
                break;
            }
        }
        System.out.println(testePilha);
        System.out.println(testePilha.pop());
        System.out.println(testePilha);

    }
}
