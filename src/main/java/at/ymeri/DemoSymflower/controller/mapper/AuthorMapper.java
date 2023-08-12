package at.ymeri.DemoSymflower.controller.mapper;

import at.ymeri.DemoSymflower.controller.dto.AuthorDto;
import at.ymeri.DemoSymflower.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDto authorToAuthorDto(Author author);
}
