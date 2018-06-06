package br.com.abc.introducao.CondicoesSimplesComposta;

public class SimplesCompostas {
    public static void main(String[] args) {
        // idade <15 cateogria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 categoria
        int idade = 18;
        String categoria;

        if (idade < 15){
            categoria = "Categoria Infantil ";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categorial Adulto";
        }

        System.out.println(categoria);
    }
}
