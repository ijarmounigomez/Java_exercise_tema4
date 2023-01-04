package smartdevice.herencia;

import smartdevice.SmartDevice;

public class SmartWatch extends SmartDevice {
    String color;
    String phoneBrand;
    int centimeters;

    public SmartWatch() {}
    public SmartWatch(String color, String phoneBrand, int centimeters) {
        this.color = color;
        this.phoneBrand = phoneBrand;
        this.centimeters = centimeters;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", phoneBrand='" + phoneBrand + '\'' +
                ", centimeters=" + centimeters +
                '}';
    }
}
