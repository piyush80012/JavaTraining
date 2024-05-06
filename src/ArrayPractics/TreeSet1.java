package ArrayPractics;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(5);
        t.add(4);
        t.add(1);
        t.add(10);
        t.add(5);
        System.out.println(t);
    }
}
