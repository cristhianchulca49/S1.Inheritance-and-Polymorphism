package Level_1_E1;

public class StringInstrument extends Instrument{
    @Override
    public void play() {
        System.out.println("A string instrument is playing: "+ super.getName());
    }
}
