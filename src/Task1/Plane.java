package Task1;

public class Plane extends Vehicle {

    private int height;

    public Plane() {
        super();
        this.setHeight();
        super.setAmountPassengers();
    }

    @Override
    public void printType() {
        System.out.println("This is plane");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setHeight() {

        String height;

        System.out.println("Input height of plane: ");
        height = super.scannerObjRef.nextLine();

        if (super.tryToParseInt(height)) {
            this.setHeight(Integer.parseInt(height));
        }
    }


}
