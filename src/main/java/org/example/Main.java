package org.example;

//Objetivos
 //Permitir as quatro operações basicas *CHECK*
 //Armazenar em um vetor os ultimos cinco resultados
 //Exibir o maior e o menor numero entre os ultimos cinco resultados
 //Exibir a média entre os resultados
//Fazer front

import java.util.*;

public class Main {
    int resultado;
    Scanner teclado = new Scanner(System.in);
    Queue<Integer> ultimosResultado = new LinkedList<>();


    public void main() {
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
                historico();
                break;

            case 3:
                //maiorEMenorResultado();
                break;

            case 4:
                //media();
                break;

            case 5:
                System.out.println("Encerrando...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                main();
                break;
        }
    }


    //Adicionar opção caso selecione opção diferente das disponiveis *CHECK*
    private void calculadora() {
        Scanner teclado = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        String operacao;

        {
            System.out.println("Digite a operação desejada (+, -, *, /) ou '0' para voltar ao menu: ");
            operacao = teclado.nextLine();

            switch (operacao) {

                case "+":
                    System.out.println("Digite o primeiro numero: ");
                    primeiroNumero = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Digite o segundo numero: ");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();

                    resultado = primeiroNumero + segundoNumero;

                    System.out.println("Resultado: " + resultado);
                    ultimosResultado.add(resultado);
                    calculadora();

                case "-":
                    System.out.println("Digite o primeiro numero: ");
                    primeiroNumero = teclado.nextInt();

                    System.out.println("Digite o segundo numero: ");
                    segundoNumero = teclado.nextInt();

                    resultado = primeiroNumero - segundoNumero;

                    System.out.println("Resultado: " + resultado);
                    ultimosResultado.add(resultado);
                    calculadora();

                case "*":
                    System.out.println("Digite o primeiro numero: ");
                    primeiroNumero = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Digite o segundo numero: ");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();

                    resultado = primeiroNumero * segundoNumero;

                    System.out.println("Resultado: " + resultado);
                    ultimosResultado.add(resultado);
                    calculadora();

                case "/":
                    System.out.println("Digite o primeiro numero: ");
                    primeiroNumero = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Digite o segundo numero: ");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();

                    resultado = primeiroNumero / segundoNumero;

                    System.out.println("Resultado: " + resultado);
                    ultimosResultado.add(resultado);
                    calculadora();

                case "0":
                    main();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    calculadora();
            }
            while (operacao != "0");
            }
        }


    //Bug ao ter somente um resultado no historico
    //Analisar validador do limite
    private void historico() {
        int limite = 5;

        if (ultimosResultado.isEmpty()) {
            System.out.println("Não há resultados anteriores");
             main();
        }

        if (ultimosResultado.size() < limite) {
            ultimosResultado.add(resultado);
        }
            else {
                ultimosResultado.poll();
        }
                System.out.println("Ultimos resultados: " + ultimosResultado);
                main();
    }

}
