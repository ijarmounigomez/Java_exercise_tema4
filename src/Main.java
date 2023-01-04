import smartdevice.SmartDevice;
import smartdevice.herencia.SmartPhone;
import smartdevice.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        // 1. Smart device
        SmartDevice device1 = new SmartDevice();
        SmartDevice device2 = new SmartDevice("Apple", "iPhone", "12", 1450.0);
        System.out.println(device1);
        System.out.println(device2);

        // 2. Smartwatch
        SmartWatch smartwatch1 = new SmartWatch();
        SmartWatch smartwatch2 = new SmartWatch("blue", "xiaomi", 12);
        System.out.println(smartwatch1);
        System.out.println(smartwatch2);

        // 3. Smartphone
        SmartPhone smartphone1 = new SmartPhone();
        SmartPhone smartphone2 = new SmartPhone("black", "Xiaomi", 20);
        System.out.println(smartphone1);
        System.out.println(smartphone2);

    }
}