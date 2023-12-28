package br.com.reportgen.generics;

import br.com.reportgen.model.Identifiable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericService<T extends Identifiable<ID>, ID, R extends MongoRepository<T, ID>> {

    @Autowired
    private R repository;

    public void insert(T t) {
        repository.save(t);
    }

    public T findById(ID id) {
        return repository.findById(id).get();
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }
}
