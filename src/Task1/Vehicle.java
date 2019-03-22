package Task1;

import java.time.Year;

abstract class Vehicle {

    private float latitude;
    private float longitude;
    private float price;
    private float speed;
    private int   yearOfIssue;


    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLatitude(String latitude) {
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

    public void setLongitude(String longitude) {
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

    public void setPrice(String price) {
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

    public void setSpeed(String speed) {
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
    public void setYearOfIssue(String yearOfIssue) {
        if (this.tryToParseInt(yearOfIssue)) {
            this.setSpeed(Integer.parseInt(yearOfIssue));
        }

    }

    private boolean tryToParseFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e ) {
            System.out.println("Cannot convert typed string to float value");
            return false;
        }
    }

    private boolean tryToParseInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e ) {
            System.out.println("Cannot convert typed string to integer value");
            return false;
        }
    }

}
