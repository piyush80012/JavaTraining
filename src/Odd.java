public class Odd {
    public static void main(String[] args) {
        int a=9;
        int b=5;
        int c=4;
           Odd (a,b,c);
    }
    public static void Odd (int a, int b, int c) {
        if(a%2 !=0){
            System.out.println( a + " is Odd");
            if(b%2 !=0){
                System.out.println(b + " is Odd");
                if(c%2 !=0){
                    System.out.println(c + " is Odd");
                }
            }
        }

    }
}

