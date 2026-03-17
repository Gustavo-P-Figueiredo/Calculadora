package org.example.Operacoes;

import java.util.Stack;

//AVISO: Feito com auxilio de IA, nescessario revisão e maiores testes
public class CalcularExpressao {

    public int calcular(String expressao) {

        Stack<Integer> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {

            char c = expressao.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;
            }

            if (Character.isDigit(c)) {

                int numero = 0;

                while (i < expressao.length() && Character.isDigit(expressao.charAt(i))) {

                    numero = numero * 10 + (expressao.charAt(i) - '0');
                    i++;
                }

                numeros.push(numero);
                i--;
            }

            else if (c == '(') {

                operadores.push(c);
            }

            else if (c == ')') {

                while (operadores.peek() != '(') {

                    int b = numeros.pop();
                    int a = numeros.pop();
                    char operador = operadores.pop();

                    numeros.push(aplicarOperacao(a, b, operador));
                }

                operadores.pop();
            }

            else if (c == '+' || c == '-' || c == '*' || c == '/') {

                while (!operadores.isEmpty() &&
                        precedencia(operadores.peek()) >= precedencia(c)) {

                    int b = numeros.pop();
                    int a = numeros.pop();
                    char operador = operadores.pop();

                    numeros.push(aplicarOperacao(a, b, operador));
                }

                operadores.push(c);
            }
        }

        while (!operadores.isEmpty()) {

            int b = numeros.pop();
            int a = numeros.pop();
            char operador = operadores.pop();

            numeros.push(aplicarOperacao(a, b, operador));
        }

        return numeros.pop();
    }

    private int precedencia(char operador) {

        if (operador == '+' || operador == '-') return 1;
        if (operador == '*' || operador == '/') return 2;

        return 0;
    }

    private int aplicarOperacao(int a, int b, char operador) {

        switch (operador) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;

            default:
                throw new RuntimeException("Operador inválido");
        }
    }
}