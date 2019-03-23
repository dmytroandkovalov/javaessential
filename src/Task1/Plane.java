package Task1;

public class Plane extends Vehicle {

    private float height;

    public Plane() {
        this.setHeight();
        super.setAmountPassengers();
    }

    public Plane(float latitude, float longitude, float price, float speed, int yearOfIssue, float height, int amountOfPassengers) {
        super(latitude, longitude, price, speed, yearOfIssue);
        this.setHeight(height);
        super.setAmountPassengers(amountOfPassengers);

    }

    @Override
    public void printType() {
        System.out.println("This is plane");
    }


    @Override
    public void printCoordinates() {
        super.printCoordinates();
    }

    @Override
    public void printOptions() {
        super.printOptions();
    }

    @Override
    public float getLatitude() {
        return super.getLatitude();
    }

    @Override
    public void setLatitude(float latitude) {
        super.setLatitude(latitude);
    }

    @Override
    public void setLatitude() {
        super.setLatitude();
    }

    @Override
    public float getLongitude() {
        return super.getLongitude();
    }

    @Override
    public void setLongitude(float longitude) {
        super.setLongitude(longitude);
    }

    @Override
    public void setLongitude() {
        super.setLongitude();
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }

    @Override
    public void setPrice() {
        super.setPrice();
    }

    @Override
    public float getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(float speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setSpeed() {
        super.setSpeed();
    }

    @Override
    public int getYearOfIssue() {
        return super.getYearOfIssue();
    }

    @Override
    public void setYearOfIssue(int yearOfIssue) {
        super.setYearOfIssue(yearOfIssue);
    }

    @Override
    public void setYearOfIssue() {
        super.setYearOfIssue();
    }

    @Override
    public int getAmountPassengers() {
        return super.getAmountPassengers();
    }

    @Override
    public void setAmountPassengers(int amountPassengers) {
        super.setAmountPassengers(amountPassengers);
    }

    @Override
    public void setAmountPassengers() {
        super.setAmountPassengers();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0f) {
            this.height = height;
        }
    }

    public void setHeight() {

        String height;

        System.out.println("Input height of plane: ");
        height = super.scannerObjRef.nextLine();

        if (super.tryToParseFloat(height)) {
            this.setHeight(Float.parseFloat(height));
        }
    }


}
