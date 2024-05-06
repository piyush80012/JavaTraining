package Practics3May;

public class Factorial {
    public static void main(String[] args) {
        int a = 10;
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial* i;

        }
        System.out.println(factorial);
    }
}
