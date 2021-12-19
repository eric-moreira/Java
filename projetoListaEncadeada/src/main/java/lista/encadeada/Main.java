package lista.encadeada;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> testeListaEncadeada = new ListaEncadeada<>();

        testeListaEncadeada.add("Teste #1");
        testeListaEncadeada.add("Teste #2");
        testeListaEncadeada.add("Teste #3");
        testeListaEncadeada.add("Teste #4");

        System.out.println(testeListaEncadeada.get(0));
        System.out.println(testeListaEncadeada.get(1));
        System.out.println(testeListaEncadeada.get(2));
        System.out.println(testeListaEncadeada.get(3));

        System.out.println(testeListaEncadeada);

        System.out.println(testeListaEncadeada.remove(3));

        System.out.println(testeListaEncadeada);


    }
}
