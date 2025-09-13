public class q13 {
    public static void main(String[] args) {
        System.out.println(potencia(2,4));
    }
    public static  int potencia(int x, int n) {
        if (n == 1) {
            return x;
        } else
            return x*potencia(x, n - 1);
    }
}
