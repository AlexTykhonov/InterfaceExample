package exampletwo;

public class Exampletwo {

    public static void main(String[] args) {

        Drums drums = new Drums();
        Drums drums2 = new Drums();
        Guitar guitar = new Guitar();
        Guitar guitar2 = new Guitar();
        Horn horn = new Horn();
        Horn horn2 = new Horn();

        MusicalInstrument[] musicalInstruments = {drums, drums2, guitar, guitar2, horn, horn2};


        for (int i = 0; i < musicalInstruments.length; i++) {
            musicalInstruments[i].play();
        }

    }
}
