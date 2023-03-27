/* 

 * Class: CMSC203  30376

 * Instructor: Dr. Grinberg

 * Description: The ManagementCompany class represents a real estate management company that manages multiple properties. It is responsible for storing, organizing, and managing information about properties and the company itself, including the company's name, Tax ID, management fee, and plot of land.
 * Due: 04/03/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here:Kyle Newby

*/ 

public class ManagementCompany {
	// Instance variables
    private String name;
    private String TaxID;
    private double managementFee;
    private Plot plot;
    private Property[] properties;
    private int numberOfProperties;
    
    // Constants
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    // Default constructor
    public ManagementCompany() {
        this("Not defined", "Not defined", 0);
    }    
    // Constructor with name, TaxID, and management fee
    public ManagementCompany(String name, String TaxID, double managementFee) {
        this(name, TaxID, managementFee, 0, 0, MGMT_WIDTH, MGMT_DEPTH);
    }   
    // Constructor with all fields
    public ManagementCompany(String name, String TaxID, double managementFee, int x, int y, int width, int depth) {
        this.name = name;
        this.TaxID = TaxID;
        this.managementFee = managementFee;
        this.plot = new Plot(x, y, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
    }
    // Copy constructor
    public ManagementCompany(ManagementCompany otherCompany) {
        this(otherCompany.name, otherCompany.getTaxID(), otherCompany.managementFee,
             otherCompany.plot.getX(), otherCompany.plot.getY(),
             otherCompany.plot.getWidth(), otherCompany.plot.getDepth());
        this.numberOfProperties = otherCompany.numberOfProperties;
        for (int i = 0; i < numberOfProperties; i++) {
            this.properties[i] = new Property(otherCompany.properties[i]);
        }
    }
    // Add property methods
    // Add a property object
    public int addProperty(Property property) {
        if (numberOfProperties >= MAX_PROPERTY) {
            return -1;
        }
        if (property == null) {
            return -2;
        }
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }
        properties[numberOfProperties] = property;
        numberOfProperties++;
        return numberOfProperties - 1;
    }
    // Add a property using property details
    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(new Property(name, city, rent, owner));
    }
    // Add a property using property details and plot information
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }
    // Other methods
    // Remove the last property
    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;          
            numberOfProperties--;
        }
    }
    // Check if properties array is full
    public boolean isPropertiesFull() {
        return numberOfProperties == MAX_PROPERTY;
    }
    // Get the number of properties  
    public int getPropertiesCount() {
        return numberOfProperties;
    }   
    // Get the total rent
    public double getTotalRent() {
        double totalRent = 0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }
    // Get the property with the highest rent
    public Property getHighestRentProperty() {
        Property highestRentProperty = null;
        double highestRent = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRent) {
                highestRent = properties[i].getRentAmount();
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }
    // Check if management fee is valid
    public boolean isManagementFeeValid() {
        return managementFee >= 0 && managementFee <= 100;
    }
    // Getter methods
    public String getName() {
        return name;
    }

    public String getTaxID() {
        return TaxID;
    }
    
    public Property[] getProperties() {
        Property[] propertiesCopy = new Property[numberOfProperties];
        System.arraycopy(properties, 0, propertiesCopy, 0, numberOfProperties);
        return propertiesCopy;
    }
    
    public double getMgmFeePer() {
        return managementFee;
    }

    public Plot getPlot() {
        return plot;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for " + name + ", TaxID: " + TaxID + "\n");
        sb.append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++) {
            sb.append(properties[i].toString() + "\n");
        }
        sb.append("______________________________________________________\n");
        sb.append("total management Fee: " + getTotalRent() * managementFee / 100);
        return sb.toString();
    }
    
}
      
   