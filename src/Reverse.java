import java.util.Scanner;
public class Reverse {
    static void rev(Scanner sc, int n) {
        if (n == 0) return;
        int x = sc.nextInt();
        rev(sc, n - 1);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rev(sc, n);

    }
}
