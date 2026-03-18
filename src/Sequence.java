import java.util.Scanner;

public class Sequence {

    // Рекурсивная генерация всех последовательностей
    static void gen(String s, int pos, int n, int k) {
        if (pos == n) {
            System.out.println(s.trim());   // выводим готовую строку
            return;
        }
        for (int i = 1; i <= k; i++) {
            gen(s + i + " ", pos + 1, n, k);   // добавляем число и пробел
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        gen("", 0, n, k);   // начинаем с пустой строки
    }
}