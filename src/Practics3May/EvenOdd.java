package Practics3May;

public class EvenOdd {
    public static void main(String[] arg){
        int a=5;
        int b=8;
        int c=9;

        EvenOdd (a,b,c);;
    }
    public static void EvenOdd (int a,int b,int c){
     if(a%2==0) {
            System.out.println(a + "is even");
        }
        if (a%2!=0) {
            System.out.println(a + "is odd");
        }
        if (b%2==0) {
            System.out.println(b + "is even");
        }
        if (b%2!=0) {
            System.out.println(b + "is odd");
        }
    if (c%2==0) {
        System.out.println(c + "is even");
    }
    if (c%2!=0) {
        System.out.println(c + "is odd");
    }
    }
}
