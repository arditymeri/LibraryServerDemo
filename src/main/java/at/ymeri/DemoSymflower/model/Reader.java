package at.ymeri.DemoSymflower.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("readers")
@AllArgsConstructor
public class Reader {

    @Id
    private String id;

    private String name;
    private String lastName;
    private String email;
    private List<Book> reading;
}
