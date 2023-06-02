package at.ymeri.DemoSymflower.repo;

import at.ymeri.DemoSymflower.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
