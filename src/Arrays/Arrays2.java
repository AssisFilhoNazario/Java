package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int ,long , float, double = 0
        //char = espaço em branco
        // Boleanos = falso
        // references(String) = null
        String[] nome = new String[3];
        nome[0] = "Goku";
        nome[1] = "Naruto";
        nome[2] = "Zezinho";
        for (int i = 0; i <nome.length; i++){
            System.out.println(i +1 +" nome " +nome[i]);
        }




    }
}
