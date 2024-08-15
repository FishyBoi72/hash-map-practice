package org.example;

import java.util.HashMap;

// The main class named 'Print2'.
public class Print2 {

    // A static method named 'printValues' that takes a HashMap as a parameter.
    // The HashMap has a key of type String and a value of type Book.
    public static void printValues(HashMap<String, Book> hashmap) {
        // A for-each loop that iterates over all values (Book objects) in the hashmap.
        for (Book book : hashmap.values()) {
            // Prints the current book object to the console.
            System.out.println(book);
        }
    }

    // A static method named 'printValueIfNameContains' that takes a HashMap and a String as parameters.
    // The HashMap has a key of type String and a value of type Book, and the String is used for searching.
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        // A for-each loop that iterates over all values (Book objects) in the hashmap.
        for (Book book : hashmap.values()) {
            // Checks if the name of the book contains the specified text (case-insensitive).
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                // If the condition is true, prints the current book object to the console.
                System.out.println(book);
            }
        }
    }

    // The main method, which serves as the entry point of the program.
    public static void main(String[] args) {
        // Creates a new HashMap instance that maps String keys to Book objects.
        HashMap<String, Book> hashmap = new HashMap<>();

        // Adds two entries to the hashmap. The key is a string, and the value is a new Book object.
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        // Prints "printValues:" to the console.
        System.out.println("printValues:");
        // Calls the 'printValues' method, passing the hashmap as an argument.
        printValues(hashmap);
        // Prints "---" to the console as a separator.
        System.out.println("---");

        // Prints "printValueIfNameContains (\"prejud\"):" to the console.
        System.out.println("printValueIfNameContains (\"prejud\"):");
        // Calls the 'printValueIfNameContains' method, passing the hashmap and the string "prejud" as arguments.
        printValueIfNameContains(hashmap, "prejud");
    }
}
