package com.company;

import java.util.Scanner;

public class DesafioFusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaSaida = sc.nextInt();
        int tempoViagem = sc.nextInt();
        int fuso = sc.nextInt();

        int horaChegada = horaSaida + tempoViagem + fuso;
        if (horaChegada > 24){
            horaChegada -=24;
        } else if (horaChegada == 24){
            horaChegada = 0;
        } else if (horaChegada < 0){
            horaChegada = 24 + horaChegada;
        }


        System.out.println(horaChegada);

        sc.close();
    }
}
