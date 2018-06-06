package br.com.abc.introducao.Basico;

public class OperadoresLogicos {
    public static void main (String []args){
        int idade = 18;
        float salario = 1000;
        System.out.println(idade >= 18 && salario <= 10);
        System.out.println(idade >= 18 || salario >= 1000);
    }
}
