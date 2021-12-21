package com.example.exercicio;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio {
    public static void main(String[] args) {
        Integer[] numbers = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(numbers);
        System.out.println("Ordem crescente: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + Arrays.toString(numbers));

    }
}
