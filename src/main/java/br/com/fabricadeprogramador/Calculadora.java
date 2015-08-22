package br.com.fabricadeprogramador;

/**
 * Created by Virmerson Bento dos Santos on 21/08/15.
 */
public class Calculadora {

    /**
     * Somando vários inteiros
     * @param n
     * @return
     */
    public int calcularSoma(int ... n){
        int soma = 0;
        for (int i: n){
            soma = soma+i;
        }
        return soma;
    }
}
