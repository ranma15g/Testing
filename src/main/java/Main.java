/*

Class: COP 2800: Java Programming

Instructor: Francis Fiskey

9.8 (The Fan class) Design a class named Fan to represent a fan. 

The class contains:

Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.

A private int data field named speed that specifies the speed of the fan (the default is SLOW).

A private boolean data field named on that specifies whether the fan is on (the default is false).

A private double data field named radius that specifies the radius of the fan (the default is 5).

A string data field named color that specifies the color of the fan (the default is blue).

The accessor and mutator methods for all four data fields.

A no-arg constructor that creates a default fan.

A method named toString() that returns a string description for the fan.

If the fan is on, the method returns the fan speed, color, and radius in one combined string.

If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string

Due: Nov 24 by 11:59pm

I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

public class Main { // open the class block

    /* Three constants named SLOW, MEDIUM, and FAST with 
        the values 1, 2, and 3 to denote the fan speed. */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    /* Declaring constants as public static final makes them 
       accessible from other classes but prevents them from 
       being modified. */
    
    /* A private int data field named speed that 
        specifies the speed of the fan (the default is SLOW). */
    private int speed;

    /* A private boolean data field named on that specifies 
       whether the fan is on (the default is false). */
    private boolean on;

    /* A private double data field named radius that 
       specifies the radius of the fan (the default is 5). */
    private double radius;

    /* A string data field named color that specifies 
       the color of the fan (the default is blue). */
    private String color;



    /* A no-arg constructor that creates a default fan. */
    public Main() {
        speed = SLOW; // (the default is SLOW)
        on = false; // (the default is false)
        radius = 5.0; // (the default is 5)
        color = "blue"; // (the default is blue
    }



    


    // The Mutators

    // These methods are used to set or modify the value of a private field.   

    /* The this keyword is used to differentiate between a local variable and an instance variable when they have the same name. 

    A local variable is a variable declared within a specific block of code and accessible only within that block.

   Instance variables are declared within the class body but outside of any methods, constructors, or blocks. They are associated with each individual object of the class.
    
    */

    public void setSpeed(int speed) { // create the muator method for speed
        this.speed = speed; // this.speed refers to the instance variable speed
    }
    
    public void setOn(boolean on) { // create the mutator method for on
        this.on = on; // this.on refers to the instance variable on
    }

    public void setRadius(double radius) { // create the mutator method for radius
        this.radius = radius; // this.radius refers to the instance variable radius
    }
    
    public void setColor(String color) { 
        this.color = color; // this.color refers to the instance variable color
    }




    // The Accessors

    // These methods are used to retrieve the value of a private field.   

    public int getSpeed() { // create the accessor method for speed
        return speed; // get the speed
    }

    public boolean isOn() { // create the accessor method for on
        return on; // find out if the fan is on or off
    }

    public double getRadius() { // create the accessor method for radius
        return radius; // determine the radius of the fan
    }

    public String getColor() { // create the accessor method for color
        return color; // determine the color of the fan
    }



    
    
    
    // A method named toString() that returns a string description for the fan.
    public String toString() { /* Because this string will be used in the context of
                                  the main method, it is automatically called implicity */

        String speedString; /* create a placeholder to capture the verbal speed of the
                               fan based on which constant equals the speed value */

            /* if the speed is equal to the int value of the constant named SLOW
               then the speedString is set to "slow" */
        if (speed == SLOW) { speedString = "slow"; } 

            /* if the speed is equal to the int value of the constant named MEDIUM
               then the speedString is set to "medium" */
            else if (speed == MEDIUM) { speedString = "medium"; } 

            /* if the speed is equal to the int value of the constant named FAST
               then the speedString is set to "fast" */
            else if (speed == FAST) { speedString = "fast"; }

            // Handle unexpected speed values 
            else { speedString = "unknown"; }       
       
        if (on) { /* if on is true, the method returns 
                     the fan speed, color, and radius 
                     in one combined string. */
            return "The fan speed is " + speedString + ", it's color is " + color + ", and it's radius is " + radius; }
 
        else { /* If on is false, the method returns 
                  the fan color and radius along with 
                  the string “fan is off” in one combined string */
            return "The fan color is " + color + ", it's radius is " + radius + ". The fan is off";
        } // close the method block

    } // close the class block






    
    public static void main(String[] args) { // open the main method block

        // Write a test program that creates two Fan objects.

        // Create the first fan object
        /* Assign maximum speed, radius 10, color yellow, 
           and turn it on to the first object. */
        Main fan1 = new Main();
        fan1.setSpeed(3); // fan1 object is fast
        fan1.setRadius(10); // fan1 object has a radius of 10
        fan1.setColor("yellow"); // fan1 object is yellow
        fan1.setOn(true); // fan1 object is on

        // Create the second fan object
        /* Assign medium speed, radius 5, color blue, 
           and turn it off to the second object. */
        Main fan2 = new Main();
        fan2.setSpeed(2); // fan2 object is medium
        fan2.setRadius(5); // fan2 object has a radius of 5
        fan2.setColor("blue"); // fan2 object is blue
        fan2.setOn(false); // fan2 object is off

        
        // Display the objects by invoking their toString method.   
        System.out.println("Fan 1 status :");
        // we can explicity invoke the toString method by using the object name in a print statement
        System.out.println(fan1.toString()); // invoke fan1's toString method

        System.out.println("\n\nFan 2 status :");
        // we can explicity invoke the toString method by using the object name in a print statement
        System.out.println(fan2.toString()); // invoke fan2's toString method

    } // close the main method block
    
} // close the class block