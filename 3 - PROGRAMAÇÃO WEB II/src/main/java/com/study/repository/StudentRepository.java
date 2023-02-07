package com.study.repository;

import com.study.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findStudentByTeacherId(final Teacher tutor);
}
