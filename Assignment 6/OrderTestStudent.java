import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTestStudent {
    @Test
    public void testAddNewBeverageAndCalcOrderTotal() {
        Order order = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        order.addNewBeverage("Espresso", Size.SMALL, false, false);
        order.addNewBeverage("Wine", Size.SMALL);
        order.addNewBeverage("Banana Smoothie", Size.MEDIUM, 3, true);

        assertEquals(3, order.getTotalItems());
        assertEquals(10.0, order.calcOrderTotal(), 0.001);
    }

    @Test
    public void testIsWeekend() {
        Order weekdayOrder = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        assertFalse(weekdayOrder.isWeekend());

        Order weekendOrder = new Order(14, Day.SATURDAY, new Customer("John Doe", 25));
        assertTrue(weekendOrder.isWeekend());
    }

    @Test
    public void testFindNumOfBeveType() {
        Order order = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        order.addNewBeverage("Espresso", Size.SMALL, false, false);
        order.addNewBeverage("Wine", Size.SMALL);
        order.addNewBeverage("Banana Smoothie", Size.MEDIUM, 3, true);

        assertEquals(1, order.findNumOfBeveType(Type.COFFEE));
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
    }

    @Test
    public void testGetBeverage() {
        Order order = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        order.addNewBeverage("Espresso", Size.SMALL, false, false);
        order.addNewBeverage("Wine", Size.SMALL);
        order.addNewBeverage("Banana Smoothie", Size.MEDIUM, 3, true);

        assertEquals("Espresso", order.getBeverage(0).getBevName());
        assertEquals("Wine", order.getBeverage(1).getBevName());
        assertEquals("Banana Smoothie", order.getBeverage(2).getBevName());
    }

    @Test
    public void testGetCustomer() {
        Order order = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        assertEquals("John Doe", order.getCustomer().getName());
        assertEquals(25, order.getCustomer().getAge());
    }

    @Test
    public void testOrderDayAndTime() {
        Order order = new Order(14, Day.MONDAY, new Customer("John Doe", 25));
        assertEquals(14, order.getOrderTime());
        assertEquals(Day.MONDAY, order.getOrderDay());
    }
}
