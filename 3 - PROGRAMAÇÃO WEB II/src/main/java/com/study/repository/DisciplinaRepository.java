package com.study.repository;

import com.study.model.Disciplina;
import com.study.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {


    List<Disciplina> findDisciplinaByProfessor(final Professor professor);
}
