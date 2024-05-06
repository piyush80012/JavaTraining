package ArrayPractics;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Amit");
        hm.put(5,"Deepak");
        hm.put(10,"Sunil");
        hm.put(6,"Priyanka");
        hm.put(2,"Piyush");

        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("Math",50);
        hm1.put("English",40);

        System.out.println(hm);
        System.out.println(hm1);

        System.out.println(hm.get(10));
        System.out.println(hm.containsKey(25));
        System.out.println(hm.containsValue("Piyush"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.entrySet());
        System.out.println(hm.size());

    }
}
