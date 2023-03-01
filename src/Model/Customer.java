package Model;

/**
 *
 */
public class Customer {
    private String customerAddress;

    private String customerName;

    private String customerPassword;


    /**
     * This is the constructor for the customer profile class
     *
     */

    public Customer()
    {

    }

    /**
     * returns customer address
     * @return customer address string
     */

    public String getCustomerAddress()
    {
        return this.customerAddress;

    }

    /**
     * sets customer address
     * @param address sets customer address string
     */

    public void setCustomerAddress(String address)
    {
        this.customerAddress = address;

    }

    /**
     * returns customer name
     * @return customer name string
     */
    public String getCustomerName()
    {
        return this.customerName;
    }

    /**
     * sets customer name string
     * @param name sets customer name string
     */
    public void setCustomerName(String name)
    {
        this.customerName = name;

    }

    /**
     * returns customer password for checking security reasons
     * @return customer password string
     */
    public String getCustomerPassword()
    {
        return this.customerPassword;

    }

    /**
     * sets customer password
     * @param password sets customer password string
     */

    public void setCustomerPassword(String password)
    {
        this.customerPassword = password;

    }
}
