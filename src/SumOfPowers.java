import java.util.Scanner;

public class SumOfPowers {
    static long powerSum(int b, int n) {
        if (n == 0) return 1;
        return (long) Math.pow(b, n) + powerSum(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("n: ");
        int n = sc.nextInt();

        long result = powerSum(b, n);


        System.out.println("Result: " + result);
    }

}
