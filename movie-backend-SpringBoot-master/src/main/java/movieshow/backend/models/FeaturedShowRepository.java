package movieshow.backend.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturedShowRepository extends MongoRepository<FeaturedShow, String > {
}
