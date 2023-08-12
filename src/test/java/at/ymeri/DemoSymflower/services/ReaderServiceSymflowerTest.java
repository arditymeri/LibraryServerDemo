package at.ymeri.DemoSymflower.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReaderServiceSymflowerTest {
	@Disabled
	@Test
	public void findByName1() {
		ReaderService r = new ReaderService(null);
		String name = null;
		// assertThrows(java.lang.NullPointerException.class, () -> {
		r.findByName(name);
		// });
	}
}
