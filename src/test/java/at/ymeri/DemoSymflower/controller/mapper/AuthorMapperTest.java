package at.ymeri.DemoSymflower.controller.mapper;

import at.ymeri.DemoSymflower.controller.dto.AuthorDto;
import at.ymeri.DemoSymflower.model.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthorMapperTest {

    @Test
    void authorMapper() {
        Author author = new Author("some-id", "Jon", "Snow");

        AuthorMapper mapper = AuthorMapper.INSTANCE;

        AuthorDto dto = mapper.authorToAuthorDto(author);
        assertEquals("some-id", dto.getId());
        assertEquals("Jon", dto.getName());
        assertEquals("Snow", dto.getLastName());
    }
}
