package dio.collections.exercicios;
import java.util.*;

public class ExemploLinkedList {
    public static void main(String[] args) {
        /* Resolva com LinkedList
        Crie uma lista chamada notas2 e coloque os mesmos elementos da ArrayList anterior
        [7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6]

        Mostre a primeira nota da lista sem removê-la:

        Mostre a primeira nota da lista removendo-a:
         */

        List<Double> notas = new LinkedList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println("Mostre a primeira nota da lista sem removê-la: " + notas.get(0));
        System.out.println(notas);
        // Double remove = notas.remove(0);
        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas.remove(0));
        System.out.println(notas);

    }
}
