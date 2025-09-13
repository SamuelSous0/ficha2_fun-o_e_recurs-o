import java.util.Arrays;

public class q5 {
//    Trinta clientes avaliaram um produto com notas de 1 a 5. Implemente as seguintes
//    funções:
//            • int[] frequencia(int[] opinioes): retorna a quantidade de avaliaçõespara cada nota (1 a 5).
//            • double satisfacaoMedia(int[] opinioes): calcula a média dasavaliações. Use essas funções em um programa que leia as 30 avaliações e
//            exiba os resultados.
    public static void main(String[] args) {
        int opinioes[] = {4, 5, 3, 2, 4, 1, 5, 3, 2, 4, 5, 5, 5, 3, 1, 2, 4, 5, 3,
                2,3, 3, 4, 5, 1, 2, 4, 3, 4, 5};

        System.out.println(Arrays.toString(frequencia(opinioes)));
        System.out.println(satisfacaoMedia(opinioes));
    }
    public static int[] frequencia(int[] opinioes) {
        int[] frequencia = {0,0,0,0,0};
        for (int i = 0; i < opinioes.length; i++) {
            if (opinioes[i] == 1) {
                frequencia[0]++;
            } else if (opinioes[i] == 2) {
                frequencia[1]++;
            } else if (opinioes[i] == 3) {
                frequencia[2]++;
            } else if (opinioes[i] == 4) {
                frequencia[3]++;
            } else if (opinioes[i] == 5) {
                frequencia[4]++;
            }
        }
        return frequencia;
    }
    public static double satisfacaoMedia(int[] opinioes) {
        int media = 0;
        for (int i = 0; i < opinioes.length; i++) {
            media += opinioes[i];
        }
        return media / (double) opinioes.length;
    }

}
