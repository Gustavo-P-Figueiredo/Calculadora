package org.example.Historico;

import java.util.LinkedList;
import java.util.Queue;

public class Historico {

    private Queue<Integer> historico = new LinkedList<>();
    private int limite = 5;

    public void salvarResultado(int resultado) {

        if (historico.size() == limite) {
            historico.poll();
        }

        historico.add(resultado);
    }

    public void mostrarHistorico(int resultado) {
        if (historico.isEmpty()) {
            System.out.println("Nenhum resultado salvo.");
        } else {
            System.out.println("Últimos resultados: " + historico);
        }
    }
}