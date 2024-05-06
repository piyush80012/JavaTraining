package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        System.out.println("a += " + a +":" + (a += 6));
        System.out.println("a *= " + a +":" + (a *= 6));
        System.out.println("a %= " + a +":" + (a %= 6));
        System.out.println("a /=  "+ a +":"+ (a /= 6));
        System.out.println("a -=  "+ a +":" + (a -= 6));
        System.out.println("a &=  "+ a +":" + (a &= 6));
        System.out.println("a |=  "+ a +":" + (a |= 6));
        System.out.println("a ^= " + a +":"+ (a ^= 6));
        System.out.println("a <<= " + a +":" + (a <<= 6));
        System.out.println("a >>= " + a +":" + (a >>= 6));
        System.out.println("a >>>=  "+ a +":" + (a >>>= 6));

    }
}
