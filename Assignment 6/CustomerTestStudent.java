import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("John Doe", 25);
    }

    @Test
    public void testName() {
        assertEquals("John Doe", customer.getName());
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    public void testAge() {
        assertEquals(25, customer.getAge());
        customer.setAge(30);
        assertEquals(30, customer.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Customer{name='John Doe', age=25}", customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        Customer newCustomer = new Customer(customer);
        assertEquals(customer.getName(), newCustomer.getName());
        assertEquals(customer.getAge(), newCustomer.getAge());
    }
}
