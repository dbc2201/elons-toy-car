public class ElonsToyCar {

    private final int INITIAL_BATTERY_PERCENTAGE = 100;
    private final int DISTANCE_COVERED_IN_ONE_GO = 20;
    private final int BATTERY_PERCENTAGE_DRAINED_IN_ONE_GO = 1;

    private int currentBatteryPercentage;
    private int totalDistanceDriven;

    public ElonsToyCar() {
        this.currentBatteryPercentage = INITIAL_BATTERY_PERCENTAGE;
        this.totalDistanceDriven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.totalDistanceDriven);
    }

    public String batteryDisplay() {
        return String.format("Battery at %d%%", this.currentBatteryPercentage);
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }
}
