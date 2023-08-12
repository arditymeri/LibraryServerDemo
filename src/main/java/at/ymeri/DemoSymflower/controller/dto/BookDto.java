package at.ymeri.DemoSymflower.controller.dto;

import at.ymeri.DemoSymflower.model.Author;
import lombok.Data;

import java.util.List;

@Data
public class BookDto {
    private String id;
    private String copyId;
    private String title;
    private String author;
    private String isbn;
    private List<AuthorDto> authors;

}
