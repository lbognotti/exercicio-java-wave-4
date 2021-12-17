package com.example.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Digita um valor");
        Scanner sc1 = new Scanner(System.in);
        Integer value1 = Integer.parseInt(sc1.next());

        System.out.println("Digita outro valor");
        Scanner sc2 = new Scanner(System.in);
        Integer value2 = Integer.parseInt(sc2.next());

        ArrayList<Integer> arr = new ArrayList<>();

      if (value1 > value2) {
          for (int i = value1; i >= value2; i--) {
              if (i % value2 == 0) {
                  arr.add(i);
              }
          }
          System.out.println("0s multiplos de " + value1 + " ate o numero " + value2 + " sao: VETOR" + arr);
      } else {
          for (int i = value2; i >= value1; i--) {
              if (i % value1 == 0) {
                  arr.add(i);
              }
          }
          System.out.println("0s multiplos de " + value2 + " ate o numero " + value1 + " sao: VETOR" + arr);
      }

    }
}
