package com.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha testePilha = new Pilha();

        testePilha.push(new NoPilha(1));
        testePilha.push(new NoPilha(2));
        testePilha.push(new NoPilha(3));
        testePilha.push(new NoPilha(4));
        testePilha.push(new NoPilha(5));
        testePilha.push(new NoPilha(6));

        System.out.println(testePilha);
    }
}
