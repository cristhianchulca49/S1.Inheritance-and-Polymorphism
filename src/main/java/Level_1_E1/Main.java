package Level_1_E1;

public class Main {
    public static void main(String[] args) {
        Instrument flute = new WindInstrument("Yamaha", 500);
        Instrument guitar = new StringInstrument("Gibson", 1680);
        Instrument drums = new PercussionInstrument("Mapex", 500);
        flute.play();
        guitar.play();
        drums.play();
    }
}
