package at.ymeri.DemoSymflower.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;



//@DataJpaTest
public
class StockServiceTest {
	//@Autowired
	private StockService stockService;

	@Disabled
	@Test
	public void countStockItem() {
		String bookId = null;
		int actual = stockService.countStockItem(bookId);
	}

}
