package E9;

public class Music5 {
    public static void main(String args[]) {
        Instrument orchestra[] = { new Wind(), new Percussion(), new Stringed(),};
        tuneAll(orchestra);
    }
    static void tuneAll(Instrument e[]) {
        for (Instrument i : e) {
            tune(i);
        }
    }
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
}

abstract class Instrument {
    public abstract void play(Note n);
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

enum Note {
    MIDDLE_C, SHARP_C
}