package com.study.service;

import com.study.dto.v3.DisciplinaResponse;
import com.study.mapper.DisciplinaMapper;
import com.study.model.Disciplina;
import com.study.repository.DisciplinaRepository;
import com.study.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DisciplinaService {

    private final ProfessorRepository professorRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final DisciplinaMapper disciplinaMapper;

    public DisciplinaResponse getById(int id) {
        log.info("Getting disciplina id-{}", id);
        var disciplinaById = disciplinaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Disciplina not found"));
        return disciplinaMapper.toResponse(disciplinaById);
    }

    public List<DisciplinaResponse> getDisciplinaByProfessor(int idProfessor) {
        log.info("Getting professor by professor-id: {}", idProfessor);

        var professorOptional = professorRepository.findById(idProfessor).orElseThrow(() -> new EntityNotFoundException("Professor not found"));
        List<Disciplina> disciplinaByProf = disciplinaRepository.findDisciplinaByProfessor(professorOptional);

        return disciplinaMapper.toResponse(disciplinaByProf);
    }

    @Transactional
    public DisciplinaResponse updateProfessor(int idDisciplina, int idProfessor) {
        log.info("Updating professor idDisciplina: {}, idProfessor: {}", idDisciplina, idProfessor);

        var disciplinaEntity = disciplinaRepository.findById(idDisciplina).orElseThrow(() -> new EntityNotFoundException("Disciplina not found"));
        var professorEntity = professorRepository.findById(idDisciplina).orElseThrow(() -> new EntityNotFoundException("Professor not found"));

        disciplinaEntity.setTitular(professorEntity);
        disciplinaRepository.save(disciplinaEntity);

        return disciplinaMapper.toResponse(disciplinaEntity);
    }
}
