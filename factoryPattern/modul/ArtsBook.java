package factoryPattern.modul;

import factoryPattern.Book;

public class ArtsBook extends Book {
    @Override
    public void searchBook() {
        System.out.println("Arts book");
    }
}
