package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicador = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicador = multiplicador * i;
        }

        System.out.println("resultado: " + multiplicador);

    }}
