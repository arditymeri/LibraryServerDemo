package at.ymeri.DemoSymflower.repo;

import at.ymeri.DemoSymflower.model.Reader;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReaderRepository extends MongoRepository<Reader, String> {

    List<Reader> findByName(String name);
}
