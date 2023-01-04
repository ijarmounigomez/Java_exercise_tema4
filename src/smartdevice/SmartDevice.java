package smartdevice;

public class SmartDevice {
    String brand;
    String name;
    String model;
    double price;
    public SmartDevice() {}
    public SmartDevice(String brand, String name, String model, double price) {
        this.brand = brand;
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}