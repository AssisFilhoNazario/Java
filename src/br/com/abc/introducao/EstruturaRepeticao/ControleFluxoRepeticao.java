package br.com.abc.introducao.EstruturaRepeticao;

public class ControleFluxoRepeticao {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            if (contador == 3){
                break;
            }
            contador++;
        }
        contador = 0;
        do{
            System.out.println("Dentro do DOwhile " + contador++);

        }while (contador < 10);


        for (int i = 0; i<10; i++){
            System.out.println("Valor de i é "+ i);
            if (i == 5){
                break;
            }
        }
    }
}
