package org.example;

import java.util.HashMap;

public class IOU {
    // Declare a private HashMap to store debts, where the key is the person's name (String) and the value is the amount owed (Double)
    private HashMap<String, Double> debts;

    // Constructor for the IOU class
    public IOU() {
        // Initialize the debts HashMap when an IOU object is created
        this.debts = new HashMap<>();
    }

    // Method to set or update the amount owed to a specific person
    public void setSum(String toWhom, double amount) {
        // Store the amount owed in the debts HashMap, using the person's name as the key
        debts.put(toWhom, amount);
    }

    // Method to retrieve the amount owed to a specific person
    public double howMuchDoIOweTo(String toWhom) {
        // Return the amount owed to the specified person, or 0.0 if the person is not found in the debts HashMap
        return debts.getOrDefault(toWhom, 0.0);
    }

    // Main method to test the functionality of the IOU class
    public static void main(String[] args) {
        // Create a new IOU object
        IOU mattsIOU = new IOU();

        // Set the amount owed to "Arthur" as 51.5
        mattsIOU.setSum("Arthur", 51.5);

        // Set the amount owed to "Michael" as 30
        mattsIOU.setSum("Michael", 30);

        // Print the amount owed to "Arthur" (should print 51.5)
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));

        // Print the amount owed to "Michael" (should print 30.0)
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        // Update the amount owed to "Arthur" to 10.5
        mattsIOU.setSum("Arthur", 10.5);

        // Print the updated amount owed to "Arthur" (should print 10.5)
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}
