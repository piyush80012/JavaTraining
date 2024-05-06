package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 55, b = 48, c = 95, result;
        result = a < b ? a : b ;
        result = a > c ? a : c ;
        System.out.println(result);
    }
}
