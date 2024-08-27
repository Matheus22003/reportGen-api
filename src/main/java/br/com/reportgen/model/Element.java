package br.com.reportgen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Element extends Identifiable<String> {
    private String elementRefStyle;
    private List<ElementRefData> elementRefData;
    private String elementRefNativeData;
}
