package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class customerLog {
    public String fileLogName;
    private final List<customerRating> allRatings;

    public customerLog(String fileLogName, List<customerRating> allRatings) {
        this.fileLogName = fileLogName;
        fileLogName = "Reviews.txt";
        this.allRatings = new ArrayList<>();

        try (Scanner scan = new Scanner(new File(fileLogName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                customerRating rate = new customerRating(line, true);
                allRatings.add(rate);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem reading: " + fileLogName);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }



    //Adding competitions
    public void add(customerRating c) {
      allRatings.add(c);
    }

    }


