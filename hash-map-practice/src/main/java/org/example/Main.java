package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Creates a new HashMap object named 'nicknames' that maps Strings to Strings.
        HashMap<String, String> nicknames = new HashMap<>();

        // Adds a key-value pair to the HashMap, where the key is "matthew" and the value is "matt".
        nicknames.put("matthew", "matt");
        // Adds a key-value pair to the HashMap, where the key is "michael" and the value is "mix".
        nicknames.put("michael", "mix");
        // Adds a key-value pair to the HashMap, where the key is "arthur" and the value is "artie".
        nicknames.put("arthur", "artie");

        // Retrieves the value associated with the key "matthew" from the HashMap and stores it in the variable 'matthewsNickname'.
        String matthewsNickname = nicknames.get("matthew");

        // Prints out the string "Matthew's nickname is: " followed by the value stored in 'matthewsNickname'.
        System.out.println("Matthew's nickname is: " + matthewsNickname);
    }
}
