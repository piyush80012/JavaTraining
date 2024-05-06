package Practics3May;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ConditionalLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LeapYear = sc.nextInt();
        if (LeapYear % 4 == 0 && LeapYear % 100 != 0 ||  LeapYear % 400 == 0) {
            System.out.println(LeapYear+" is a Leap Year");
        }
        else {
            System.out.println(LeapYear+" is not a Leap Year");
        }

    }
}
