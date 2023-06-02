package at.ymeri.DemoSymflower.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("rents")
@Getter
@Setter
@AllArgsConstructor
public class RentItem {
    @Id
    private String id;
    private StockItem stockItem;
    private Reader reader;
    private LocalDate rentDate;
    private LocalDate dueDate;

}
