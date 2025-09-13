import java.util.Arrays;
public class q10 {
//    Um jogo de nave espacial utiliza uma matriz 10x10 para representar o radar. A matriz
//    contém:
//            • 0 para áreas livres,
//            • 1 para inimigos comuns,
//            • 9 para o "chefão".
//            Implemente as seguintes funções:
//            • int contarInimigos(int[][] mapa): conta todos os inimigos comuns.
//            • boolean haInimigoNaDiagonal(int[][] mapa): verifica se há inimigos
//            comuns nas diagonais principais.
//            • int[] posicaoDoChefe(int[][] mapa): retorna a posição do chefão na
//             matriz (linha e coluna). Use essas funções para analisar o estado do radar.
    public static void main(String[] args) {
        int campo[][] = new int[10][10];


        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = 0;
            }
        }

        // local do boss
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        campo[x][y] = 9;

        // total de inimigos
        int totalInimigos = (int)(Math.random() * 15);
        // geração aleatoria no campo
        int colocados = 0;
        while (colocados < totalInimigos) {
            int a = (int)(Math.random() * 10);
            int b = (int)(Math.random() * 10);

            if (campo[a][b] == 0) {
                campo[a][b] = 1;
                colocados++;
            }
        }

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                System.out.print("\t"+campo[i][j]);
            }
            System.out.println();
        }

        System.out.println(contarInimigos(campo));
        System.out.println(haInimigoNaDiagonal(campo));
        System.out.println(Arrays.toString(posicaoDoChefe(campo)));
    }

    public static int contarInimigos(int[][] mapa) {
        int count = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean haInimigoNaDiagonal(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i][i] == 1) {
                return true;
            }
            if (mapa[i][mapa.length-1-i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static int[] posicaoDoChefe(int[][] mapa) {
        int posicaoDoChefe[] = new int[2];

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 9) {
                    posicaoDoChefe[0] = i;
                    posicaoDoChefe[1] = j;
                }
            }
        }

        return posicaoDoChefe;
    }
}
