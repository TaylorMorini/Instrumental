package testHarness;

import Model.Vendor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VendorTest extends Vendor {

    @Test
    void getTestVendorName() {
        Vendor vendor = new Vendor();
        setVendorName("Angelina");

        Assertions.assertEquals("Angelina", getVendorName());
    }

    @Test
    void setTestVendorName() {
        Vendor vendor = new Vendor();
        setVendorName("Angelina");

        Assertions.assertEquals("Angelina", getVendorName());
    }

    @Test
    void getTestVendorPassword() {
        Vendor vendor = new Vendor();
        setVendorPassword("123456verysecure");

        Assertions.assertEquals("123456verysecure", getVendorPassword());
    }

    @Test
    void setTestVendorPassword() {
        Vendor vendor = new Vendor();
        setVendorPassword("123456verysecure");

        Assertions.assertEquals("123456verysecure", getVendorPassword());
    }

    @Test
    void getTestVendorAddress() {
        Vendor vendor = new Vendor();
        setVendorAddress("Pittsburgh");

        Assertions.assertEquals("Pittsburgh", getVendorAddress());
    }

    @Test
    void setTestVendorAddress() {
        Vendor vendor = new Vendor();
        setVendorAddress("Pittsburgh");

        Assertions.assertEquals("Pittsburgh", getVendorAddress());
    }

    @Test
    void getTestVendorScore() {
        Vendor vendor = new Vendor();
        setVendorScore(24);

        Assertions.assertEquals(24, getVendorScore());
    }

    @Test
    void setTestVendorScore() {
        Vendor vendor = new Vendor();
        setVendorScore(24);

        Assertions.assertEquals(24, getVendorScore());
    }
}
