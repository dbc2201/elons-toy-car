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
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    }

    public String distanceDisplay() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }
}
