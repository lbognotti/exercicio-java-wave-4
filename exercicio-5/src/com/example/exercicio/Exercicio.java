package com.example.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Insira um valor para o tamanho do array");
        Scanner sc1 = new Scanner(System.in);
        Integer value1 = Integer.parseInt(sc1.next());

        System.out.println("Insira um valor para quantidade de casa decimais");
        Scanner sc2 = new Scanner(System.in);
        Integer value2 = Integer.parseInt(sc2.next());

        System.out.println("Insira um valor que deseja buscar");
        Scanner sc3 = new Scanner(System.in);
        Integer value3 = Integer.parseInt(sc3.next());

        ArrayList<Integer> arr = new ArrayList<>();

        int count = (int)Math.pow(10, value2 -1);

        System.out.println(count);

        while (arr.size() != value1) {
            String[] aux = Integer.toString(count).split("");
            Integer arr1 = Integer.parseInt(aux[aux.length-1]);
            Integer arr2 = Integer.parseInt(aux[aux.length-2]);
            Integer arr3 = Integer.parseInt(aux[aux.length-3]);
            System.out.println(aux[0]);
            // System.out.println(arr1);
            if (arr1 == value3) {
                arr.add(count);
            }
            count++;
        }

        System.out.println(arr);
    }
}
