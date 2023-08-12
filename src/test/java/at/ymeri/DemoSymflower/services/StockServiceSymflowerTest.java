package at.ymeri.DemoSymflower.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StockServiceSymflowerTest {
	@Disabled
    @Test
	public void countStockItem1() {
		StockService s = new StockService(null, null, null, null);
		String bookId = null;
		// assertThrows(java.lang.NullPointerException.class, () -> {
		s.countStockItem(bookId);
		// });
	}
}
