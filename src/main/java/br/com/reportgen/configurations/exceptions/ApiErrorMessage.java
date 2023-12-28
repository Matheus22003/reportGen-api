package br.com.reportgen.configurations.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiErrorMessage {
    private HttpStatus status;
    private List<String> errors;
}