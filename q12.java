public class q12 {
    public static void main(String[] args) {
        System.out.println(decimalParaBinario(0));
    }
    public static String decimalParaBinario(int n) {
        if (n < 2) {
            return String.valueOf(n);
        } else
            return decimalParaBinario(n / 2) + (n % 2);
    }
}
