package Practics3May;

public class PrintPattern {
    public static void main(String[] args) {
        int row = 10;
        int col = 20;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
