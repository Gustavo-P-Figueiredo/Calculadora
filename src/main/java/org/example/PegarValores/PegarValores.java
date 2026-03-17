package org.example.PegarValores;

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

    public List<Integer> pegarValoresPotencia() {
        List<Integer> valoresPotencia = new ArrayList<>();

        System.out.println("Digite o numero base: ");
        int numero = teclado.nextInt();
        valoresPotencia.add(numero);
        System.out.println("Digite o numero exponente: ");
        numero = teclado.nextInt();
        valoresPotencia.add(numero);

        return valoresPotencia;
    }

    public List<Integer> pegarValoresPorcentagem() {
        List<Integer> valoresPorcentagem = new ArrayList<>();

        System.out.println("Insira a porcentagem desejada: ");
        int numero = teclado.nextInt();
        valoresPorcentagem.add(numero);
        System.out.println("Insira o valor total: ");
        numero = teclado.nextInt();
        valoresPorcentagem.add(numero);

    return valoresPorcentagem;
    }

    public int pegarValorRaiz() {

        System.out.println("Insira o valor raiz: ");
        int valorRaiz = teclado.nextInt();

        return valorRaiz;
    }

}
