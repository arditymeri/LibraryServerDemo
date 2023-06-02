package at.ymeri.DemoSymflower.repo;

import at.ymeri.DemoSymflower.model.StockItem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StockItemRepository extends MongoRepository<StockItem, String> {

    List<StockItem> findByBookId(String bookId);
}
