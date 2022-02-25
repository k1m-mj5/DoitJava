package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("Harry Potter 1");
		shelfQueue.enQueue("Harry Potter 2");
		shelfQueue.enQueue("Harry Potter 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
