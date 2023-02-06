package com.study.model;

import com.study.dto.v3.Curso;
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
@Table(name = "DISCIPLINAS")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disciplina_id")
    private Integer id;

    @NotBlank(message = "Name must be not empty or null")
    @Column(name = "disciplina_name", nullable = false)
    private String name;

    private String descricao;

    private String nomeTitular;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "titular")
    private Professor titular;

//    @NotBlank(message = "Course must be not empty or null")
//    @Column(nullable = false)
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
//    private Curso curso;

}
