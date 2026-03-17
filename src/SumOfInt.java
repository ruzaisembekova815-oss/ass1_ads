import java.util.Scanner;

public class SumOfInt {
        public static int sumOfInt(int n){
            if (n == 0){
                return 0;
            }
            return n  +sumOfInt(n-1);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n<1){
                System.out.println("Should be positive number");
            }
            else{
                System.out.println(sumOfInt(n));
            }

        }
}

