package com.sanju.student;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("student/save")
    public Student save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("student/get")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.getStudent());
    }
    @GetMapping("Student/bid/{Id}")
    public ResponseEntity<List<Student>> findById(@PathVariable("Id") Integer id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }
    @GetMapping("student/bys-id/{school-id}")
    public ResponseEntity<List<Student>> findBySchoolId(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(studentService.findBySchoolId(schoolId));
    }

}
