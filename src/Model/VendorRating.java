package Model;

import java.util.Date;
import java.io.*;
import java.sql.*;

public class VendorRating {
 
    private Vendor vendorA;
    private double numberRating;
    private Date reviewDate;
    public double averagedReview;

   
    public Date getReviewDate() {
        return reviewDate;
    }
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
    public double getNumberRating() {
        return numberRating;
    }
    public void setNumberRating(double numberRating) {
        this.numberRating = numberRating;
    }
   

    public double getAveragedReview() {
        return numberRating;
    }
    public void setAveragedReview(double averagedReview) {
        this.averagedReview = averagedReview;
    }

    public VendorRating(Vendor vendorA) {
        super();
        this.vendorA = vendorA;
    }


    public double average()
    {
        double i = 0;

        return i;
    }
}
