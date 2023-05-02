/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

* Description: BevShopDriverApp: Driver class with a main method to demonstrate the functionality of the classes.
 * Due: 05/01/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby 

*/ 
public class BevShopDriverApp {

    public static void main(String[] args) {
        BevShop bevShop = new BevShop();

        System.out.println(BevShopInterface.MAX_ORDER_FOR_ALCOHOL);
        System.out.println(BevShopInterface.MIN_AGE_FOR_ALCOHOL);

        System.out.println("Start a new order");
        bevShop.startNewOrder(10, Day.MONDAY, "John", 23);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println(bevShop.getCurrentOrder().getCustomer().getName());
        System.out.println(bevShop.getCurrentOrder().getCustomer().getAge());
        System.out.println(bevShop.isValidAge(23));

        System.out.println("Add alcohol drink");
        bevShop.processAlcoholOrder("Beer", Size.MEDIUM);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()) + " " + bevShop.isEligibleForMore());

        System.out.println("Add second alcohol drink");
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Add third alcohol drink");
        bevShop.processAlcoholOrder("Whiskey", Size.MEDIUM);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Maximum alcohol drink for this order");
        bevShop.processAlcoholOrder("Vodka", Size.LARGE);
        System.out.println("Add a COFFEE to order");
        bevShop.processCoffeeOrder("Cappuccino", Size.SMALL, true, true);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Start a new order");
        bevShop.startNewOrder(14, Day.WEDNESDAY, "Jane", 30);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Fruit Smoothie", Size.MEDIUM, 3, false);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Add a COFFEE to order");
        bevShop.processCoffeeOrder("Espresso", Size.SMALL, false, false);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Age not appropriate for alcohol drink!!");
        bevShop.startNewOrder(16, Day.FRIDAY, "Tom", 20);
        bevShop.processAlcoholOrder("Beer", Size.SMALL);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Maximum number of fruits");
        bevShop.processSmoothieOrder("Mixed Berry Smoothie", Size.LARGE, 5, true);
        System.out.println("Total on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Total amount for all orders: " + bevShop.totalMonthlySale());
    }
}


