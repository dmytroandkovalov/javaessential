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

        Float f = Float.valueOf(latitude);

        if (this.validateVehicleFloat(f)) {
            this.setLatitude(f.floatValue());
        }
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue > 0 && yearOfIssue < Year.now().getValue()) {
            this.yearOfIssue = yearOfIssue;
        }

    }

    private boolean validateVehicleFloat(Float obj) {
        return obj.isNaN() && obj.isInfinite() ? false : true;
    }

}
