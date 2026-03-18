public class Power {

    // Только одна функция, один параметр, рекурсия к самой себе (helper запрещён)
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 32; i++) {
            System.out.println(i + " is " +
                    (isPowerOfTwo(i) ? "a" : "not a") +
                    " power of two");
        }
    }
}

