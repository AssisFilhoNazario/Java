package EstruturaRepeticao;

import java.util.Scanner;

public class SomaDosPares {
    /**
     *faca um programa que leia seis numeros inteiros e mostre
     * a soma apenas daqueles que fores pares .Se o valor digitado for impar
     * desconsidere-o
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i<=6; i++){
            System.out.println("Digite o "+ i +" numero:");
            int num = entrada.nextInt();

            if (num % 2 == 0 ){
                soma = soma + num;
            }
        }
        System.out.println(soma);

    }
}
