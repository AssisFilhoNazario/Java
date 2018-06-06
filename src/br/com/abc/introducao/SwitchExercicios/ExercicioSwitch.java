package br.com.abc.introducao.SwitchExercicios;

public class ExercicioSwitch {
    public static void main(String[] args) {
        int dia = 18;
        switch (dia){
            case 1:
                System.out.println("Domingo é final de semana");
                break;
            case 2:
                System.out.println("Segunda é dia util");
                break;
            case 3:
                System.out.println("Terça é dia util");
                break;
            case 4:
                System.out.println("Quarta é dia util");
                break;
            case 5:
                System.out.println("Quinta é dia util");
                break;
            case 6:
                System.out.println("Sexta aé dia util");
                break;
            case 7:
                System.out.println("Sabado é final de semana");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
