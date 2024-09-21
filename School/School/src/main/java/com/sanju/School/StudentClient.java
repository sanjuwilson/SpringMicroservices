package com.sanju.School;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="students",url="${application.config.students-url}")
public interface StudentClient {
    @GetMapping("student/bys-id/{school-id}")
    public List<Student> findBySchoolId(@PathVariable("school-id") Integer schoolId);

}
