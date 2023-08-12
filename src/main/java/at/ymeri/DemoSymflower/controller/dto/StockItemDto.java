package at.ymeri.DemoSymflower.controller.dto;

import at.ymeri.DemoSymflower.model.Address;
import at.ymeri.DemoSymflower.model.Book;
import lombok.Data;

@Data
public class StockItemDto {
    private String id;
    private int timesRented;
    private Book book;
    private Address address;
}
