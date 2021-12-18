package factoryPattern.modul;

import factoryPattern.Book;

public class CommerceBook extends Book {
    @Override
    public void searchBook() {
        System.out.println("Commerce book");
    }
}
