package Practics3May;

import java.util.Scanner;

public class ConditionalMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Maximum = sc.nextInt();
        if (Maximum > 9) {
            System.out.println(" is Maximum of 9");

        }
        else if (Maximum < 9) {
            System.out.println(" is not5 Maximum of 9");
        }
    }
}
