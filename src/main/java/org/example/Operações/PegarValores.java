package org.example.Operações;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PegarValores {
    Scanner teclado = new Scanner(System.in);

    public List<Integer> pegarValores() {
        List<Integer> valores = new ArrayList<>();

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        valores.add(numero);
        System.out.println("Digite outro numero: ");
        numero = teclado.nextInt();
        valores.add(numero);

    return valores;
    }
}
