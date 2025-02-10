/*
 * Colton Kohler
 * 2/9/2025
 * M7 Assignment
 * Purpose: This program defines a Fan class that allows users to control a fan’s speed, power state, size, and color.
 *          Additionally, it introduces the UseFans class, which manages a collection of Fan instances and provides
 *          methods to display fan details without using the toString() method.
 */

import java.util.ArrayList;
import java.util.List;

public class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int fanSpeed;
    private boolean isRunning;
    private double size;
    private String fanColor;

    /**
     * No-argument constructor - Initializes fan with default values.
     */
    public Fan() {
        this.fanSpeed = STOPPED;
        this.isRunning = false;
        this.size = 6;
        this.fanColor = "white";
    }

    /**
     * Constructor that allows custom fan settings.
     * @param speed The starting speed.
     * @param isOn Whether the fan is on or off.
     * @param radius The fan’s size.
     * @param color The fan’s color.
     */
    public Fan(int speed, boolean isOn, double radius, String color) {
        this.fanSpeed = speed;
        this.isRunning = isOn;
        this.size = radius;
        this.fanColor = color;
    }

    // Getter and Setter Methods

    public int getFanSpeed() {
        return this.fanSpeed;
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;
    }

    public boolean isFanOn() {
        return this.isRunning;
    }

    public void turnFanOn(boolean isOn) {
        this.isRunning = isOn;
    }

    public double getFanSize() {
        return this.size;
    }

    public void setFanSize(double radius) {
        this.size = radius;
    }

    public String getFanColor() {
        return this.fanColor;
    }

    public void setFanColor(String color) {
        this.fanColor = color;
    }

    /**
     * Returns a string that describes the fan’s current state.
     * @return Fan description.
     */
    @Override
    public String toString() {
        return this.isRunning
                ? "Fan is ON at speed " + this.fanSpeed + " | Size: " + this.size + " | Color: " + this.fanColor
                : "Fan is OFF | Size: " + this.size + " | Color: " + this.fanColor;
    }

    /**
     * Main method to test the Fan class.
     */
    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan myFan = new Fan();

        // Create a custom fan with specific settings
        Fan fancyFan = new Fan(FAST, true, 12.5, "red");

        // Display both fans before making changes
        System.out.println("Default Fan: " + myFan);
        System.out.println("Fancy Fan: " + fancyFan);

        // Modify the default fan and turn it on
        myFan.turnFanOn(true);
        myFan.setFanSpeed(MEDIUM);
        myFan.setFanSize(9);
        myFan.setFanColor("black");

        // Show updated fan state
        System.out.println("Updated Default Fan: " + myFan);

        // Test UseFans class
        UseFans fanCollection = new UseFans();
        fanCollection.runFanTest();
    }
}

/**
 * UseFans class - Manages a collection of Fan objects and provides display methods.
 */
class UseFans {
    private final List<Fan> fanList;

    /**
     * Constructor initializes an empty fan collection.
     */
    public UseFans() {
        this.fanList = new ArrayList<>();
    }

    /**
     * Adds a Fan instance to the collection.
     * @param newFan The Fan instance to add.
     */
    public void addFan(Fan newFan) {
        this.fanList.add(newFan);
    }

    /**
     * Displays all fans in the collection without using toString().
     */
    public void showAllFans() {
        System.out.println("Displaying all fans:");
        for (Fan singleFan : this.fanList) {
            showFan(singleFan);
        }
    }

    /**
     * Displays a single Fan's details without using toString().
     * @param singleFan The Fan instance to display.
     */
    public void showFan(Fan singleFan) {
        System.out.println("Fan Details:");
        System.out.println("  Speed: " + singleFan.getFanSpeed());
        System.out.println("  Running: " + (singleFan.isFanOn() ? "Yes" : "No"));
        System.out.println("  Size: " + singleFan.getFanSize());
        System.out.println("  Color: " + singleFan.getFanColor());
        System.out.println();
    }

    /**
     * Test method to create a collection of fans and demonstrate functionality.
     */
    public void runFanTest() {
        Fan firstFan = new Fan(Fan.FAST, true, 7.5, "teal");
        Fan secondFan = new Fan(Fan.STOPPED, false, 11, "yellow");
        Fan thirdFan = new Fan(Fan.MEDIUM, true, 13.5, "violet");

        // Add fans to collection
        this.addFan(firstFan);
        this.addFan(secondFan);
        this.addFan(thirdFan);

        // Display all fans
        this.showAllFans();
    }
}
