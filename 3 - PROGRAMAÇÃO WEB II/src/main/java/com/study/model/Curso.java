package com.study.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CURSOS")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id")
    private Integer id;

    @NotBlank(message = "Name must be not empty or null")
    @Column(name = "curso_name", nullable = false)
    private String name;

    private String descricao;

    @NotBlank(message = "Duration must be not empty or null")
    @Column(nullable = false)
    private Integer duracao;
}
