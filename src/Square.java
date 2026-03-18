import java.util.Scanner;

public class Square {
    // Рекурсивная функция заполнения спирали (по слоям)
    static void fillSpiral(int[][] mat, int top, int left, int bottom, int right, int num) {
        if (top > bottom || left > right) return;

        // 1. Верхняя строка слева направо
        for (int i = left; i <= right; i++) {
            mat[top][i] = num++;
        }

        // 2. Правая колонка сверху вниз
        for (int i = top + 1; i <= bottom; i++) {
            mat[i][right] = num++;
        }

        // 3. Нижняя строка справа налево (если есть)
        if (top < bottom) {
            for (int i = right - 1; i >= left; i--) {
                mat[bottom][i] = num++;
            }
        }

        // 4. Левая колонка снизу вверх (если есть)
        if (left < right) {
            for (int i = bottom - 1; i > top; i--) {
                mat[i][left] = num++;
            }
        }

        // Рекурсия — переходим к внутреннему слою
        fillSpiral(mat, top + 1, left + 1, bottom - 1, right - 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        fillSpiral(mat, 0, 0, n - 1, n - 1, 1);

        // Вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

}
