package blcandElc;

public class Library {
	int bookId;
	String author;
	String title;
	double price;
	int pages;
	public void setBookDetails(int bookId, String author, String title, double price, int pages) {
	    this.bookId=bookId;
		this.author=author;
		this.title=title;
		this.price=price;
		this.pages=pages;
	}
	public void displayBookDetails() {
		System.out.println("Book ID:"+ bookId);
		System.out.println("Author:"+ author);
		System.out.println("Title:"+ title);
		System.out.println("Price:"+ price);
		System.out.println("Pages:"+ pages);
	}

}
