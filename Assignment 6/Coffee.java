/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

* Description: Coffee: Subclass of Beverage representing coffee drinks with additional instance variables for extra shot and extra syrup, and methods to calculate price and represent as a string.
 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double EXTRA_COST = 0.5;

    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        super(bevName, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double price = super.addSizePrice();
        if (extraShot) {
            price += EXTRA_COST;
        }
        if (extraSyrup) {
            price += EXTRA_COST;
        }
        return price;
    }

    @Override
    public String toString() {
        String extras = (extraShot ? "with extra shot, " : "") + (extraSyrup ? "with extra syrup, " : "");
        return getBevName() + ", " + getType() + ", " + getSize() + ", " + extras + "Price: $" + calcPrice();
    }


    @Override
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) {
            return false;
        }
        if (!(anotherBev instanceof Coffee)) {
            return false;
        }
        Coffee other = (Coffee) anotherBev;
        return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
    }

    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }
}




