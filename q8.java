public class q8 {
//    Um satélite mapeou as altitudes de uma região em uma matriz 5x5 de inteiros.
//    Implemente as seguintes funções:
//              • int pontoMaisAlto(int[][] mapa): retorna a altitude mais alta.
//              • double mediaAltitude(int[][] mapa): retorna a média das altitudes.
//              • boolean ehPlanalto(int[][] mapa): retorna verdadeiro se todas as
//              altitudes forem iguais. O programa deve usar essas funções para analisar a
//              matriz fornecida pelo usuário.
    public static void main(String[] args) {
        int mapa[][] = {
                {10, 12, 14, 11, 13},
                {9, 11, 12, 10, 13},
                {10, 10, 13, 14, 15},
                {11, 13, 13, 12, 13},
                {12, 14, 15, 13, 10}
        };



        System.out.println(pontoMaisAlto(mapa));
        System.out.println(mediaAltitude(mapa));
        System.out.println(ehPlanalto(mapa));

    }

    public static int pontoMaisAlto(int[][] mapa) {
        int pontoMaisAlto = mapa[0][0];
        for (int i = 1; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] > pontoMaisAlto) {
                    pontoMaisAlto = mapa[i][j];
                }
            }
        }
        return pontoMaisAlto;
    }

    public static double mediaAltitude(int[][] mapa) {
        int total = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                total += mapa[i][j];
            }
        }
        return total / ((double) mapa.length * mapa[0].length);
    }

    public static boolean ehPlanalto(int[][] mapa) {
        int base = mapa[0][0];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] != base) {
                    return false;
                }
            }
        }
        return true;
    }
}
