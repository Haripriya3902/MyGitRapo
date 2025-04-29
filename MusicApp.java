interface Playable {
    void play();
}
abstract class Instrument implements Playable {
    void tune() {
        System.out.println("Instrument is being tuned.");
    }
    
    abstract void repair();
}
final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music.");
    }
    @Override
    void repair() {
        System.out.println("Repairing the Guitar.");
    }
}
public class Main {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.tune();
        myGuitar.play();
        myGuitar.repair();
    }
}