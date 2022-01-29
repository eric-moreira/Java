package dio.collections.exercicios;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>((Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6)));
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7: ");
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        //notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        notas.clear();
        System.out.println(notas);
        System.out.println("Apague todo o conjunto e verifique se está vazio: " + notas.isEmpty());

    }
}
