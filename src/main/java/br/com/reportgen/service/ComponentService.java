package br.com.reportgen.service;

import br.com.reportgen.generics.GenericService;
import br.com.reportgen.model.ComponentFront;
import br.com.reportgen.repository.ComponentRepository;
import org.springframework.stereotype.Service;

@Service
public class ComponentService extends GenericService<ComponentFront, String, ComponentRepository> {

}
