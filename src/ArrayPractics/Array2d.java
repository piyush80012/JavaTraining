package ArrayPractics;

public class Array2d {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 19;
        arr[0][1] = 12;
        arr[1][0] = 311;
        arr[1][1] = 4111;
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][0]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}
