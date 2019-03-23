package Task1;

import java.time.Year;
import java.util.Scanner;

abstract class Vehicle {

    private float latitude;
    private float longitude;
    private float price;
    private float speed;
    private int   yearOfIssue;
    private int amountPassengers;
    Scanner scannerObjRef;

    public Vehicle() {
        this.printType();
        this.scannerObjRef = new Scanner(System.in);
        this.setLatitude();
        this.setLongitude();
        this.setPrice();
        this.setSpeed();
        this.setYearOfIssue();
    }

    public Vehicle( float latitude, float longitude, float price, float speed, int yearOfIssue) {
        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setPrice(price);
        this.setSpeed(speed);
        this.setYearOfIssue(yearOfIssue);
    }

    public void printCoordinates() {

        float latitude   = this.getLatitude();
        float longitude  = this.getLongitude();

        if (latitude > 0f && longitude > 0f) {
            System.out.println("Latitude: "  + latitude);
            System.out.println("Longtiude: " + longitude);
        }
    }

    public void printOptions() {

        this.printType();
        this.printCoordinates();
        float price     = this.getPrice();
        float speed     = this.getSpeed();
        int yearOfIssue = this.getYearOfIssue();

        if (price > 0f) {
            System.out.println("Price: " + latitude);
        }
        if (speed > 0f) {
            System.out.println("Speed: " + speed);
        }

        if (yearOfIssue > 0) {
            System.out.println("Year of issue: " + yearOfIssue);
        }
    }

    public void printType() {
        System.out.println("\n\nThis is vehicle");
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLatitude() {

        String latitude;

        System.out.println("Input latitude: ");
        latitude = scannerObjRef.nextLine();

        if (this.tryToParseFloat(latitude)) {
            this.setLatitude(Float.parseFloat(latitude));
        }
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLongitude() {

        String longitude;

        System.out.println("Input longitude: ");
        longitude = scannerObjRef.nextLine();


        if (this.tryToParseFloat(longitude)) {
            this.setLongitude(Float.parseFloat(longitude));
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be larger than zero.");
        }

    }

    public void setPrice() {

        String price;

        System.out.println("Input price: ");
        price = scannerObjRef.nextLine();

        if (this.tryToParseFloat(price)) {
            this.setPrice(Float.parseFloat(price));
        }
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setSpeed() {

        String speed;

        System.out.println("Input speed: ");
        speed = scannerObjRef.nextLine();

        if (this.tryToParseFloat(speed)) {
            this.setSpeed(Float.parseFloat(speed));
        }
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue > 0 && yearOfIssue < Year.now().getValue()) {
            this.yearOfIssue = yearOfIssue;
        }

    }

    public void setYearOfIssue() {

        String yearOfIssue;

        System.out.println("Input yearOfIssue: ");
        yearOfIssue = scannerObjRef.nextLine();

        if (this.tryToParseInt(yearOfIssue)) {
            this.setSpeed(Integer.parseInt(yearOfIssue));
        }

    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        if (amountPassengers > 0) {
            this.amountPassengers = amountPassengers;
        }
    }

    public void setAmountPassengers() {

        String amountPassengers;

        System.out.println("Input amount of passengers: ");
        amountPassengers = scannerObjRef.nextLine();

        if (this.tryToParseInt(amountPassengers)) {
            this.setAmountPassengers(Integer.parseInt(amountPassengers));
        }
    }

    protected boolean tryToParseFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e ) {
            System.out.println("Cannot convert typed string to float value");
            return false;
        }
    }

    protected boolean tryToParseInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e ) {
            System.out.println("Cannot convert typed string to integer value");
            return false;
        }
    }

}
