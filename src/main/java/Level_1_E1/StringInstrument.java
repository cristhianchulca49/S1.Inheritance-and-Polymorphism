package Level_1_E1;

public class StringInstrument extends Instrument {
    static {
        System.out.println("String Instrument is charging");
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing: " + super.getName());
    }
}
