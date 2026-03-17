import java.util.Scanner;

public class SumOfSquares {
    public static int sumOfSquares(int n){
        if (n == 0){
            return 0;
        }
        return n * n +sumOfSquares(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1){
            System.out.println("Should be positive number");
        }
        else{
            System.out.println(sumOfSquares(n));
        }

    }
}
