package exampleone;

public class Book implements Printable {

    public void print() {
        System.out.println("The book is printed!");
    }

    static void printBook (Printable[] printable) {
        System.out.println("Title of the Book!"+printable.toString());
    }

}
