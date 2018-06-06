package br.com.abc.introducao.Basico;

public class RelatorioPedencia {
    /**
     * Crie um algoritmo que possua variaveis para salvar os seguintaes dados
     * Nonme, Enderereço e Telefone
     * Imprima essas variaveis da seguinte forma : O <nome> domiciliado no endereço
     * <endereco> e telefone <telefone> não possui nenhum tipo de pedencia.
     */
    public static void main(String[] args) {
        String nome = "Marla";
        String endereco = "Rua Sousa Girão";
        String telefone = "(85)9985-3415";

        System.out.println("A " + nome + " domiciliado no endereço " + endereco + "\n" +
                "e telefone " + telefone + ", não possui nenhum tipo de pedência.");

    }
}

