
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BevShopTestStudent {

    @Test
    public void testIsValidTime() {
        BevShop bevShop = new BevShop();
        assertTrue(bevShop.isValidTime(8));
        assertFalse(bevShop.isValidTime(24));
    }

    @Test
    public void testIsMaxFruit() {
        BevShop bevShop = new BevShop();
        assertFalse(bevShop.isMaxFruit(5));
        assertTrue(bevShop.isMaxFruit(6));
    }

    @Test
    public void testIsEligibleForMore() {
        BevShop bevShop = new BevShop();
        assertTrue(bevShop.isEligibleForMore());
        bevShop.startNewOrder(9, Day.MONDAY, "John Doe", 25);
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        assertTrue(bevShop.isEligibleForMore());
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        assertFalse(bevShop.isEligibleForMore());
    }

    @Test
    public void testIsValidAge() {
        BevShop bevShop = new BevShop();
        assertFalse(bevShop.isValidAge(20));
        assertTrue(bevShop.isValidAge(21));
    }

    @Test
    public void testTotalMonthlySale() {
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(9, Day.MONDAY, "John Doe", 25);
        bevShop.processCoffeeOrder("Espresso", Size.SMALL, false, false);
        bevShop.startNewOrder(10, Day.TUESDAY, "Jane Doe", 30);
        bevShop.processSmoothieOrder("Banana Smoothie", Size.MEDIUM, 3, true);
        assertEquals(8.0, bevShop.totalMonthlySale(), 0.001);
    }


    @Test
    public void testTotalNumOfMonthlyOrders() {
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(9, Day.MONDAY, "John Doe", 25);
        bevShop.startNewOrder(10, Day.TUESDAY, "Jane Doe", 30);
        assertEquals(2, bevShop.totalNumOfMonthlyOrders());
    }
}


