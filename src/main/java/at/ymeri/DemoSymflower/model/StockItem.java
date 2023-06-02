package at.ymeri.DemoSymflower.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document("stockItems")
public class StockItem {
    @Id
    private String id;

    private int timesRented;

    private Book book;
    private Address address;

}
