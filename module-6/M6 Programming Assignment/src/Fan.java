/*
 * Colton Kohler
 * 2/2/2025
 * M5 Assignment
 *
 * Purpose: This program defines a Fan class that allows users to turn the fan on/off,
 *          change its speed, adjust the radius, and customize its color.
 */

public class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int fanSpeed;      // Holds the current speed (default: STOPPED)
    private boolean isRunning; // True if fan is ON, false if OFF
    private double size;       // Fan radius (default: 6)
    private String fanColor;   // Color of the fan (default: white)

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
        return fanSpeed;
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;
    }

    public boolean isFanOn() {
        return isRunning;
    }

    public void turnFanOn(boolean isOn) {
        this.isRunning = isOn;
    }

    public double getFanSize() {
        return size;
    }

    public void setFanSize(double radius) {
        this.size = radius;
    }

    public String getFanColor() {
        return fanColor;
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
        return isRunning
                ? "Fan is ON at speed " + fanSpeed + " | Size: " + size + " | Color: " + fanColor
                : "Fan is OFF | Size: " + size + " | Color: " + fanColor;
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
    }
}
