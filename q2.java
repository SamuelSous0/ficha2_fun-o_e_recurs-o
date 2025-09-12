import java.util.Scanner;

public class q2 {
    //Uma turma realizou uma votação para escolher um representante entre 5 candidatos
    //(representados pelos índices 0 a 4). Foram computados 20 votos. Escreva um
    //programa que armazene os votos em um vetor e utilize uma função int[]
    //contarVotos(int[] votos) para calcular a quantidade de votos de cada candidato.
    //Utilize também a função int vencedor(int[] contagem) para retornar o índice do
    //candidato mais votado.
    public static void main(String[] args) {
        int votos[] = new int[20];

        Scanner input = new Scanner(System.in);
        for(int i=0;i<votos.length;i++){
            votos[i] = input.nextInt();
            if (votos[i]<0 || votos[i]>4){
                votos[i]=5;
                // VOTO NULO
            }
        }

        int vencedor = vencedor(contarVotos(votos));
    }

    public static int[] contarVotos(int[] votos){
        int[] contadorVotos = {0,0,0,0,0,0};
        // [i] vai ser igual numero candidato

        for (int i = 0; i < votos.length; i++) {
            if (votos[i]==0){
                contadorVotos[0] +=1;
            } else if(votos[i]==1){
                contadorVotos[1] +=1;
            } else if(votos[i]==2){
                contadorVotos[2] +=1;
            } else if(votos[i]==3){
                contadorVotos[3] +=1;
            } else if(votos[i]==4){
                contadorVotos[4] +=1;
            } else {
                contadorVotos[5] +=1;
            }
        }
        return contadorVotos;
    }

    public static int vencedor(int[] contagem) {
        int vencedor = 0;
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > vencedor) {
                vencedor = contagem[i];
            }
        }
        return vencedor;
    }


}
