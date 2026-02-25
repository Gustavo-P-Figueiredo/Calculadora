package org.example;

//Objetivos
 //Permitir as quatro operações basicas *CHECK*
 //Armazenar em um vetor os ultimos cinco resultados *CHECK*
 //Permitir operações avançadas
 //Permitir expressões matematicas
 //Permitir conversão de valores
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
                calculadoraAvancada();
                break;

            case 4:
                //exprecoes();
                break;

            case 5:
                //conversor();

            case 6:
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
                    break;

                case "-":
                    System.out.println("Digite o primeiro numero: ");
                    primeiroNumero = teclado.nextInt();

                    System.out.println("Digite o segundo numero: ");
                    segundoNumero = teclado.nextInt();

                    resultado = primeiroNumero - segundoNumero;

                    System.out.println("Resultado: " + resultado);
                    ultimosResultado.add(resultado);
                    calculadora();
                    break;

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
                    break;

                case "/":
                    System.out.println("Digite o dividendo: ");
                    primeiroNumero = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Digite o divisor: ");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();

                    try {
                        resultado = primeiroNumero / segundoNumero;

                        System.out.println("Resultado: " + resultado);
                        ultimosResultado.add(resultado);
                        calculadora();
                        break;

                    } catch (ArithmeticException e) {
                        System.out.println("Divisão por 0 não é permitido");
                    }

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


    //Bug ao ter somente um resultado no historico *CHECK*
    //Analisar validador do limite *CHECK*
    private void historico() {
        int limite = 5;

        if (ultimosResultado.isEmpty()) {
            System.out.println("Não há resultados anteriores");
             main();
        }

        if (ultimosResultado.size() <= limite) {
        }
            else {
                ultimosResultado.poll();
        }
                System.out.println("Ultimos resultados: " + ultimosResultado);
                main();
    }

    private void calculadoraAvancada() {
        String operacao;
        int primeiroNumero;
        int segundoNumero;
        int resultado;

        System.out.println("igite a operação desejada (potencia, porcentagem, raiz) ou 0 para voltar ao menu: ");
        operacao = teclado.nextLine();

        switch (operacao) {

            case "potencia":


            case "porcentagem":


            case "raiz":

            case "0":
                main();
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                calculadora();
        }

    }

}
