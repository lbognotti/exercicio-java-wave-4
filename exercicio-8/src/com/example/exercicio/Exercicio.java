package com.example.exercicio;

import java.math.BigDecimal;
import java.util.ArrayList;


/*
    Para um protótipo de supermercado, crie um programa que leia 3 produtos e
    imprima no console: nome, preço, quantidade e o valor total da compra.
    Utilize um array como estrutura de dados para armazenamento dos produtos informados.
*/

public class Exercicio {
    public static void main(String[] args) {
        Product product1 = new Product("Soja", new BigDecimal(23), 2);
        Product product2 = new Product("Grao-de-bico", new BigDecimal(2), 24);
        Product product3 = new Product("Feijao", new BigDecimal(5), 2);

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
