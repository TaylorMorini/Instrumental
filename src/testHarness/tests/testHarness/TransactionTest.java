package testHarness;

import Model.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransactionTest extends Transaction {

    @Test
    void getTestCustomerName() {
        Transaction order = new TransactionTest();
        setCustomerName("Angelina");

        Assertions.assertEquals("Angelina", getCustomerName());

    }

    @Test
    void setTestCustomerName()
    {
        Transaction order = new TransactionTest();
        setCustomerName("Angelina");

        Assertions.assertEquals("Angelina", getCustomerName());

    }

    @Test
    void setTestPrice() {
        Transaction order = new TransactionTest();
        setPrice(123.42);

        Assertions.assertEquals(123.42, getPrice());

    }

    @Test
    void getTestPrice() {
        Transaction order = new TransactionTest();
        setPrice(123.42);

        Assertions.assertEquals(123.42, getPrice());
    }



    @Test
    void setTestAddress() {
        Transaction order = new TransactionTest();
        setAddress("Pittsburgh");

        Assertions.assertEquals("Pittsburgh", getAddress());
    }

    @Test
    void getTestAddress() {
        Transaction order = new TransactionTest();
        setAddress("Pittsburgh");

        Assertions.assertEquals("Pittsburgh", getAddress());

    }
}
