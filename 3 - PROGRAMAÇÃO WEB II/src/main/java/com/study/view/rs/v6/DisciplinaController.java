package com.study.view.rs.v6;

import com.study.dto.v3.DisciplinaRequest;
import com.study.dto.v3.DisciplinaResponse;
import com.study.dto.v3.ProfessorResponse;
import com.study.dto.v3.TutorResponse;
import com.study.model.Disciplina;
import com.study.service.DisciplinaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/disciplinas")
@Slf4j
public class DisciplinaController {

    private final DisciplinaService service;

    @PostMapping
    public ResponseEntity<DisciplinaResponse> insertDisciplina(@Valid @RequestBody DisciplinaRequest disciplinaResponse){
        var insertProfessor = service.insertDisciplina(disciplinaResponse);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(insertProfessor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaResponse> getProfessor(@PathVariable("id") int id) {

        final DisciplinaResponse disciplinaResponse = service.getById(id);


        return ResponseEntity.ok(disciplinaResponse);
    }

    @PatchMapping("/{id}/titular/{idProfessor}")
    public ResponseEntity<DisciplinaResponse> updateProfessor(@PathVariable("id") int idDisciplina, @PathVariable("idProfessor") int idProfessor) {
        final var response = service.updateProfessor(idDisciplina, idProfessor);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
