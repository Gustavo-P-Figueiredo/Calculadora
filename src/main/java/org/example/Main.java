package org.example;
import java.util.Scanner;

import org.example.Historico.Historico;
import org.example.Operacoes.CalcularExpressao;
import org.example.Operacoes.CalcularOperacoes;

import org.example.Operacoes.Conversor;
import org.example.PegarValores.PegarExpressao;
import org.example.PegarValores.PegarValorConversor;
import org.example.PegarValores.PegarValores;

import java.util.*;

public class Main {
    public int resultado;
    Scanner teclado = new Scanner(System.in);
    Historico historico = new Historico();
    PegarValores pegarValores = new PegarValores();
    CalcularOperacoes operacoes = new CalcularOperacoes();


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
                expressoes();
                break;

            case 5:
                conversor();

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
        String operacao;

        {
            System.out.println("""
        ===Calculadora===
        Digite a operação desejada ou 0 para voltar ao menu: 
        1 - Soma
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        0 - Voltar ao menu
        """);
            operacao = teclado.nextLine();

            switch (operacao) {

                case "1":
                    PegarValores soma = new PegarValores();
                    List<Integer> valoresSoma = soma.pegarValores();

                    CalcularOperacoes operacaoSoma = new CalcularOperacoes();
                    resultado = operacaoSoma.soma(valoresSoma);

                    System.out.println("Resultado da soma: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "2":
                    PegarValores subtracao = new PegarValores();
                    List<Integer> valoresSubtracao = subtracao.pegarValores();

                    CalcularOperacoes operacaoSubtracao = new CalcularOperacoes();
                    resultado = operacaoSubtracao.subtracao(valoresSubtracao);

                    System.out.println("Resultado da subtração: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "3":
                    PegarValores multiplicacao = new PegarValores();
                    List<Integer> valoresMultiplicacao = multiplicacao.pegarValores();

                    CalcularOperacoes operacaoMultiplicacao = new CalcularOperacoes();
                    resultado = operacaoMultiplicacao.multiplicacao(valoresMultiplicacao);

                    System.out.println("Resultado da multiplicacao: " + resultado);
                    historico.salvarResultado(resultado);
                    calculadora();
                    break;

                case "4":
                    PegarValores divisao = new PegarValores();
                    List<Integer> valoresDivisao = divisao.pegarValores();

                    CalcularOperacoes operacaoDivisao = new CalcularOperacoes();
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
            while (operacao != "0") ;
        }
    }

    private void historico() {

        historico.mostrarHistorico(resultado);
        main();
    }

    private void calculadoraAvancada() {
        String operacao;
        int resultado;

        System.out.println("""
        ===Calculadora avançada===
        Digite a operação desejada ou 0 para voltar ao menu: 
        1 - Potencia
        2 - Porcentagem
        3 - Raiz
        0 - Voltar ao menu
        """);
        operacao = teclado.nextLine();

        switch (operacao) {

            case "1":
                PegarValores potencia = new PegarValores();
                List<Integer> valoresPotencia = potencia.pegarValoresPotencia();

                CalcularOperacoes operacaoPotencia = new CalcularOperacoes();
                resultado = operacaoPotencia.potencia(valoresPotencia);

                System.out.println("Resutado da potencia: " + resultado);
                historico.salvarResultado(resultado);
                calculadoraAvancada();
                break;

            case "2":
                PegarValores porcentagem = new PegarValores();
                List<Integer> valoresPorcentagem = porcentagem.pegarValoresPorcentagem();

                CalcularOperacoes operacaoPorcentagem = new CalcularOperacoes();
                resultado = operacaoPorcentagem.porcentagem(valoresPorcentagem);

                System.out.println("Resultado da porcentagem : " + resultado);
                historico.salvarResultado(resultado);
                calculadoraAvancada();
                break;

            case "3":
                PegarValores raiz = new PegarValores();
                int valorRaiz = raiz.pegarValorRaiz();

                CalcularOperacoes operacaoRaiz = new CalcularOperacoes();
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

    private void expressoes() {

        PegarExpressao pegarExpressao = new PegarExpressao();
        CalcularExpressao calcular = new CalcularExpressao();

        String expressao = pegarExpressao.expressao();

        int resultado = calcular.calcular(expressao);

        System.out.println("Resultado: " + resultado);
        historico.salvarResultado(resultado);
        expressoes();
    }


    private void conversor() {
        String operacao;

        System.out.println("""
        ===CONVERSOR===
        Digite a operação desejada ou 0 para voltar ao menu: 
        1 - Decimal para binario
        2 - Binario para decimal
        3 - Decimal para hexadecimal
        4 - Hexadecimal para binario
        0 - Voltar ao menu
        """);
        operacao = teclado.nextLine();

        switch (operacao) {

            case "1":
                PegarValorConversor pegarDecimal = new PegarValorConversor();
                Conversor conversorParaBinario = new Conversor();

                String resultadoBinario = conversorParaBinario.converterParaBinario();
                historico.salvarResultado(resultado);
                conversor();
                break;

            case "2":
                PegarValorConversor pegarBinario = new PegarValorConversor();
                Conversor conversorParaDecimal = new Conversor();

                int resultadoDecimal = conversorParaDecimal.converterParaDecimal();
                historico.salvarResultado(resultado);
                conversor();
                break;

            case "3":


            case "4":

        }
    }
}
