package factoryPattern.modul;

import factoryPattern.Book;

public class ScienceBook extends Book {
    private String bookName;

    @Override
    public void searchBook() {
//        this.bookName = book.getCompanyName();
        System.out.println("Science book");
    }
}
