import java.util.Scanner;

public class Sequence {

    
    static void gen(String s, int pos, int n, int k) {
        if (pos == n) {
            System.out.println(s.trim());  
            return;
        }
        for (int i = 1; i <= k; i++) {
            gen(s + i + " ", pos + 1, n, k);   
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        gen("", 0, n, k);   
    }
}
