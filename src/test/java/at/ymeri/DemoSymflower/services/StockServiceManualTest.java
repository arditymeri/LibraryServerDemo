package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Address;
import at.ymeri.DemoSymflower.model.Book;
import at.ymeri.DemoSymflower.model.StockItem;
import at.ymeri.DemoSymflower.repo.BookRepository;
import at.ymeri.DemoSymflower.repo.ReaderRepository;
import at.ymeri.DemoSymflower.repo.RentItemRepository;
import at.ymeri.DemoSymflower.repo.StockItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class StockServiceManualTest {

    private StockService stockService;
    private BookRepository bookRepository;
    private RentItemRepository rentItemRepository;
    private StockItemRepository stockItemRepository;
    private ReaderRepository readerRepository;



    @BeforeEach
    void setUp() {
        readerRepository = mock(ReaderRepository.class);
        bookRepository = mock(BookRepository.class);
        rentItemRepository = mock(RentItemRepository.class);
        stockItemRepository = mock(StockItemRepository.class);
        stockService = new StockService(bookRepository, stockItemRepository, rentItemRepository, readerRepository);
    }

    @Test
    void test_rentItem_shouldThrowException() {
        Book book = new Book("", "", "", "", "", List.of());
        when(bookRepository.findById(any())).thenReturn(Optional.of(book));
        when(stockItemRepository.findByBookId(any())).thenReturn(List.of());

        assertThrows(RuntimeException.class, () -> stockService.rentStockItem("bookId", "readerId"));
    }

    @Test
    void test_rentItem_shouldInvokeDelte() {
        Book book = new Book("", "", "", "", "", List.of());
        when(bookRepository.findById(any())).thenReturn(Optional.of(book));
        when(stockItemRepository.findByBookId(any())).thenReturn(List.of(new StockItem("", 0, book, new Address("", "", "", "", ""))));

        stockService.rentStockItem("bookId", "readerId");

        verify(stockItemRepository).delete(any());
    }
}
