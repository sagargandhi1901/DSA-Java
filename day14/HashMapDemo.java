package day14;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        // to add data in hashmap
        hm.put(10, "Sagar");
        hm.put(20, "Gandhi");
        hm.put(40, "Diksha");
        hm.put(30, "Sparsh");
        hm.put(80, "Dev");

        // to retrieve values
        System.out.println(hm.get(20));

        // to check number of entries
        System.out.println(hm.size());

        // to check if a particular key is present or not
        System.out.println(hm.containsKey(30));
        System.out.println(hm.containsKey(70));

        // printing keys and their respective values
        for (Integer key : hm.keySet()) {
            System.out.print(key + " : ");
            System.out.println(hm.get(key));
        }

        // to remove any entry from a hashmap
        hm.remove(20);
        System.out.println(hm.size());
        System.out.println(hm.get(20));
    }
}
