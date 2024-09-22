package com.sanju.StudentDetails;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer> {
    List<StudentDetails> findAllByDetailsId(Integer id);
    StudentDetails findStudentDetailsByStudentId(Integer id);
}
