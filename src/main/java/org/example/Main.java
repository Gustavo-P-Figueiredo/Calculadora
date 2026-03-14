package org.example;
import java.util.Scanner;

import org.example.Historico.Historico;
import org.example.Operações.Operacoes;

//Objetivos
 //Permitir as quatro operações basicas *CHECK*
 //Armazenar em um vetor os ultimos cinco resultados *CHECK*
 //Permitir operações avançadas *CHECK*
 //Permitir expressões matematicas
 //Permitir conversão de valores
//Fazer front

import org.example.Operações.PegarValores;

import java.util.*;

public class Main {
    public int resultado;
    Scanner teclado = new Scanner(System.in);
    Historico historico = new Historico();
    PegarValores pegarValores = new PegarValores();
    Operacoes operacoes = new Operacoes();


    public void main() {
        int opcao;

        System.out.println("Escolha uma das opções");
        System.out.println("Calculadora: 1");
        System.out.println("Ultimos cinco resultados: 2");
        System.out.println("Calculadora avançada: 3");
        System.out.println("Expreções matematicas: 4");
        System.out.println("Conversor de valores: 5");
        System.out.println("Sair: 6");
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
                exprecoes();
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
                    PegarValores soma = new PegarValores();
                    List<Integer> valoresSoma = soma.pegarValores();

                    Operacoes operacaoSoma = new Operacoes();
                    resultado = operacaoSoma.soma(valoresSoma);

                    System.out.println("Resultado da soma: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "-":
                    PegarValores subtracao = new PegarValores();
                    List<Integer> valoresSubtracao = subtracao.pegarValores();

                    Operacoes operacaoSubtracao = new Operacoes();
                    resultado = operacaoSubtracao.subtracao(valoresSubtracao);

                    System.out.println("Resultado da subtração: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "*":
                    PegarValores multiplicacao = new PegarValores();
                    List<Integer> valoresMultiplicacao = multiplicacao.pegarValores();

                    Operacoes operacaoMultiplicacao = new Operacoes();
                    resultado = operacaoMultiplicacao.multiplicacao(valoresMultiplicacao);

                    System.out.println("Resultado da multiplicacao: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "/":
                    PegarValores divisao = new PegarValores();
                    List<Integer> valoresDivisao = divisao.pegarValores();

                    Operacoes operacaoDivisao = new Operacoes();
                    resultado = operacaoDivisao.divisao(valoresDivisao);

                    System.out.println("Resultado da divisao: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

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

    private void historico() {

        historico.mostrarHistorico(resultado);
        main();
    }

    private void calculadoraAvancada() {
        String operacao;
        int primeiroNumero;
        int segundoNumero;
        int resultado;

        System.out.println("Digite a operação desejada (potencia, porcentagem, raiz) ou 0 para voltar ao menu: ");
        operacao = teclado.nextLine();

        switch (operacao) {

            case "potencia":
                PegarValores potencia = new PegarValores();
                List<Integer> valoresPotencia = potencia.pegarValoresPotencia();

                Operacoes operacaoPotencia = new Operacoes();
                resultado = operacaoPotencia.potencia(valoresPotencia);

                System.out.println("Resutado da potencia: " + resultado);
                historico.salvarResultado(resultado);
                    calculadoraAvancada();
                    break;

            case "porcentagem":
                PegarValores porcentagem = new PegarValores();
                List<Integer> valoresPorcentagem = porcentagem.pegarValoresPorcentagem();

                Operacoes operacaoPorcentagem = new Operacoes();
                resultado = operacaoPorcentagem.porcentagem(valoresPorcentagem);

                System.out.println("Resultado da porcentagem : " + resultado);
                historico.salvarResultado(resultado);
                calculadoraAvancada();
                break;

            case "raiz":
                PegarValores raiz = new PegarValores();
                int valorRaiz = raiz.pegarValorRaiz();

                Operacoes operacaoRaiz = new Operacoes();
                resultado = operacaoRaiz.raiz(valorRaiz);

                System.out.println("Resultado da raiz: " + resultado);
                historico.salvarResultado(resultado);
                calculadora();
                break;

            case "0":
                main();
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                calculadoraAvancada();
        }
    }

    private void exprecoes() {
    String exprecao;

        System.out.println("Digite a expressão matematica: ");
        exprecao = teclado.nextLine();

    }

}
