package com.study.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Curso {
    @NotBlank(message = "Name must be not empty or null")
    private String nome;

    private String descricao;

    @Min(8)
    @Max(40)
    @NotBlank(message = "Duration must be not empty or null")
    private Integer duracao;
}
