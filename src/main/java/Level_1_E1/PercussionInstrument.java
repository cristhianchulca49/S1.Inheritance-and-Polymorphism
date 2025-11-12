package Level_1_E1;

public class PercussionInstrument extends Instrument {
    static {
        System.out.println("Percussion Instrument is charging");
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing: " + super.getName());
    }
}
