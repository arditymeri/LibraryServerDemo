package at.ymeri.DemoSymflower.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("books")
@AllArgsConstructor
public class Book {

    @Id
    private String id;
    private String copyId;
    private String title;
    private String author;
    private String isbn;
    private List<Author> authors;

}
