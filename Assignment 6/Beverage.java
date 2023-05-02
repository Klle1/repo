/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

 * Description: Beverage: Abstract class representing a beverage object with instance variables for name, type, size, and constants for base and size prices. Contains abstract and concrete methods to calculate price, get name and ID, and compare equality between beverages.

 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
public abstract class Beverage {
    private String bevName;
    private Type type;
    private Size size;
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 1.0;

    public Beverage(String bevName, Type type, Size size) {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }

    public abstract double calcPrice();

    public double addSizePrice() {
        double newSizePrice = BASE_PRICE;
        if (size == Size.MEDIUM) {
            newSizePrice += SIZE_PRICE;
        } else if (size == Size.LARGE) {
            newSizePrice += (2 * SIZE_PRICE);
        }
        return newSizePrice;
    }

    @Override
    public String toString() {
        return bevName + ", " + size;
    }

    @Override
    public boolean equals(Object anotherBev) {
        if (anotherBev == this) {
            return true;
        }
        if (!(anotherBev instanceof Beverage)) {
            return false;
        }
        Beverage other = (Beverage) anotherBev;
        return bevName.equals(other.bevName) && type == other.type && size == other.size;
    }

    public String getBevName() {
        return bevName;
    }

    public void setBevName(String bevName) {
        this.bevName = bevName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getSizePrice() {
        return SIZE_PRICE;
    }
}







