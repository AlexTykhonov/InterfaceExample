package exampleone;

public class Magazine implements Printable {
    public void print() {
        System.out.println("The Magazine is printed!");
    }

    static void printMagazines(Printable[] printable) {
        System.out.println("Title of the Magazine!" + printable.toString());
    }

}
