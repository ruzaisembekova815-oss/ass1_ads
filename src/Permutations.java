import java.util.Scanner;

public class Permutations {
    // Рекурсивная генерация всех перестановок (backtracking)
    static void permute(char[] arr, int start, int end) {
        if (start == end) {
            for (char c : arr) System.out.print(c);
            System.out.println();
            return;
        }

        for (int i = start; i <= end; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, end);
            swap(arr, start, i);  // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();   // ввод строки (AB или IOX)

        char[] arr = s.toCharArray();
        permute(arr, 0, arr.length - 1);

    }
}
