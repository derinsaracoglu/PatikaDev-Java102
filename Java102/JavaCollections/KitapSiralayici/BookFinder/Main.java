package BookFinder;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> book = new TreeSet<>();

        Book book1=new Book("Þeker Portakalý",183, "José Mauro de Vasconcelos", 1968);
        Book book2=new Book("Delifiþek", 160, "José Mauro de Vasconcelos",1960);
        Book book3=new Book("Kürk Mantolu Madonna",  177,"Sabahattin Ali", 1943);
        Book book4=new Book("Fahrenheit 451", 350, "Ray Bradbury",1953);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);

        System.out.println("sort by name:");
        for (Book bookName:book){
            System.out.println("Book Name: "+bookName.getBookName()+
                    "\nNumber of page: "+bookName.getNumberOfPage()+
                    "\nAuthor Name: "+bookName.getAuthorName()+
                    "\nReleased Date: "+bookName.getReleaseDate());
            System.out.println("..........................................");
        }

        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getNumberOfPage()-b2.getNumberOfPage();
            }
        });

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println("************************************");
        System.out.println("sorted by number of page");
        for(Book bookPage:books){
            System.out.println("Book Name: "+bookPage.getBookName()+
                    "\nNumber of page: "+bookPage.getNumberOfPage()+
                    "\nAuthor Name: "+bookPage.getAuthorName()+
                    "\nReleased Date: "+bookPage.getReleaseDate());
            System.out.println("..........................................");
        }
    }
}