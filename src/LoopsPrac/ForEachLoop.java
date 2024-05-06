package LoopsPrac;

public class ForEachLoop {
    public static void main(String[] args) {
       // int range =10;
        int [] arr = new int[10];
        arr[0] = 12;
        arr[1] = 22;
        arr[2] = 33;

        arr[3] = 34;
        arr[4] = 54;
        arr[5] =36;
        arr[6] = 7;

        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
