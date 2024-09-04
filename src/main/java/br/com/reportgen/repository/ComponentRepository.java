package br.com.reportgen.repository;

import br.com.reportgen.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ComponentRepository extends PagingAndSortingRepository<Report, String> {

    List<Report> findAllByCreated(LocalDateTime created, Pageable pageable);
}
