package org.example.Operações;

import java.util.List;

public class CalcularOperacoes {

    public int soma(List<Integer> valores) {
        int resultado = valores.stream()
                .mapToInt(valor -> valor)
                .sum();
        return resultado;
    }

    public int subtracao(List<Integer> valores) {
        int resultado = valores.stream()
                .mapToInt(valor -> valor)
                .reduce((a, b) -> a - b)
                .orElse((int) 0.0);
        return resultado;
    }

    public int multiplicacao(List<Integer> valores) {
        int resultado = valores.stream()
                .mapToInt(valor -> valor)
                .reduce(1, (a, b) -> a * b);
        return resultado;
    }

    public int divisao(List<Integer> valores) {
        int resultado = 0;

        try {
            resultado = valores.stream()
                    .mapToInt(valor -> valor)
                    .reduce((a, b) -> a / b)
                    .orElse(0);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por 0 não é permitido");
        }

        return resultado;
    }

    public int potencia(List<Integer> valoresPotencia) {
        int resultado = (int) Math.pow(valoresPotencia.get(0), valoresPotencia.get(1));
        return resultado;
    }

    public int porcentagem(List<Integer> valoresPorcentagem) {
        int porcentagem = valoresPorcentagem.get(0);

        return valoresPorcentagem.stream()
                .skip(1)
                .mapToInt(valor -> (valor * porcentagem) / 100)
                .findFirst()
                .orElse(0);
    }

    public int raiz(int valorRaiz) {
        int resultado = (int) Math.sqrt(valorRaiz);
        return resultado;
    }

}
