package Practics3May;

public class Max  {
    public static void main(String[] args){
        int a=10;
        int b=9;
        int c=8;
        Max (a,b,c);



    }
    public static void Max(int a,int b,int c){
        if(a >= b && a>=c){
            System.out.println("max :"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("max :"+b);
        }
        else if(c>=a && c>=b){
            System.out.println("max :"+c);
        }


    }
}
