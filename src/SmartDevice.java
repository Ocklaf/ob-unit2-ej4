public class SmartDevice {
    boolean isWirelessChargingSupported;
    String displayInches;
    String batteryCapacity;

    public SmartDevice(){}

    public SmartDevice(boolean isWirelessChargingSupported, String displayInches, String batteryCapacity) {
        this.isWirelessChargingSupported = isWirelessChargingSupported;
        this.displayInches = displayInches;
        this.batteryCapacity = batteryCapacity;
    }
}
