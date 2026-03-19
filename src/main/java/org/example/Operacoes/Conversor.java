package org.example.Operacoes;

import org.example.PegarValores.PegarValorConversor;


public class Conversor {
    PegarValorConversor valorConversor = new PegarValorConversor();

    public String converterParaBinario(){

        String resultadoBinario = Integer.toBinaryString(valorConversor.valorDecimal());
        System.out.println(resultadoBinario);
        return resultadoBinario;
    }

    public int converterParaDecimal(){

        int resultadoDecimal = Integer.parseInt(valorConversor.valorBinario(), 2);
        System.out.println(resultadoDecimal);
        return resultadoDecimal;
    }

}
