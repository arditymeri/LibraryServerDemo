package at.ymeri.DemoSymflower.controller;

import at.ymeri.DemoSymflower.model.Address;
import at.ymeri.DemoSymflower.model.Author;
import at.ymeri.DemoSymflower.model.Book;
import at.ymeri.DemoSymflower.model.StockItem;
import at.ymeri.DemoSymflower.services.StockService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(StockItemController.class)
public class StockItemControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StockService stockService;

	@Test
	public void getAvailableStockItems() throws Exception {
		Author author = new Author("00", "John", "Snow");
		Book book = new Book("001", "002", "Story of Ice and Fire.", "John Snow", "123123", List.of(author));
		Address address = new Address("Northwall Street", "01", "1010", "Winterfell", "Seven Landings");
		StockItem item = new StockItem("someId", 3, book, address);
		when(stockService.findAllStockItemsByBookId(any())).thenReturn(Collections.singletonList(item));
		this.mockMvc.perform(get("/stockItems")).
		  		andExpect(status().isOk()).
		  		andExpect(content().contentType("application/json")).
		  		andExpect(jsonPath("$.[0].book.isbn").value("123123"));
	}

	@Test
	public void getAvailableStockItemsTODO() throws Exception {
		this.mockMvc.perform(get("/stockItems"))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$.[0]").doesNotExist());
	}
}
