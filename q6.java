public class q6 {
//    Crie um programa para verificar se um jogador venceu em uma partida de Jogo da
//    Velha. O tabuleiro deve ser representado por uma matriz 3x3 de caracteres (char).
//    Implemente uma função boolean venceu(char[][] tabuleiro, char jogador)
//    que retorne verdadeiro se o jogador informado venceu a partida (completa uma linha, coluna ou diagonal).
public static void main(String[] args) {
   char tabuleiro[][] = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
    };

    System.out.println(venceu(tabuleiro, 'X'));
}
public static boolean venceu(char[][] tabuleiro, char jogador){

// por linha
    for (int i = 0; i < tabuleiro.length; i++) {
        boolean ok = true;
        for (int j = 0; j < tabuleiro[i].length; j++) {
            if (tabuleiro[i][j] != jogador) {
                ok = false;
                break;
            }
        }
        // se ganhar pela linha
        if (ok) return true;
    }

 // por coluna
    for (int j = 0; j < tabuleiro[0].length; j++) {
        boolean ok = true;
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][j] != jogador) {
                ok = false;
                break;
            }
        }
        // se ganhar pela linha
        if (ok) return true;
    }
// pelas diagonais
    boolean a = true;
    boolean b = true;

    for (int i = 0; i < tabuleiro.length; i++) {
        if (tabuleiro[i][i] != jogador) {
            a = false;
        }
        if (tabuleiro[i][tabuleiro.length-1-i] != jogador) {
            b = false;
        }
    }

    return a || b;
}
}
