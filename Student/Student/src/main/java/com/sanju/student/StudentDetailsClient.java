package com.sanju.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="details")
public interface StudentDetailsClient {
    @GetMapping("details/get-by-student/{id}")
    public ResponseEntity<StudentDetails> getAllStudentDetailsByStudentId(@PathVariable("id") int studentId);

}
