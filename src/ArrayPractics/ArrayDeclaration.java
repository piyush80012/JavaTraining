package ArrayPractics;

public class ArrayDeclaration {
    public static void main(String[] args) {
        /*
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);

         */
       int [] arr = new int[10];
//       arr[0] = 11;
//       arr[1] = 21;
//       arr[2] = 13;
//       arr[3] = 41;
//       arr[4] = 15;
//       arr[5] = 61;
//       arr[6] = 17;
//       arr[7] = 81;
//       arr[8] = 19;
//       arr[9] = 101;
      //  System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ", " + arr[5] + ", " + arr[6] + ", " + arr[7] + ", " + arr[8] + ", " + arr[9] );
        // loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+10
            ;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
