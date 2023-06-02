package at.ymeri.DemoSymflower.controller.mapper;

import at.ymeri.DemoSymflower.controller.dto.BookDto;
import at.ymeri.DemoSymflower.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);
}
