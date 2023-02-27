import javax.sound.midi.MidiChannel;

public class Hangar {
    public static void main(String[] args) {
        Car taxi = new Car("Taxi", 100000);
        Boat zodiac = new Boat("Zodiac", 100);

        System.out.println(taxi.doStuff());
        System.out.println(zodiac.doStuff());
    }
}
