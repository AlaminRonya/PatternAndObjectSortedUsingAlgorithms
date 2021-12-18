package factoryPattern;

public abstract class Book {
    private String companyName;
    private String publisherName;

    public Book() {
    }

    public Book(String bookName, String publisherName) {
        this.companyName = bookName;
        this.publisherName = publisherName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + companyName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }

    public abstract void searchBook();
}
