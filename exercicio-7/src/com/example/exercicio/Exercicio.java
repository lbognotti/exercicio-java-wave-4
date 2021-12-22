package com.example.exercicio;

import java.text.NumberFormat;
import java.time.LocalDate;

public class Exercicio {
    public static void main(String[] args) {
        Double empresaX = 1130000.0;
        Double empresaY = 18400000.0;
        Integer count = 0;
        while (empresaX < empresaY) {
            empresaX = empresaX + (empresaX * 1.48);
            empresaY = empresaY + (empresaY * 0.32);
            System.out.println("EMPRESA: X - " + "ANO: " +(LocalDate.now().getYear() + count + " - Valor da empresa: " + NumberFormat.getCurrencyInstance().format(empresaX)));
            count++;
        }
    }
}
