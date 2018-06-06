package br.com.abc.introducao.CondicoesSimplesComposta;

public class ExercicioCondicoesSimplesComposta {
    /**
     * Crie uma variavel salario
     *imposto:
     * Salario < 1000 5%
     * salario > = 1000 && salario <2000 10%
     * salario >=2000 && salario < 4000  15%
     * salario > 5000 20%
     */
    public static void main(String[] args) {

        double salario = 900;
        double imposto;
        if (salario < 1000){
            imposto = salario * 5 / 100;
        }else if (salario >= 1000 && salario < 2000){
            imposto = salario * 10/100;
        }else if (salario >= 2000 && salario < 4000){
            imposto = salario * 15/100;
        }else {
            imposto = salario * 20/100;
        }
        System.out.println(imposto);

    }
}
