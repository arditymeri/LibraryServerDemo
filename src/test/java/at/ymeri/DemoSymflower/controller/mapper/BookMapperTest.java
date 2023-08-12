package at.ymeri.DemoSymflower.controller.mapper;

import at.ymeri.DemoSymflower.controller.dto.BookDto;
import at.ymeri.DemoSymflower.model.Author;
import at.ymeri.DemoSymflower.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookMapperTest {

    @Test
    void testBookMapper() {
        Author author = new Author("123", "Jon", "Snow");
        Book book = new Book("Some-Id", "001", "The song of ice and fire", "Martin", "123123", List.of(author));

        BookDto dto = BookMapper.INSTANCE.bookToBookDto(book);

        assertAll(
                () -> assertEquals("Some-Id", dto.getId()),
                () -> assertEquals("001", dto.getCopyId()),
                () -> assertEquals("123123", dto.getIsbn()),
                () -> assertNotNull( dto.getAuthors()),
                () -> assertEquals("123", dto.getAuthors().get(0).getId()),
                () -> assertEquals("Jon", dto.getAuthors().get(0).getName()),
                () -> assertEquals("Snow", dto.getAuthors().get(0).getLastName())
        );
    }
}
