package com.study.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class DisciplinaResponse {

    private Integer id;
    private String nome;
    private String descricao;
    private List<Curso> cursos;
    private String nomeTitular;
}
