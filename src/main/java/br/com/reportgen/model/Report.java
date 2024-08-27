package br.com.reportgen.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "tb_report")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report extends Identifiable<String> {

    private String name;

    private List<Element> elements;

    private String createdBy;

}

