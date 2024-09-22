package com.sanju.StudentDetails;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentDetailsController {
    private final StudentService studentService;
    @PostMapping("details/save")
    public StudentDetails addStudentDetails(@RequestBody StudentDetails studentDetails) {
        return studentService.save(studentDetails);
    }
    @GetMapping("details/getall")
    public ResponseEntity<List<StudentDetails>> getAllStudentDetails() {
        return ResponseEntity.ok(studentService.findAll());
    }
    @GetMapping("details/get-by-id/{id}")
    public ResponseEntity<List<StudentDetails>> getAllStudentDetailsById(@PathVariable("id") int Id) {
        return ResponseEntity.ok(studentService.findById(Id));
    }
    @GetMapping("details/get-by-student/{id}")
    public ResponseEntity<StudentDetails> getAllStudentDetailsByStudentId(@PathVariable("id") int studentId) {
        return ResponseEntity.ok(studentService.findByStudentId(studentId));
    }
}
