package stephan.r.tutorials.thirtydaysofcode.day13;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-abstract-classes/problem
 * 
 * @author Stéphan R.
 *
 */
public class AbstractClasses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
	}
}

abstract class Book {
	
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    /**
     * Print the title, author, and price in the specified format.
     */
    abstract void display();
}

class MyBook extends Book {
	
	private int price;
	
	/**
	 * @param title The book's title.
	 * @param author The book's author.
	 * @param price The book's price.
	 */
	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see stephan.r.tutorials.thirtydaysofcode.day13.Book#display()
	 */
	@Override
	void display() {
		System.out.println(String.format("Title: %s\nAuthor: %s\nPrice: %d", title, author, price));
	}
}