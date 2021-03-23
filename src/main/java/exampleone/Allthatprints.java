package exampleone;

public class Allthatprints {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Magazine magazine = new Magazine();
        Magazine magazine2 = new Magazine();
        Magazine magazine3 = new Magazine();
        Magazine magazine4 = new Magazine();

        Printable[] printables = {book1, book2, book3, book4, magazine, magazine2, magazine3, magazine4};


        for (int i = 0; i < printables.length; i++) {
   //         printables[i].print();

            if (printables[i] instanceof Book) {
                Book.printBook(printables);
            } else {
                Magazine.printMagazines(printables);
            }
        }
    }
}
