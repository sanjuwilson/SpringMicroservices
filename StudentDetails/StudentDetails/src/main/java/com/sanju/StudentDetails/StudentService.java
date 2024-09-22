package com.sanju.StudentDetails;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class StudentService {
    private final StudentDetailsRepo repo;

    public StudentDetails save(StudentDetails studentDetails) {

        return repo.save(studentDetails);
    }
    public List<StudentDetails> findAll() {

        return repo.findAll();
    }
    public List<StudentDetails> findById(int id) {

        return repo.findAllByDetailsId(id);
    }
    public StudentDetails findByStudentId(int id) {
        return repo.findStudentDetailsByStudentId(id);
    }
}
