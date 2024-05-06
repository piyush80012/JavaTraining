package Practics3May;

public class Array2d {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        a[0][0] = 16;
        a[0][1] = 28;
        a[1][0] = 34;
        a[1][1] = 44;
        a[2][0] = 55;
        a[2][1] = 68;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+ " " );
            }
            System.out.println();
        }
    }
}
