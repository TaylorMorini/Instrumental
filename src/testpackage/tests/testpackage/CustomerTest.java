package testpackage;

import Model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CustomerTest extends Customer{

    @Test
    void getTestCustomerAddress() {
    Customer test = new Customer();
    setCustomerAddress("Happy Valley");

    Assertions.assertEquals("Happy Valley", getCustomerAddress());

    }

    @Test
    void setTestCustomerAddress() {
        Customer test = new Customer();

        setCustomerAddress("Happy Valley Set");

        Assertions.assertEquals("Happy Valley Set", getCustomerAddress());
    }

    @Test
    void getTestCustomerName() {
        Customer test = new Customer();
        setCustomerName("Angelina");

        Assertions.assertEquals("Angelina", getCustomerName());
    }

    @Test
    void setTestCustomerName() {
        Customer test = new Customer();
        setCustomerName("Angelina");

        Assertions.assertEquals("Angelina", getCustomerName());

    }

    @Test
    void getTestCustomerPassword() {
        Customer test = new Customer();
        setCustomerPassword("123456verysecure");

        Assertions.assertEquals("123456verysecure", getCustomerPassword());
    }

    @Test
    void setTestCustomerPassword() {
        Customer test = new Customer();
        setCustomerPassword("123456verysecure");

        Assertions.assertEquals("123456verysecure", getCustomerPassword());
    }
}
