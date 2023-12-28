package br.com.reportgen.repository;

import br.com.reportgen.model.ComponentFront;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends MongoRepository<ComponentFront, String> {

}
