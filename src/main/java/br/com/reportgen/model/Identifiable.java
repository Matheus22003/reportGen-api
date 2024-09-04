package br.com.reportgen.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Identifiable<ID> {
    @Id
    private ID id;
}
