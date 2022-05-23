package homework10;

public class Lesson10 {





    public static void main(String[] args) {

        Author tolkin = new Author("Джон", "Толкин");
        System.out.println("tolkin.surname = " + tolkin.getSurname());
        System.out.println("tolkin.name = " + tolkin.getName());

        Author joanne = new Author("Джоан", "Роулинг");
        System.out.println("joanne.surname = " + joanne.getSurname());
        System.out.println("joanne.name = " + joanne.getName());

        Book lor = new Book("Властелин колец", 1954);
        System.out.println("lor.name = " + lor.getNamebook());
        System.out.println("lor.publicationYear = " + lor.getPublicationYear());
        

        Book gp = new Book("Гарри Поттер", 1997);
        System.out.println("gp.namebook = " + gp.getNamebook());
        System.out.println("gp.publicationYear = " + gp.getPublicationYear());
        gp.setPublicationYear(1998);
        System.out.println("gp.getPublicationYear() = " + gp.getPublicationYear());

    }
}
