package com.study.view.rs;

import com.study.dto.StudentResponseDTO;
import com.study.dto.SubjectResponseDTO;
import com.study.dto.TeacherRequestDTO;
import com.study.dto.TeacherResponseDTO;
import com.study.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v5/professores")
@Slf4j
public class TeacherController {
    private final TeacherService service;
    private final StudentService studentService;
    private final SubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<TeacherResponseDTO>> listTeacher() {
        final List<TeacherResponseDTO> response = service.retrieveAll();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherResponseDTO> getTeacher(@PathVariable("id") int id) {
        final TeacherResponseDTO response = service.getById(id);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TeacherResponseDTO> saveTeacher(@RequestBody @Valid final TeacherRequestDTO teacher) {
        var response = service.save(teacher);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeacherResponseDTO> updateTeacher(@PathVariable("id") int id, @RequestBody @Valid TeacherRequestDTO teacher) {
        var response = service.update(id, teacher);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeTeacher(@PathVariable("id") int id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<List<StudentResponseDTO>> getStudentByTeacherId(@PathVariable("id") int id) {
        final var response = studentService.getStudentByTeacherId(id);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}/disciplina")
    public ResponseEntity<List<SubjectResponseDTO>> getSubjectByTitular(@PathVariable("id") int id) {
        final var response = subjectService.getSubjectByTitular(id);

        return ResponseEntity.ok(response);
    }
}
