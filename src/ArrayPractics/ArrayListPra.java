package ArrayPractics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPra {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        list.remove(9);
        System.out.println(list);

    }
}
