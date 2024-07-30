package org.example;

import java.util.HashMap;
import java.util.Map;

public class Print {

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        System.out.println("printKeys:");
        printKeys(hashmap);
        System.out.println("---");

        System.out.println("printKeysWhere (\"i\"):");
        printKeysWhere(hashmap, "i");
        System.out.println("---");

        System.out.println("printValuesOfKeysWhere (\".e\"):");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}