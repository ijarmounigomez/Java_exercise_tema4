package smartdevice;

import smartdevice.herencia.SmartPhone;

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

    public static class SmartPhone extends SmartDevice {
        int ram;
        String system;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String brand, String name, String model, double price, int ram, String system) {
            super(brand, name, model, price);
            this.ram = ram;
            this.system = system;
        }
        @Override
        public String toString() {
            return "SmartPhone{" +
                    "brand='" + brand + '\'' +
                    ", name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price + '\'' +
                    ", ram=" + ram + '\'' +
                    ", system=" + system +
                    '}';
        }
    }
    public static class SmartWatch extends SmartDevice {
        double inches;
        String connectivity;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String brand, String name, String model, double price, double inches, String connectivity) {
            super(brand, name, model, price);
            this.inches = inches;
            this.connectivity = connectivity;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "brand='" + brand + '\'' +
                    ", name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price + '\'' +
                    ", inches=" + inches + '\'' +
                    ", connectivity=" + connectivity +
                    '}';
        }
    }

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung", "S10", "Azul", 8.5, 3, "Android");

        SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "6 Plus", 789.99, 3.5, "Bluetooth");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

    }
}