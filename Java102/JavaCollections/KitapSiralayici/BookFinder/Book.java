package BookFinder;

import java.lang.Comparable;

public class Book implements Comparable<Book> {
	private String bookName;
	private int numberOfPage;
	private String authorName;
	private int releaseDate;
	
	
	public Book(String bookName, int numberOfPage, String authorName,  int releaseDate) {
		
		this.bookName = bookName;
		this.authorName = authorName;
		this.numberOfPage = numberOfPage;
		this.releaseDate = releaseDate;
			
	}
	

	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getNumberOfPage() {
		return numberOfPage;
	}


	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}


	public int getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
    public int compareTo(Book b) {
		
		return getBookName().compareTo(b.getBookName());
	}



}
