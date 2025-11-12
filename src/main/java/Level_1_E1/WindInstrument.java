package Level_1_E1;

public class WindInstrument extends Instrument {
    static {
        System.out.println("Wind Instrument is charging");
    }

    public WindInstrument(String name, float price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing: " + super.getName());
    }

}
