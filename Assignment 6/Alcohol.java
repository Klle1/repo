/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

 * Description: Alcohol: Subclass of Beverage representing alcoholic drinks with additional instance variable for whether it is offered on the weekend, and methods to calculate price and represent as a string.

 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
public class Alcohol extends Beverage {
    private boolean isWeekend;
    private final double WEEKEND_COST = 0.6;

    public Alcohol(String bevName, Size size, boolean isWeekend) {
        super(bevName, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }

    @Override
    public double calcPrice() {
        double price = super.addSizePrice();
        if (isWeekend) {
            price += WEEKEND_COST;
        }
        return price;
    }

    @Override
    public String toString() {
        String weekend = isWeekend ? "weekend, " : "";
        return getBevName() + ", " + getType() + ", " + getSize() + ", " + weekend + "Price: $" + calcPrice();
    }


    @Override
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) {
            return false;
        }
        if (!(anotherBev instanceof Alcohol)) {
            return false;
        }
        Alcohol other = (Alcohol) anotherBev;
        return isWeekend == other.isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}














