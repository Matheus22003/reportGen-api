package br.com.reportgen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionFront {
    private String placeholder;
    private String label;
    private String value;
    private String title;
}
