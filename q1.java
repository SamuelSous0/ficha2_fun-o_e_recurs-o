import java.util.Scanner;

public class q1 {
    //Uma loja possui um vetor com os preços de 10 produtos. Ela deseja aplicar um
    //reajuste percentual a todos esses preços. Escreva um programa em Java que leia os
    //preços e o percentual de reajuste, e utilize uma função chamada double[]
    //reajustarPrecos(double[] precos, double percentual) para retornar um
    //novo vetor com os preços atualizados.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precos[] =
                {100.0, 50.0, 75.0, 30.0, 200.0, 120.0, 60.0, 80.0, 90.0, 40.0};


        System.out.println("Digite o valor da porcentagem: ");
        double porcentagem = input.nextDouble();

        double[] precosComReajuste = reajustarPrecos(precos, porcentagem);

        for (int i = 0; i < precosComReajuste.length; i++) {
            System.out.print(precosComReajuste[i]+"\t ");
        }
        System.out.println();
    }


    public static double[] reajustarPrecos(double[] precos,double percentual ){
        for (int i = 0; i < precos.length; i++) {
            precos[i] =Math.round( precos[i] * (1+(percentual / 100)));
        }
        return precos;
    }
}
