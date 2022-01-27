package dio.collections.exercicios;

import java.util.*;

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

        /*System.out.println("Exiba todas as notas na ordem que foram inseridas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }*/

        // Exiba a terceira nota adicionada
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        // Exiba a menor nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Exiba a maior nota
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Exiba a media das notas
        System.out.println("Exiba a media das notas: " + soma/notas.size());

        // Remova a nota zero
        notas.remove(0d);
        System.out.println("Remova a nota zero: " + notas);

        // Remova a nota na posição zero
        notas.remove(0);
        System.out.println("Remova a nota na posição zero: " + notas);

        // Remova as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7" + notas);

        // Apague toda a lista
        notas.clear();
        System.out.println("Apague toda a lista: " + notas);
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }

}
