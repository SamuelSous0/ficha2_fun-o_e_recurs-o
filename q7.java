import java.util.Arrays;

public class q7 {
//    Uma loja possui 3 produtos e registra as vendas em 4 trimestres do ano, resultando em
//    uma matriz 3x4. Implemente as seguintes funções:


    public static void main(String[] args) {

        double vendas[][] = {
                {100.0, 120.0, 130.0, 140.0}, // Produto 1
                {80.0, 90.0, 100.0, 110.0}, // Produto 2
                {200.0, 210.0, 220.0, 230.0} // Produto 3
        };

        System.out.println(Arrays.toString(totalPorProduto(vendas)));
        System.out.println(Arrays.toString(totalPorTrimestre(vendas)));
    }
//     • double[] totalPorProduto(double[][] vendas): retorna um vetor com o
//    total de vendas por produto.
    public static double[] totalPorProduto(double[][] vendas) {
        double totalPorProduto[] = new double[vendas.length];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalPorProduto[i] += vendas[i][j];
            }
        }

        return totalPorProduto;
    }
//    • double[] totalPorTrimestre(double[][] vendas): retorna um vetor com
//    o total de vendas por trimestre. O programa principal deve ler a matriz de
//    vendas e exibir os totais por produto e por trimestre.
    public static double[] totalPorTrimestre(double[][] vendas) {
        double totalPorTrimestre[] = new double[vendas[0].length];
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalPorTrimestre[j] += vendas[i][j];
            }
        }

        return totalPorTrimestre;
    }

}
