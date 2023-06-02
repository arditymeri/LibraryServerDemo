package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Book;
import at.ymeri.DemoSymflower.repo.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        Book newBook = bookRepository.save(book);
        return newBook;
    }
}
