package Level_1_E1;

public class WindInstrument extends Instrument{
    @Override
    public void play() {
        System.out.println("A wind instrument is playing: " + super.getName());
    }

}
