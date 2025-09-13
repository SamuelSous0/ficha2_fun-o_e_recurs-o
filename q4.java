public class q4 {
//    Um professor registrou as notas de 5 alunos. Implemente uma função int
//    contarNotasAcima(double[] notas, double limite) que conte quantas notas
//    estão acima de um determinado valor (limite). Use essa função em um programa
//    principal que leia as notas e um limite fornecido pelo usuário
    public static void main(String[] args) {
        double notas[] = {6.5, 8.0, 7.5, 5.0, 9.0};
        double limite = 7.0;

        System.out.println(contarNotasAcima(notas, limite));
    }
    public static int contarNotasAcima(double[] notas, double limite) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > limite) {
                contador++;
            }
        }
        return contador;
    }
}
