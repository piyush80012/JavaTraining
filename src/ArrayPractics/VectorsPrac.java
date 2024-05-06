package ArrayPractics;

import Operators.ShiftOperators;

import java.util.Vector;

public class VectorsPrac {
    public static void main(String[] args) {
        Vector<Integer> vl =new Vector<>();
        vl.add(1);
        System.out.println(vl);
        vector();
        add11();

    }

    public static void vector() {
        Vector<Integer> vl = new Vector<>();
        vl.add(8558);
        vl.add(8494);
        vl.add(806886);
        vl.add(55653);
        vl.add(546859);
        vl.add(45668);

        System.out.println(vl);
        vl.clone();
        System.out.println(vl);
    }

    public static void add11() {
        Vector<Integer> vl = new Vector<>();
        vl.add(5468);
        vl.add(56+5);
        vl.add(96);
        System.out.println(vl);
        vl.clear();
        System.out.println(vl);

    }
}
