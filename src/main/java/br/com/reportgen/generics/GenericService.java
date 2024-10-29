package br.com.reportgen.generics;

import br.com.reportgen.model.Identifiable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class GenericService<T extends Identifiable<ID>, ID, R extends PagingAndSortingRepository<T, ID>> {

    @Autowired
    public R repository;

    public void preSave(T t) {
    }

    public T save(T t) {
        this.preSave(t);
        return repository.save(t);
    }

    public T findById(ID id) {
        return repository.findById(id).get();
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    public Page<T> findAll(PageRequest pageRequest) {
        return repository.findAll(pageRequest);
    }

}
