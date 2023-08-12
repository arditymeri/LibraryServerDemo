package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Book;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//@DataJpaTest
public class BookServiceSymflowerTest {
	@Autowired
	private BookService bookService;

	@Disabled
	@Test
	public void addBook1() {
		Book book = null; // TODO This is a fallback value due to incomplete analysis.
		Book actual = bookService.addBook(book);
	}
}
