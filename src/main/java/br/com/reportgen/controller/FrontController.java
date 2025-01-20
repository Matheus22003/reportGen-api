package br.com.reportgen.controller;

import br.com.reportgen.model.Report;
import br.com.reportgen.service.ComponentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/front-end")
@RequiredArgsConstructor
public class FrontController {

    @Autowired
    private ComponentService frontService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid Report report) {
        frontService.save(report);
        return ok().build();
    }

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Report>> listAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "created,desc") String sort) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sort));
        return ok(frontService.findAll(pageRequest).getContent());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Report> findById(@PathVariable String id) {
        return ok(frontService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        frontService.deleteById(id);
        return ok().build();
    }


}
