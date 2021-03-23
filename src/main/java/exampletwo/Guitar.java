package exampletwo;

public class Guitar implements MusicalInstrument {

    Integer numstrings =6;

    public void play(Integer integer) {
        System.out.println(integer+"-string guitar plays.");
    }
}
