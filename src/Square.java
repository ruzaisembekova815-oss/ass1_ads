import java.util.Scanner;

public class Square {
    
    static void fillSpiral(int[][] mat, int top, int left, int bottom, int right, int num) {
        if (top > bottom || left > right) return;

        
        for (int i = left; i <= right; i++) {
            mat[top][i] = num++;
        }

       
        for (int i = top + 1; i <= bottom; i++) {
            mat[i][right] = num++;
        }

        
        if (top < bottom) {
            for (int i = right - 1; i >= left; i--) {
                mat[bottom][i] = num++;
            }
        }

       
        if (left < right) {
            for (int i = bottom - 1; i > top; i--) {
                mat[i][left] = num++;
            }
        }

        
        fillSpiral(mat, top + 1, left + 1, bottom - 1, right - 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        fillSpiral(mat, 0, 0, n - 1, n - 1, 1);

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

}
