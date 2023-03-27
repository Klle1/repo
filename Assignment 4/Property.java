/* 

 * Class: CMSC203  30376

 * Instructor: Dr. Grinberg

 * Description: The Property class represents a real estate property with various attributes such as property name, city, rent amount, owner, and an associated plot of land. It provides an organized way to store and manage information about a property, making it easier to use in the context of managing multiple properties, as seen in the ManagementCompany class.
 * Due: 04/03/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here:Kyle Newby

*/ 


public class Property {
    // Instance variables
    private String propertyName;
    private String city;
    private double RentAmount;
    private String owner;
    private Plot plot;

    // Default constructor, sets default values
    public Property() {
        this.propertyName = "";
        this.city = "";
        this.RentAmount = 0;
        this.owner = "";
        this.plot = new Plot();
    }

    // Constructor with specified property name, city, rent amount, and owner
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.RentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    // Constructor with specified property name, city, rent amount, owner, and plot coordinates
    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.RentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    // Copy constructor, creates a new property with the same properties as the given property
    public Property(Property p) {
        this.propertyName = p.propertyName;
        this.city = p.city;
        this.RentAmount = p.RentAmount;
        this.owner = p.owner;
        this.plot = new Plot(p.plot);
    }

    // Getter methods for instance variables
    public Plot getPlot() {
        return plot;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public double getRentAmount() {
        return RentAmount;
    }

    public String getOwner() {
        return owner;
    }

    // Return a string representation of the property
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + RentAmount;
    }
}


