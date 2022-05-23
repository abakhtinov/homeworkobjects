package homework10;

public class Book {
    private String namebook;
    private int publicationYear;


    public Book(String namebook, int publicationYear) {
        this.namebook = namebook;
        this.publicationYear = publicationYear;
    }

    public String getNamebook() {
        return this.namebook;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
