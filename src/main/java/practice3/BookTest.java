package practice3;

class Book{
    String author;
    String title;
    int year;
    String publisher;
    void setAuthor(String author){this.author=author;}
    void setTitle(String title){this.title=title;}
    void setYear(int year){this.year=year;}
    void setPublisher(String publisher){this.publisher=publisher;}
    String getAuthor(){return author;}
    String getTitle(){return title;}
    String getPublisher(){return publisher;}
    int getYear(){return year;}
}
public class BookTest {
    public static void main(String[]args){
        Book book=new Book();
        book.setAuthor("Dostoevsky");
        book.setPublisher("ABC classics");
        book.title="Poor people";
        book.year=1845;
        System.out.println("Book title: "+book.getTitle());
        System.out.println("Author of the book: "+book.getAuthor());
        System.out.println("Book was written in: "+book.getYear());
        System.out.println("Book was published by: "+book.getPublisher());

    }
}
