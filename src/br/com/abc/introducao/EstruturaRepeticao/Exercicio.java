package br.com.abc.introducao.EstruturaRepeticao;
/*
 Imprima todos os numeros pares de 100 até 1000
 */

public class Exercicio {
    public static void main(String[] args) {
        for (int i = 100; i <=1000; i++){
            if (i % 2 ==0){
                System.out.println("Os numeros pares é "+i +",");
            }
        }
    }
}
