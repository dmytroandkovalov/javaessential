package Task1;

public class Ship extends Vehicle {

    private String portName;

    public Ship() {
        super();
        super.setAmountPassengers();
        this.setPortName();
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public void setPortName() {

        String portName;

        System.out.println("Input home ship's port: ");
        portName = super.scannerObjRef.nextLine();

        this.setPortName(portName);
    }

}
