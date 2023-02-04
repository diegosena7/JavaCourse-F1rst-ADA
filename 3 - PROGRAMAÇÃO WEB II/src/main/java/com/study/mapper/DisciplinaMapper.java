package com.study.mapper;


import com.study.dto.v3.*;
import com.study.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class DisciplinaMapper {


    public List<DisciplinaResponse> toResponse(List<Disciplina> disciplinaResponse) {

        Objects.requireNonNull(disciplinaResponse, "d must not be null");

        return disciplinaResponse.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public DisciplinaResponse toResponse(Disciplina entity) {

        Objects.requireNonNull(entity, "entity must not be null");

        var response =
                DisciplinaResponse.builder()
                        .id(entity.getId())
                        .nomeTitular(entity.getNomeTitular())
                        .descricao(entity.getDescricao())
                        .build();

        if (Objects.nonNull(entity.getId())) {
            response.setId(entity.getId());
        }
        return response;
    }
}