package br.com.abc.introducao.CondicoesSimplesComposta;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        //Crie um algoritmo que dado 3 numeros verifique qual o maior e o menor, imprima na tala o resultado.
        Scanner entrada = new Scanner(System.in);
        int num1 ;
        int num2;
        int num3;
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = entrada.nextInt();

        //Maior valor
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O maior número é " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O maior numero é " + num2);
        } else {
            System.out.println("O maior é o " + num3);
        }

        //Menor valor
        if ((num1 < num2) && (num1 < num2)) {
            System.out.println("O menor numero é " + num1);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("O menor numero é " + num1);
        } else {
            System.out.println("O menor  é " + num3);
        }
    }
}
