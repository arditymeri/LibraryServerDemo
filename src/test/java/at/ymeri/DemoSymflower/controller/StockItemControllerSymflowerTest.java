package at.ymeri.DemoSymflower.controller;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StockItemControllerSymflowerTest {
	@Test
	public void getAvailableStockItems1() {
		StockItemController s = new StockItemController(null);
		String bookId = null;
		// assertThrows(java.lang.NullPointerException.class, () -> {
		s.getAvailableStockItems(bookId);
		// });
	}
}
