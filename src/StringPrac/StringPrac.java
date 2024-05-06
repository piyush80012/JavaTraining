package StringPrac;

import java.util.Scanner;

public class StringPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //  String s= "Piyush";
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        // index
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        // print
        System.out.println("Hello "+s);
        // length
        System.out.println(s.length());
        // substring
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(0,s.length()));

        //lower case
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        if(s1.equals(s)){
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");

    }
}
