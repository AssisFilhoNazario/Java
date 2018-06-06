package br.com.abc.introducao.CondicoesSimplesComposta;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 20;
        String status;
//        if (idade < 18){
//            status = "Não Adulto";
//        }else{
//            status = "Adulto";
//        }
        status = idade < 18 ? "Nao adulto" : "Adulto";
        System.out.println(status);
    }
}
