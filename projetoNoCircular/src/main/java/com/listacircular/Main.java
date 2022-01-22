package com.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        System.out.println(minhaLista);
        minhaLista.add("c0");
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);
    }
}
