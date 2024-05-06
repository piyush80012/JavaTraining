package ArrayPractics;

import java.util.LinkedList;

public class LinkedlistPrac {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        l.addFirst(5);
        System.out.println(l);
        l.addLast(20);
        System.out.println(l);


    }
}
