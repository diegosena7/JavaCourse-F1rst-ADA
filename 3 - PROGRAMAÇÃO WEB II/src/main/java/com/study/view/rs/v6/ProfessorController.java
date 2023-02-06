package com.study.view.rs.v6;

import com.study.dto.v3.AlunoResponse;
import com.study.dto.v3.DisciplinaResponse;
import com.study.dto.v3.ProfessorRequest;
import com.study.dto.v3.ProfessorResponse;
import com.study.service.AlunoService;
import com.study.service.DisciplinaService;
import com.study.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Using service with repository
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/v5/professores")
@Slf4j
public class ProfessorController {

    private final ProfessorService service;
    private final AlunoService alunoService;

    private final DisciplinaService disciplinaService;

    @GetMapping
    public ResponseEntity<List<ProfessorResponse>> listProfessors() {

        final List<ProfessorResponse> professorDtoList = service.retrieveAll();

        return ResponseEntity.ok(professorDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorResponse> getProfessor(@PathVariable("id") int id) {

        final ProfessorResponse professorDto = service.getById(id);

        return ResponseEntity.ok(professorDto);
    }

    @PostMapping
    public ResponseEntity<ProfessorResponse> saveProfessor(@RequestBody @Valid final ProfessorRequest professor) {

        var response = service.save(professor);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);

    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfessorResponse> updateProfessor(@PathVariable("id") int id, @RequestBody @Valid ProfessorRequest professor) {

        var response = service.update(id, professor);

        return ResponseEntity
                .ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeProfessor(@PathVariable("id") int id) {

        service.delete(id);

        return ResponseEntity
                .noContent()
                .build();
    }

    @GetMapping("/{id}/tutorados")
    public ResponseEntity<List<AlunoResponse>> getTutorados(@PathVariable("id") int id) {

        final var response = alunoService.getTutoradosByProfessorId(id);

        return ResponseEntity.ok(response);
    }

    @GetMapping("{id}/disciplina")
    public ResponseEntity<DisciplinaResponse> getDisciplinaByProfessor(@PathVariable("id") int id) {

        final var response = disciplinaService.getDisciplinaByProfessor(id);

        return ResponseEntity.ok(response);
    }
}
