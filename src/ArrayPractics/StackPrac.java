package ArrayPractics;

import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
