package beTheCompiler.Chapter2.A;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        //create the object
        TapeDeck t = new TapeDeck();

        t.canRecord = true;

        if (t.canRecord == true) {
            t.recordTape();
        }
        t.playTape();
    }
}
