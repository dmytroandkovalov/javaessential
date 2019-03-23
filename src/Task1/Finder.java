package Task1;
import java.time.Year;
import java.util.Random;

class Finder {

    private Vehicle[] vehicleArr;

    protected Finder() {
        this.vehicleArr = null;
    }

    protected void generateVehicleArray(int amountRandomVehilce) {
        if (amountRandomVehilce > 0) {
            vehicleArr = this.generateVehicleTypeArray(amountRandomVehilce);
        }
    }

    private Vehicle[] generateVehicleTypeArray (int amountRandomVehilce) {

        Vehicle arr[] = new Vehicle[amountRandomVehilce];
        Random random = new Random();

        int randomType;
        float randomLatitude;
        float randomLongtitude;
        float randomPrice;
        float randomSpeed ;
        int randomYearOfIssue;
        int randomAmountPassengers;
        float randomHeight;

        int currentYear = Year.now().getValue();

        for (int i = 0; i < amountRandomVehilce; i++) {
            randomType        = this.getRandomNumber(1, 3, random);
            randomLatitude    = this.getRandomNumber(1f, 180f, random);
            randomLongtitude  = this.getRandomNumber(1f, 180f, random);
            randomPrice       = this.getRandomNumber(1f, 6_000_000_000f, random);
            randomYearOfIssue = this.getRandomNumber(1950, currentYear, random);

            if (randomType == 1) {
                randomSpeed            = this.getRandomNumber(1, 950, random);
                randomHeight           = this.getRandomNumber(1f, 60f , random);
                randomAmountPassengers = this.getRandomNumber(1, 1000 , random);
                arr[i]                 = new Plane(randomLatitude, randomLongtitude, randomPrice, randomSpeed , randomYearOfIssue, randomHeight,randomAmountPassengers );

            } else if (randomType == 2) {
                randomSpeed  = this.getRandomNumber(1, 500, random);
                arr[i]       = new Car(randomLatitude, randomLongtitude, randomPrice, randomSpeed , randomYearOfIssue);

            } else if (randomType == 3) {
                randomSpeed            = this.getRandomNumber(1, 950, random);
                randomAmountPassengers = this.getRandomNumber(1, 1000 , random);
                arr[i]                 = new Ship(randomLatitude, randomLongtitude, randomPrice, randomSpeed , randomYearOfIssue, randomAmountPassengers, "port" + i );

            }
        }

        return arr;
    }

    private int getRandomNumber( int min, int max, Random random) {
        return random.nextInt((max - min) + 1) + min;
    }

    private float getRandomNumber( float min, float max, Random random) {
        return random.nextFloat() * (max - min) + min;
    }

    protected void printGeneratedVehicleArray() {

        for (Vehicle vehicle: this.getVehicleArr()) {
            vehicle.printOptions();
        }
    }

    public Vehicle[] getVehicleArr() {
        return vehicleArr;
    }

    public void setVehicleArr(Vehicle[] vehicleArr) {
        this.vehicleArr = vehicleArr;
    }

    public void findVehicleWithMaxPrice() {


        if (this.vehicleArr != null) {

            float maxPrice = 0;
            float currentPrice;
            Vehicle vehicleWithMaxPrice = null;
            Vehicle currentVehiсle;

            for (int i = 0; i < this.vehicleArr.length; i++) {

                currentVehiсle = this.vehicleArr[i];
                currentPrice   = currentVehiсle.getPrice();

                if (currentPrice > maxPrice) {
                    maxPrice            = currentPrice;
                    vehicleWithMaxPrice = currentVehiсle;
                }
            }

            if (vehicleWithMaxPrice != null) {
                System.out.println("\n\nVehicle with max price\n ");
                vehicleWithMaxPrice.printOptions();
            }

        }

    }
}
