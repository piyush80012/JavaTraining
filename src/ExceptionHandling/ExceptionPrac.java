package ExceptionHandling;

public class ExceptionPrac {
    public static void main(String[] args) {
     try {
         int a = 10;
         int b = 0;
         double d = a / b;
         System.out.println(d);
     }
     catch (Exception e){
         System.out.println("divide by zero is not possible");
     }

        System.out.println("deepak");
    }
}
