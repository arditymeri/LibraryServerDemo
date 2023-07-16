package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Reader;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;

@DataJpaTest
public class ReaderServiceTest {
	@Autowired
	private ReaderService readerService;

	@Test
	public void registerReader() {
		Reader reader = null;
		readerService.registerReader(reader);
	}

	@Test
	public void findByName() {
		String name = null;
		List<Reader> actual = readerService.findByName(name);
	}
}
