package com.study.mapper;


import com.study.dto.v3.*;
import com.study.model.Disciplina;
import com.study.model.Professor;
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

    public Disciplina toEntity(DisciplinaRequest disciplinaRequest){
        if (Objects.isNull(disciplinaRequest)) {
            return null;
        } else {
            return Disciplina.builder()
                    .name(disciplinaRequest.getNome())
                    .descricao(disciplinaRequest.getDescricao())
                    .titular(Professor.builder()
                            .cpf("373.856.168-44")
                            .id(3)
                            .email("jeff@gmail.com")
                            .build())
                    .build();
        }
    }

    public DisciplinaResponse toRequestForResponse(DisciplinaRequest disciplinaRequest) {

        Objects.requireNonNull(disciplinaRequest, "entity must not be null");

        var response =
                DisciplinaResponse.builder()
                        .id(disciplinaRequest.getId())
                        .nomeTitular(disciplinaRequest.getNomeTitular())
                        .descricao(disciplinaRequest.getDescricao())
                        .build();

        if (Objects.nonNull(disciplinaRequest.getId())) {
            response.setId(disciplinaRequest.getId());
        }
        return response;
    }
}