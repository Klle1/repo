/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

* Description: Order: Class representing an order object with instance variables for order number, time, day, customer, and a list of beverages. Implements interfaces for order operations and comparison.

 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderNo;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNo = generateOrder();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = customer;
        this.beverages = new ArrayList<>();
    }

    private int generateOrder() {
        Random rand = new Random();
        return rand.nextInt(90000 - 10000) + 10000;
    }

    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }

    public void addNewBeverage(String bevName, Size size) {
        beverages.add(new Alcohol(bevName, size, isWeekend()));
    }

    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
    }

    @Override
    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    @Override
    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
    }
    
    public int getTotalItems() {
        return beverages.size();
    }

    @Override
    public double calcOrderTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int compareTo(Order anotherOrder) {
        return Integer.compare(this.orderNo, anotherOrder.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }
    public ArrayList<Beverage> getBeverageList() {
        return this.getBeverageList();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{orderNo=").append(orderNo).append(", orderTime=").append(orderTime)
                .append(", orderDay=").append(orderDay).append(", customer=").append(customer)
                .append(", beverages=[");
        for (Beverage beverage : beverages) {
            sb.append("\n  ").append(beverage);
        }
        sb.append("]}");
        return sb.toString();
    }
}




