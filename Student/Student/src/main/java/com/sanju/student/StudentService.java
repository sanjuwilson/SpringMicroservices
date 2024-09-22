package com.sanju.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class StudentService {

    private final StudentRepo repo;
    private final StudentDetailsClient detailsClient;

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
    public StudentResponseDto getDetailsWithStudent(int studentId) {
        Student student = repo.findById(studentId).orElse(Student.builder().build());
        StudentDetails details=detailsClient.getAllStudentDetailsByStudentId(studentId).getBody();
        return new StudentResponseDto(student.getFirstName(),student.getLastName(), student.getEmail(),details);
    }
}
