package br.com.reportgen.assembler;

public interface AssemblerMapper <RESOURCE, MODEL>{

    RESOURCE toResource(MODEL model);

    MODEL toModel(RESOURCE resource);

}
