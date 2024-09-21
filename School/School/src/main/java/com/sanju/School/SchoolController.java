package com.sanju.School;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;


    @PostMapping("school/save")
    public School save(@RequestBody School school) {
       return schoolService.saveSchool(school);
    }
    @GetMapping("school/get")
    public ResponseEntity<List<School>> getAll(){
        return ResponseEntity.ok(schoolService.getSchool());
    }
    @GetMapping("school/getById/{Id}")
    public ResponseEntity<List<School>> getById(@PathVariable("Id") int id){
        return ResponseEntity.ok(schoolService.getSchoolById(id));
    }
    @GetMapping("school/stds-with-school/{school-id}")
    public ResponseEntity<SchoolResponseDto> findAllSchools(@PathVariable("school-id") int id){
        return ResponseEntity.ok(schoolService.findSchoolWithStudents(id));
    }
    @GetMapping("school/get-all")
    public ResponseEntity<List<SchoolResponseDto>> findSchoolWithoutId(){
        return ResponseEntity.ok(schoolService.findSchoolWithoutId());
    }



}
