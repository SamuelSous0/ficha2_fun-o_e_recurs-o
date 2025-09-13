public class q3 {
//Um sensor registrou as temperaturas diárias durante uma semana. As temperaturas
//estão armazenadas em um vetor. Escreva funções para:
//        • Calcular a média das temperaturas (double media(double[] temps))
//        • Retornar a quantidade de dias com temperatura acima da média (int diasAcimaMedia(double[] temps))
//        • Retornar a menor temperatura registrada (double menorTemperatura(double[] temps))
    public static void main(String[] args) {
        double temps[] = {30.5, 32.0, 29.0, 28.5, 31.0, 27.5, 33.0};
        System.out.printf("%.2f",media(temps));
        System.out.println("\n"+acimaDaMedia(temps));
        System.out.println(menoTemperatura(temps));

    }
    public static double media(double[] temps) {
        // fazer media do vetor
        double media = 0;
        for (int i = 0; i < temps.length; i++) {
            media += temps[i];
        }
        return media / temps.length;
    }
    public static int acimaDaMedia(double[] temps) {
        // dias acima
        double media = media(temps);
        int contador = 0;
        for (int i = 0; i < temps.length; i++) {
            if (media < temps[i]) {
                contador++;
            }
        }
        return contador;
    }
    public static double menoTemperatura(double[] temps) {
        // dia com menor temperatura
        double menorTemperatura = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < menorTemperatura) {
                menorTemperatura = temps[i];
            }
        }
        return menorTemperatura;
    }
}
