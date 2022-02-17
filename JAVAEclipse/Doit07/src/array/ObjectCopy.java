package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Da Vinci Code", " Brown, Dan");
		bookArray1[1] = new Book("Harry Potter", " Rowling, J.K.");
		bookArray1[2] = new Book("Fifty Shades Darker", " James, E. L");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("Twilight");
		bookArray1[0].setAuthor(" Meyer, Stephenie");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
	}

}
