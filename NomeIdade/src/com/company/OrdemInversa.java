package com.company;

public class OrdemInversa {
    public static void main (String[] args){
        int[] vetor = {0,-5,15,50,8,90};
        int[] vetorInverso = {};
        int tamanho = vetor.length;
        int index=0;

        System.out.println("Vetor na ordem correta: ");
        while (index <= (vetor.length-1)){
            System.out.print(vetor[index]+" ");
            index++;
        }

        System.out.println("\nVetor na ordem inversa: ");

        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i]+" ");
        }

    }
}
