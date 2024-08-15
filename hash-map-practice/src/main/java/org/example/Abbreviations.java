package org.example;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {  // Declares a public class named Abbreviations.
    private Map<String, String> abbreviations;  // Defines a private Map to store abbreviations and their explanations.

    // Constructor
    public Abbreviations() {  // Defines the constructor for the Abbreviations class.
        this.abbreviations = new HashMap<>();  // Initializes the abbreviations Map as a new HashMap.
    }

    // Method to add a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {  // Defines a method to add a key-value pair to the abbreviations Map.
        abbreviations.put(abbreviation, explanation);  // Adds the abbreviation and its explanation to the Map.
    }

    // Method to check if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {  // Defines a method that checks if a given abbreviation exists in the Map.
        return abbreviations.containsKey(abbreviation);  // Returns true if the abbreviation is present in the Map, false otherwise.
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {  // Defines a method to retrieve the explanation for a given abbreviation.
        return abbreviations.getOrDefault(abbreviation, null);  // Returns the explanation if found, otherwise returns null.
    }

    // Main method for testing purposes
    public static void main(String[] args) {  // The main method, which is the entry point for the program.
        Abbreviations abbreviations = new Abbreviations();  // Creates a new instance of the Abbreviations class.

        abbreviations.addAbbreviation("e.g.", "for example");  // Adds an abbreviation and its explanation to the Map.
        abbreviations.addAbbreviation("etc.", "and so on");  // Adds another abbreviation and explanation.
        abbreviations.addAbbreviation("i.e.", "more precisely");  // Adds another abbreviation and explanation.

        String text = "e.g. i.e. etc. lol";  // Defines a string of text that contains abbreviations.

        for (String part: text.split(" ")) {  // Splits the text into parts based on spaces and iterates over each part.
            if (abbreviations.hasAbbreviation(part)) {  // Checks if the current part is an abbreviation.
                part = abbreviations.findExplanationFor(part);  // If it is an abbreviation, replace it with its explanation.
            }

            System.out.print(part);  // Prints the part (either the original or the explanation).
            System.out.print(" ");  // Prints a space after each part.
        }

        System.out.println();  // Prints a newline character at the end of the output.
    }
}
