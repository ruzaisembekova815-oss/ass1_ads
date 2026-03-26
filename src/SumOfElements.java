import java.util.Scanner;

public class SumOfElements {


    public static int sumOfFirstNElements(int[] arr, int n) {
        if (n <= 0) {
            return 0;                          
        }
        return arr[n - 1] + sumOfFirstNElements(arr, n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];


        System.out.println("Input array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("n: ");
        int n = sc.nextInt();


        if (n < 1 || n > size) {
            System.out.println("Error:input correct number");
        } else {
            int result = sumOfFirstNElements(arr, n);

            System.out.println("Result: " + result);
        }

    }
}
