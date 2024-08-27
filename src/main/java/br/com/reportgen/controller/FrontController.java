package br.com.reportgen.controller;

import br.com.reportgen.model.Report;
import br.com.reportgen.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/front-end")
public class FrontController {

    @Autowired
    private ComponentService frontService;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Report>> listAllCarros(@RequestParam(required = false) @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime dataCadastro) {
        return ResponseEntity.ok(frontService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Report> findById(@PathVariable String id) {
        return ResponseEntity.ok(frontService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Report carrcomponent) {
        frontService.insert(carrcomponent);
        return ResponseEntity.ok().build();
    }

}
