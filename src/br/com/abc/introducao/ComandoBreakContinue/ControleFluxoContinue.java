package br.com.abc.introducao.ComandoBreakContinue;

public class ControleFluxoContinue {
    public static void main(String[] args) {
        //Dado um valor de um carro que é de 30000, descubra em quantas vezes ele pode ser
        //parcelado, porém as parcelas nao podem ser menores do que 1000;

        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >=1;parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }


    }
}
