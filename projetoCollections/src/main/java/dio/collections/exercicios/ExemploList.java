package dio.collections.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        /* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
    [7, 8.5, 9.3, 5, 7, 0, 3.6]
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc). */

        // List notas = new ArrayList();
        List<Double> notas = new ArrayList<>();
        // notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);
        // notas.add(10d);
        // Dessa forma gera AbstractList error

        System.out.println("Crie uma Lista e adicione as sete notas: ");
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        // Exiba a posição da nota 5.0
        System.out.println("Exiba a posição da nota 5.0" + notas.indexOf(5d));
        System.out.println("Adiciona na Lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        // Substitua a nota 5.0 pela nota 6.0
        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Confira se a nota 5.0 está na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) );

        System.out.println("Exiba todas as notas na ordem que foram inseridas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

    }
}
