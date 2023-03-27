/* 

 * Class: CMSC203  30376

 * Instructor: Dr. Grinberg

 * Description: Plot class is used to store and manage the plot information for each property. This class provides functionality to check if a plot overlaps with another plot or if a plot encompasses another plot, as well as getter and setter methods for the plot's position and dimensions. 

 * Due: 04/03/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here:Kyle Newby

*/ 

public class Plot {
    // Instance variables
    private int x;
    private int y;
    private int width;
    private int depth;

    // Default constructor, sets default values
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    // Constructor with specified coordinates, width, and depth
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Copy constructor, creates a new plot with the same properties as the given plot
    public Plot(Plot p) {
        this.x = p.x;
        this.y = p.y;
        this.width = p.width;
        this.depth = p.depth;
    }

    // Method to check if the current plot overlaps with another plot
    public boolean overlaps(Plot p) {
        return (x < p.x + p.width) && (x + width > p.x) && (y < p.y + p.depth) && (y + depth > p.y);
    }

    // Method to check if the current plot encompasses another plot
    public boolean encompasses(Plot p) {
        return (x <= p.x) && (y <= p.y) && (x + width >= p.x + p.width) && (y + depth >= p.y + p.depth);
    }

    // Getter and setter methods for instance variables
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    // Return a string representation of the plot
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}

