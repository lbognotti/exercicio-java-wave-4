package com.example.exercicio;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Insira um valor");
        Scanner sc = new Scanner(System.in);
        Integer value = Integer.parseInt(sc.next());

        int cont = 0;
        for (int i = 1; i <= value; i++) {
           if (value % i == 0) {
               cont++;
           }
        }
        if (cont == 2) {
            System.out.println("primo");
        }
    }
}
