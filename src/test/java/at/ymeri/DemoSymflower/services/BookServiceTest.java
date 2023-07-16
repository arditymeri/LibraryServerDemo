package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Book;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BookServiceTest {
	@Autowired
	private BookService bookService;

	@Test
	public void addBook() {
		Book book = null;
		Book actual = bookService.addBook(book);
	}
}
