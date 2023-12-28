package br.com.reportgen.model;

import org.springframework.data.annotation.Id;

public class Identifiable<ID> {
    @Id
    private ID id;
}
