public class Book {
    private String title;
    private int pageN;
    private int publicationYear;

    public Book(String title, int pageN, int publicationYear) {
        this.title = title;
        this.pageN = pageN;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pageN + " pages, " + this.publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageN() {
        return this.pageN;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

}
