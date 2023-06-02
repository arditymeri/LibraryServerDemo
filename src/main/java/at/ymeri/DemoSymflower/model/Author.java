package at.ymeri.DemoSymflower.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("authors")
@AllArgsConstructor
public class Author {

    @Id
    private String id;
    private String name;
    private String lastName;

}
