package com.sanju.School;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("details")
public interface DetailsClient {
    @GetMapping("details/get-by-student/{id}")
    public ResponseEntity<StudentDetails> getAllStudentDetailsByStudentId(@PathVariable("id") int studentId);
}
