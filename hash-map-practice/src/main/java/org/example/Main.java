package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        String matthewsNickname = nicknames.get("matthew");

        System.out.println("Matthew's nickname is: " + matthewsNickname);
    }
}