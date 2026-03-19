package org.example.PegarValores;

import java.util.Scanner;

public class PegarValorConversor {
    Scanner teclado = new Scanner(System.in);

    public int valorDecimal() {

        System.out.println("Insira o valor decimal que deseja converter");
        int decimal = teclado.nextInt();

        return decimal;
    }

    public String valorBinario() {

        System.out.println("Insira o valor binario que deseja converter");
        String binario = teclado.nextLine();

        return binario;
    }
}
