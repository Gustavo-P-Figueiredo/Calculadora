package org.example;

//Objetivos
 //Permitir as quatro operações basicas CHECK
 //Armazenar em um vetor os ultimos cinco resultados
 //Exibir o maior e o menor numero entre os ultimos cinco resultados
 //Exibir a média entre os resultados
//Fazer front

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma das opções");
        System.out.println("Calculadora: 1");
        System.out.println("Ultimos cinco resultados: 2");
        System.out.println("Maior e menor resultados: 3");
        System.out.println("Media de resultados: 4");
        System.out.println("Sair: 5");
        opcao = teclado.nextInt();
        teclado.nextLine();

        switch (opcao) {
            case 1:
                calculadora();
                break;

            case 2:
                resultado();
                break;

            case 3:
                maiorEMenorResultado();
                break;

            case 4:
                media();
                break;

            case 5:
                System.out.println("Encerrando...");
                break;
        }

    }
            private static void calculadora() {
                Scanner teclado = new Scanner(System.in);

                int primeiroNumero;
                int segundoNumero;
                int resultado;
                String operacao;

                {
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


                    while (!operacao.equals("0")) ;
                }
            }
        }
