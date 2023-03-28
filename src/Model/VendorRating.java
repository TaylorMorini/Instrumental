package Model;

import java.util.Date;

public class VendorRating {
    private String vendorName;
    private double numberRating;
    private Date reviewDate;
    public double averagedReview;

    public String getVendorName() {
        return vendorName;
    }
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
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getAveragedReview() {
        return numberRating;
    }
    public void setAveragedReview(double averagedReview) {
        this.averagedReview = averagedReview;
    }
}
