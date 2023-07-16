package at.ymeri.DemoSymflower.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.mock.mockito.MockBean;
import at.ymeri.DemoSymflower.services.StockService;

@WebMvcTest(StockItemController.class)
public class StockItemControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StockService stockService;

	@Test
	public void getAvailableStockItems() throws Exception {
		this.mockMvc.perform(get("/stockItems")).
		  andExpect(status().isOk()).
		  andExpect(content().contentType("application/json")).
		  andExpect(jsonPath("$.<key>").value("<value>"));
	}

	@Test
	public void getAvailableStockItemsTODO() throws Exception {
		this.mockMvc.perform(get("/stockItems"))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$.<key>").value("<value>"));
	}
}
