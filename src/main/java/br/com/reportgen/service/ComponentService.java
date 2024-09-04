package br.com.reportgen.service;

import br.com.reportgen.generics.GenericService;
import br.com.reportgen.model.Report;
import br.com.reportgen.repository.ComponentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ComponentService extends GenericService<Report, String, ComponentRepository> {

    @Override
    public void preSave(Report report) {
        report.setCreated(LocalDateTime.now());
    }

}
