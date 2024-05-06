package ArrayPractics;

import Operators.ShiftOperators;

import javax.sql.rowset.spi.SyncProvider;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l.add(3);
        l.add(8);
        l.add(85);
        l1.addAll(l);
        System.out.println(l1);
        System.out.println(l);
        l.addLast ( 78);
        System.out.println(l);
        add();
    }

    public static void add() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(90);
        l.add(859);
        System.out.println(l);

        System.out.println(l);


    }
}
