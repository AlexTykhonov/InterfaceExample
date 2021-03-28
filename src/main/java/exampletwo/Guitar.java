package exampletwo;

public class Guitar implements MusicalInstrument {

    Integer numstrings =6;

    public void play() {
        System.out.println(numstrings+"-string guitar plays.");
    }
}
