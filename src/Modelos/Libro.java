package Modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Libro (
        @JsonAlias("title")Integer titulo,
        @JsonAlias("authors")String autor,
        @JsonAlias("languages")Integer lenguages,
        @JsonAlias("count")double descargas) {
}
