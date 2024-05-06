package StringPrac;

import java.util.Scanner;

public class StringHorizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        vertical(str);
        printevenOddchars(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i) + " ");
        }

    }
    public static void vertical(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void printevenOddchars(String str){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) % 2 == 1){
                System.out.println("odd char: "+str.charAt(i));
            }else
                System.out.println("even chars " + str.charAt(i));
        }
    }


}
