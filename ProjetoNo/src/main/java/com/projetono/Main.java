package com.projetono;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");

        no1.setProximoNo(no2);
        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        // Conceito de encadeamento de nós
        System.out.println("Encadeamento de Nós simples, sem Lista Genérica: ");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


        NoRefatorado<String> noRefat1 = new NoRefatorado<>("Conteúdo 1");
        NoRefatorado<String> noRefat2 = new NoRefatorado<>("Conteúdo 2");
        NoRefatorado<String> noRefat3 = new NoRefatorado<>("Conteúdo 3");
        NoRefatorado<String> noRefat4 = new NoRefatorado<>("Conteúdo 4");
        noRefat1.setProximoNo(noRefat2);
        noRefat1.getProximoNo().setProximoNo(noRefat3);
        noRefat1.getProximoNo().getProximoNo().setProximoNo(noRefat4);

        System.out.println("Encadeamento de Nós com Listas Genéricas (NoRefatorado <T>)");
        System.out.println(noRefat1);
        System.out.println(noRefat1.getProximoNo());
        System.out.println(noRefat1.getProximoNo().getProximoNo());
        System.out.println(noRefat1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(noRefat1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
