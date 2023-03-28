package Model;

import java.util.Date;

public class VendorRating extends Vendor {
 
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
}
