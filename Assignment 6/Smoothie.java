/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

* Description: Order: Smoothie: Subclass of Beverage representing smoothie drinks with additional instance variables for number of fruits and protein powder, and methods to calculate price and represent as a string.
 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;
    private final double FRUIT_COST = 0.5;
    private final double PROTEIN_COST = 1.5;

    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
        super(bevName, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double price = super.addSizePrice();
        price += numOfFruits * FRUIT_COST;
        if (addProtein) {
            price += PROTEIN_COST;
        }
        return price;
    }

    @Override
    public String toString() {
        String protein = addProtein ? "with protein, " : "";
        return getBevName() + ", " + getType() + ", " + getSize() + ", " + protein + numOfFruits + " fruits, Price: $" + calcPrice();
    }

    @Override
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) {
            return false;
        }
        if (!(anotherBev instanceof Smoothie)) {
            return false;
        }
        Smoothie other = (Smoothie) anotherBev;
        return numOfFruits == other.numOfFruits && addProtein == other.addProtein;
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }

    public boolean getAddProtein() {
        return addProtein;
    }

    public void setAddProtein(boolean addProtein) {
        this.addProtein = addProtein;
    }
}



