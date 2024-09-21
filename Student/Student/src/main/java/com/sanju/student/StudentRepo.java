package com.sanju.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student, Integer>{
    List<Student> findAllById(Integer id);
    List<Student> findAllStudentsBySchoolId(Integer schoolId);
}
