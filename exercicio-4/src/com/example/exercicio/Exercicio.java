package com.example.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args) {
        System.out.println("Insira um valor");
        Scanner sc = new Scanner(System.in);
        Integer value = Integer.parseInt(sc.next());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < value; i++) {
            if (isPrimo(i)) {
                arr.add(i);
            }
        }

        System.out.println("A quantidade de numeros primos entre 1 e " + value + ": " + arr.size());
        System.out.println("Os numeros primos entre 1 e " + value + " "+ arr);
    }

    public static boolean isPrimo(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

}
