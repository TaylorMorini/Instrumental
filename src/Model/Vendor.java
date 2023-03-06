package Model;

import java.util.ArrayList;

public class Vendor {
    private String vendorName;
    private String vendorPassword;
    private String vendorAddress;
    private double vendorScore;

    /**
     * This is the default constructor for the Model.Vendor class.
     *
     */

    public Vendor()
    {

    }

    /**
     * returns vendor name
     * @return vendor name string
     */
    public String getVendorName()
    {
        return this.vendorName;

    }

    /**
     * sets vendor name
     * @param name sets vendor name string
     */
    public void setVendorName(String name)
    {
        this.vendorName = name;

    }

    /**
     * returns vendor password
     * @return vendor password string
     */
    public String getVendorPassword()
    {
        return this.vendorPassword;

    }

    /**
     * sets vendor password
     * @param password sets vendor password string
     */

    public void setVendorPassword(String password)
    {
        this.vendorPassword = password;

    }

    /**
     * returns vendor address for returns
     * @return vendor address string
     */
    public String getVendorAddress()
    {
        return this.vendorAddress;

    }

    /**
     * sets vendor address
     * @param address sets vendor address string
     */

    public void setVendorAddress(String address)
    {
        this.vendorAddress = address;

    }

    /**
     * returns vendor score for review purposes
     * @return venor score number
     */
    public double getVendorScore()
    {
        return this.vendorScore;

    }

    /**
     * sets vendor score for changing reviews
     * @param score sets vendor score
     */
    public void setVendorScore(double score)
    {
        this.vendorScore = score;

    }

    public void calculateScore(double score)
    {

    }


}
