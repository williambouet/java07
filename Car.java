public class Car extends Vehicle {

    public Car(String brand, int kilometer) {
        super(brand, kilometer);
    }

    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }

}
