package com.joseliza.paginacion.repository;

import com.joseliza.paginacion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
