package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("Da Vinci Code", " Brown, Dan");
		library[1] = new Book("Harry Potter", " Rowling, J.K.");
		library[2] = new Book("Fifty Shades Darker", " James, E. L");
		library[3] = new Book("Twilight", " Meyer, Stephenie");
		library[4] = new Book("New Moon", " Meyer, Stephenie");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
