package br.com.reportgen.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "tb_front_componentes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComponentFront extends Identifiable<String> {

    private String name;
    private String tipoComponente;
    private List<OptionFront> options;
    private String descricao;

}

