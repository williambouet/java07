abstract class Vehicle {
    private String brand;
    private int kilometer;

    public Vehicle(String brand, int kilometer) {
        this.brand = brand;
        this.kilometer = kilometer;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract public String doStuff();

}