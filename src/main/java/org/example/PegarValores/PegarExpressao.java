package org.example.PegarValores;


import java.util.Scanner;

public class PegarExpressao {
    Scanner teclado = new Scanner(System.in);

    public String expressao() {

        System.out.println("Insira a expressao: ");
        String expressao = teclado.nextLine();

        return expressao;
    }
}
