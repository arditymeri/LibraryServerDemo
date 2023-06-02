package at.ymeri.DemoSymflower.repo;

import at.ymeri.DemoSymflower.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
