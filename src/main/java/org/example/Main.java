package org.example;

//Objetivos
 //Permitir as quatro operações basicas CHECK
 //Armazenar em um vetor os ultimos cinco resultados
 //Exibir o maior e o menor numero entre os ultimos cinco resultados
 //Exibir a média entre os resultados
//Fazer front

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int resultado = 0;
        String operacao = "";

        do {
            System.out.println("Digite a operação desejada (+, -, *, /) ou '0' para encerrar: ");
            operacao = teclado.nextLine();

            if (operacao.equals("+")) {
                System.out.println("Digite o primeiro numero: ");
                primeiroNumero = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Digite o segundo numero: ");
                segundoNumero = teclado.nextInt();
                teclado.nextLine();

                resultado = primeiroNumero + segundoNumero;

                System.out.println("Resultado: " + resultado);

            }

            if (operacao.equals("-")) {
                System.out.println("Digite o primeiro numero: ");
                primeiroNumero = teclado.nextInt();

                System.out.println("Digite o segundo numero: ");
                segundoNumero = teclado.nextInt();

                resultado = primeiroNumero - segundoNumero;

                System.out.println("Resultado: " + resultado);
            }

            if (operacao.equals("*")) {
                System.out.println("Digite o primeiro numero: ");
                primeiroNumero = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Digite o segundo numero: ");
                segundoNumero = teclado.nextInt();
                teclado.nextLine();

                resultado = primeiroNumero * segundoNumero;

                System.out.println("Resultado: " + resultado);
            }

            if (operacao.equals("/")) {
                System.out.println("Digite o primeiro numero: ");
                primeiroNumero = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Digite o segundo numero: ");
                segundoNumero = teclado.nextInt();
                teclado.nextLine();

                resultado = primeiroNumero / segundoNumero;

                System.out.println("Resultado: " + resultado);
            }

        }

        while (!operacao.equals("0"));
    }

}

