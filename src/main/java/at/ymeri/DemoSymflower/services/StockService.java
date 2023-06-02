package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.*;
import at.ymeri.DemoSymflower.repo.BookRepository;
import at.ymeri.DemoSymflower.repo.ReaderRepository;
import at.ymeri.DemoSymflower.repo.RentItemRepository;
import at.ymeri.DemoSymflower.repo.StockItemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    private BookRepository bookRepository;
    private StockItemRepository stockItemRepository;

    private ReaderRepository readerRepository;

    private RentItemRepository rentItemRepository;

    public StockService(BookRepository bookRepository, StockItemRepository stockItemRepository, RentItemRepository rentItemRepository, ReaderRepository readerRepository) {
        this.bookRepository = bookRepository;
        this.stockItemRepository = stockItemRepository;
        this.rentItemRepository = rentItemRepository;
        this.readerRepository = readerRepository;
    }


    public int countStockItem(String bookId) {
        return stockItemRepository.findByBookId(bookId).size();
    }


    public void addStockItem(String bookId, Address address) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        StockItem stockItem = new StockItem("", 0, book, address);
        stockItemRepository.save(stockItem);
    }

    public void rentStockItem(String bookId, String readerId) {
        Book book = bookRepository.findById(bookId).orElseThrow();

        List<StockItem> stockItems =  findAllStockItemsByBookId(bookId);
        if(stockItems.isEmpty()) {
            throw new RuntimeException("Out of stock");
        }
        StockItem stockItem = stockItems.get(0);
        stockItemRepository.delete(stockItem);

        Reader reader = readerRepository.findById(readerId).orElseThrow();
        RentItem rentItem = new RentItem("", stockItem, reader, LocalDate.now(), LocalDate.now().plusDays(14));
        rentItemRepository.save(rentItem);
    }

    public List<StockItem> findAllStockItemsByBookId(String bookId) {
        return stockItemRepository.findByBookId(bookId);
    }

}
