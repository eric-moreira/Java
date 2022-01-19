package lista.duplamente.encadeadas;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");

        System.out.println(minhaLista);
        minhaLista.remove(3);
        System.out.println(minhaLista);
        minhaLista.add(1, "c99");
        System.out.println(minhaLista);
    }
}
