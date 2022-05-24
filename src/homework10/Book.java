package homework10;

public class Book {
    private String namebook;
    private int publicationYear;

    private Author author;


    public Book (String namebook, Author author, int publicationYear) {
        this.namebook = namebook;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getNamebook() {
        return this.namebook;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
