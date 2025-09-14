public class q14 {

    public static void main(String[] args) {
        System.out.println(ehPrimo(17,2));
    }

    public static boolean ehPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return ehPrimo(n, divisor + 1);
    }
}
