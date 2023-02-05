package com.study.view.rs.v6;


import com.study.dto.v3.AlunoRequest;
import com.study.dto.v3.AlunoResponse;
import com.study.dto.v3.ProfessorResponse;
import com.study.dto.v3.TutorResponse;
import com.study.service.AlunoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/alunos")
@Slf4j
public class AlunoController {

    private final AlunoService service;

    @GetMapping
    public ResponseEntity<List<AlunoResponse>> list() {
        final var response = service.retrieveAll();

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<AlunoResponse> save(@Valid final AlunoRequest request) {
        final var response = service.save(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponse> getById(@PathVariable("id") int id) {

        final var response = service.getById(id);

        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}/tutor/{idProfessor}")
    public ResponseEntity<TutorResponse> updateTitular(@PathVariable("id") int idAluno, @PathVariable("idProfessor") int idProfessor) {
        final var response = service.updateTutor(idAluno, idProfessor);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @PatchMapping("/{id}/tutor/{idTutor}")
    public ResponseEntity<AlunoResponse> updateProfessor(@PathVariable("id") int idDisciplina, @PathVariable("idTutor") int idTutor) {
        final var response = service.updateProfessor(idDisciplina, idTutor);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
