package com.example.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita um valor");
        Integer value = Integer.parseInt(sc.next());
        ArrayList<Integer> arr = new ArrayList<>(value);

         for (int i = 0; i < value; i++ ) {
             if (i % 2 == 0 ) {
                arr.add(i);
             }
         }
         System.out.println("A quantidade de numeros pares entre 0 e " + value + " é " + arr.size());
         System.out.println("VETOR " + arr);
    }
}