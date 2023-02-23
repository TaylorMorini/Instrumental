public class Transaction {
    private String customerName;

    private String customerAddress;

    private double totalPrice;

    /**
     * This is the default constructor for the transaction class.
     */


    public Transaction() {


    }


    /**
     * Returns the customer's name for shipment
     */
    public String getCustomerName() {

        return this.customerName;


    }

    /**
     * Sets the price for the instrument for the transaction
     */
    public void setPrice(double priceInstrument) {

        this.totalPrice = priceInstrument;


    }

    /**
     * Returns the price of the transaction
     */
    public double getPrice() {
        return this.totalPrice;

    }
    /**
     * Sets the address for the customer for shipment
     */
    public void setAddress(String address) {
        this.customerAddress = address;


    }
    /**
     * Returns the address for the customer for shipment
     */
    public String getAddress()
    {
        return this.customerAddress;

    }

}


