package br.com.abc.introducao.SwitchExercicios;

public class ExemploSwitch {
    public static void main(String[] args) {
        byte dia = 5;
        //char, int, byte, enum, short, string
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

        String sexo = "FF";
        switch (sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                    System.out.println("Invalida");
        }
    }
}
