package Operators;

public class ArthmaticOperators {
    public static void main(String[] args) {
        int a= 6;
        int b= 7;
        int c= a+b;
        System.out.println(c);
        subtract();
        multiply();
        divide();
        modolus();

    }

    public static void subtract(){
        int a= 6;
        int b= 7;
        int c= a-b;
        System.out.println(c);
    }
    public static void multiply(){
        int a= 6;
        int b= 7;
        int c= a*b;
        System.out.println(c);
    }
    public static void divide(){
        int a= 12;
        int b= 6;
        int c= a/b;
        System.out.println(c);
    }
    public static void modolus(){
        int a= 12;
        int b= 6;
        int c= a%b;
        System.out.println(c);
    }
}
