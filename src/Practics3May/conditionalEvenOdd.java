package Practics3May;

import java.util.Scanner;

public class conditionalEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EvenOdd = sc.nextInt();
        if (EvenOdd % 2 == 0) {
            System.out.println(" is even");
        }
        else if  (EvenOdd % 2 != 0 ){
            System.out.println(" is odd");

        }

    }
}
