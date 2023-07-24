public class SmartPhone extends SmartDevice {

    boolean is4kCam;

    public SmartPhone(){}

    public SmartPhone(boolean isWirelessChargingSupported, String displayInches, String batteryCapacity, boolean is4kCam) {
        super(isWirelessChargingSupported, displayInches, batteryCapacity);

        this.is4kCam = is4kCam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "is4kCam=" + is4kCam +
                ", isWirelessChargingSupported=" + isWirelessChargingSupported +
                ", displayInches='" + displayInches + '\'' +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                '}';
    }
}
