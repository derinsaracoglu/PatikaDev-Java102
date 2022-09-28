package BookList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Çalýkuþu", 541, "Reþat Nuri Güntekin", 1922));
        bookList.add(new Book("Beyaz Zambaklar Ülkesinde", 248, " Grigoriy Petrov", 1923));
        bookList.add(new Book("Aylak Adam", 192, "Yusuf Atilgan", 1959));
        bookList.add(new Book("Bu Ulke", 339, "Cemil Meric", 1975));
        bookList.add(new Book("Sol Ayaðým", 89, "Christy Brown", 1985));
        bookList.add(new Book("Dönüþüm", 160, "Franz Kafka", 1940));
        bookList.add(new Book("Siyah Ýnci", 150, "Anna Sewell", 2014));
        bookList.add(new Book("Yýlký Atý", 95, "Peyami Safa", 1977));
        bookList.add(new Book("Ateþ ve Kan", 800, "George R. R. Martin", 2020));
        bookList.add(new Book("Momo", 119, "Ende", 1980));
	
        System.out.println("---------------------");
        
        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(),book.getAuthor()));
        for(String i : bookMap.keySet()) {
        	System.out.println("Book Name:" + i + "\nAuthor Name: " + bookMap.get(i));
        }
        System.out.println("---------------------");
	
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber()>100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Book name : " + b.getBookName() + "  " +
                "Page Number : " + b.getPageNumber() + "  " +
                "Author : " + b.getAuthor() + "  " +
                "ReleaseDate : " + b.getReleaseDate()));
	
        System.out.println("*--------------------------------------*");

        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);
	
	}

}
