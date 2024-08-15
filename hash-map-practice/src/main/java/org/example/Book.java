package org.example;

public class Book { 
    // Declares a public class named 'Book'. The 'public' keyword means this class can be accessed from other classes.

    private String name; 
    // Declares a private field named 'name' of type 'String'. It's private, so it can only be accessed within this class.

    private int year; 
    // Declares a private field named 'year' of type 'int'. This field is also private, so it can only be accessed within this class.

    private String content; 
    // Declares a private field named 'content' of type 'String'. Like the others, it's private and only accessible within this class.

    public Book(String name, int year, String content) { 
        // Defines a public constructor for the 'Book' class. This constructor allows you to create a new 'Book' object with a specified name, year, and content.

        this.name = name; 
        // Assigns the value of the 'name' parameter to the 'name' field of this object (the current instance of the 'Book' class).

        this.year = year; 
        // Assigns the value of the 'year' parameter to the 'year' field of this object.

        this.content = content; 
        // Assigns the value of the 'content' parameter to the 'content' field of this object.
    }

    public String getName() { 
        // Declares a public method 'getName' that returns a 'String'. This method allows other classes to access the 'name' field.

        return name; 
        // Returns the value of the 'name' field.
    }

    @Override 
    // Indicates that the following method overrides a method from the superclass, in this case, the 'toString' method from the 'Object' class.

    public String toString() { 
        // Declares a public method 'toString' that returns a 'String'. This method provides a custom string representation of the 'Book' object.

        return "Name: " + name + " (" + year + ")\nContents: " + content; 
        // Returns a string that includes the book's name, year, and content, formatted for easy reading.
    }
}
