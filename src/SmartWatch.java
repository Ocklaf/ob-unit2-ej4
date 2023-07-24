public class SmartWatch extends SmartDevice {

    boolean isHeartRateSensorSupported;

    public SmartWatch(){}

    public SmartWatch(boolean isWirelessChargingSupported, String displayInches, String batteryCapacity, boolean isHeartRateSensorSupported) {
        super(isWirelessChargingSupported, displayInches, batteryCapacity);

        this.isHeartRateSensorSupported = isHeartRateSensorSupported;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "isHeartRateSensorSupported=" + isHeartRateSensorSupported +
                ", isWirelessChargingSupported=" + isWirelessChargingSupported +
                ", displayInches='" + displayInches + '\'' +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                '}';
    }
}
