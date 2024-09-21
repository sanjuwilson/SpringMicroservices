package com.sanju.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class StudentService {

    private final StudentRepo repo;

    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getStudent() {
       return  repo.findAll();
    }
    public List<Student> getStudentById(int id) {
        return repo.findAllById(id);
    }

    public List<Student> findBySchoolId(Integer schoolId) {
        return repo.findAllStudentsBySchoolId(schoolId);
    }
}
