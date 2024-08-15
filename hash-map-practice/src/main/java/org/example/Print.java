package org.example;

import java.util.HashMap;
import java.util.Map;

public class Print { 
    // Declares a public class named "Print".

    public static void printKeys(HashMap<String, String> hashmap) { 
        // Declares a static method named printKeys that takes a HashMap with String keys and values as an argument.
        for (String key : hashmap.keySet()) { 
            // Iterates over the set of keys in the hashmap.
            System.out.println(key); 
            // Prints each key to the console.
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) { 
        // Declares a static method named printKeysWhere that takes a HashMap and a String as arguments.
        for (String key : hashmap.keySet()) { 
            // Iterates over the set of keys in the hashmap.
            if (key.contains(text)) { 
                // Checks if the key contains the specified text.
                System.out.println(key); 
                // Prints the key to the console if the condition is true.
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) { 
        // Declares a static method named printValuesOfKeysWhere that takes a HashMap and a String as arguments.
        for (Map.Entry<String, String> entry : hashmap.entrySet()) { 
            // Iterates over the set of entries (key-value pairs) in the hashmap.
            if (entry.getKey().contains(text)) { 
                // Checks if the key of the current entry contains the specified text.
                System.out.println(entry.getValue()); 
                // Prints the value associated with the key to the console if the condition is true.
            }
        }
    }

    public static void main(String[] args) { 
        // Declares the main method, the entry point of the Java application.
        HashMap<String, String> hashmap = new HashMap<>(); 
        // Creates a new HashMap object with String keys and values.
        hashmap.put("f.e", "for example"); 
        // Adds a key-value pair ("f.e", "for example") to the hashmap.
        hashmap.put("etc.", "and so on"); 
        // Adds a key-value pair ("etc.", "and so on") to the hashmap.
        hashmap.put("i.e", "more precisely"); 
        // Adds a key-value pair ("i.e", "more precisely") to the hashmap.

        System.out.println("printKeys:"); 
        // Prints "printKeys:" to the console.
        printKeys(hashmap); 
        // Calls the printKeys method with the hashmap as an argument.
        System.out.println("---"); 
        // Prints "---" to the console as a separator.

        System.out.println("printKeysWhere (\"i\"):"); 
        // Prints "printKeysWhere (\"i\"):" to the console.
        printKeysWhere(hashmap, "i"); 
        // Calls the printKeysWhere method with the hashmap and "i" as arguments.
        System.out.println("---"); 
        // Prints "---" to the console as a separator.

        System.out.println("printValuesOfKeysWhere (\".e\"):"); 
        // Prints "printValuesOfKeysWhere (\".e\"):" to the console.
        printValuesOfKeysWhere(hashmap, ".e"); 
        // Calls the printValuesOfKeysWhere method with the hashmap and ".e" as arguments.
    }
}
