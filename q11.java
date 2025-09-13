public class q11 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
