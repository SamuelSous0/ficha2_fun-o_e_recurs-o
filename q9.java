import java.util.Arrays;

public class q9 {
//    Em um campeonato entre 4 times, uma matriz 4x4 registra os confrontos. A célula
//    m[i][j] contém 1 se o time i venceu o time j, 0 caso contrário. Implemente as
//    seguintes funções:
//            • int[] vitoriasPorTime(int[][] resultados): retorna um vetor com a
//            quantidade de vitórias de cada time.
//            • int timeInvicto(int[][] resultados): retorna o índice do time que não
//            perdeu nenhum jogo. Utilize essas funções para analisar os resultados de um
//            campeonato.

    public static void main(String[] args) {
        int resultados[][] = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 0, 0}
        };

        System.out.println(Arrays.toString(vitoriasPorTime(resultados)));
        System.out.println(timeInvicto(resultados));
    }

    public static int[] vitoriasPorTime(int[][] resultados) {
        int[] vitorias = new int[resultados.length];
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++)
            vitorias[i] += resultados[i][j];{}
        }

        return vitorias;
    }

    public static int timeInvicto(int[][] resultados){
        int vitoria = 1;
        for (int i = 0; i < resultados.length; i++) {
        boolean vitoriaBoolean = true;
            for (int j = 0; j < resultados[i].length; j++) {
                if (resultados[i][j] != vitoria) {
                    vitoriaBoolean = false;
                    break;
                }
            }
        if (vitoriaBoolean) return i;
        }
        return -1;
    }
}
