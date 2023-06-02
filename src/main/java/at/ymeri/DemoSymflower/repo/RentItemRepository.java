package at.ymeri.DemoSymflower.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentItemRepository extends MongoRepository<at.ymeri.DemoSymflower.model.RentItem, String> {

}
