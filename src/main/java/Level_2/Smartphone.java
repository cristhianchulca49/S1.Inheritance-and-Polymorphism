package Level_2;

public class Smartphone extends Phone implements Camera, Watch{

    @Override
    public void photograph() {
        System.out.println("A photo is begin take from Smartphone");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing from Smartphone");
    }
}
