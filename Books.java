package blcandElc;

public class Books {
	public static void main(String[] args) {
		Library book=new Library();
		book.setBookDetails(101, "R.K. Narayan", "Malgudi Dyas", 350.50, 280);
		book.displayBookDetails();
	}
}
