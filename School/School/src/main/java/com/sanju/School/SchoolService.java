package com.sanju.School;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
@Data
public class SchoolService {
    private SchoolRepo repo;
    private StudentClient client;
    private DetailsClient detailsClient;

    public School saveSchool(School school) {
        return repo.save(school);
    }

    public List<School> getSchoolById(int id) {
        return null;
    }

    public List<School> getSchool(){
        return repo.findAll();
    }

    public SchoolResponseDto findSchoolWithStudents(int id) {
        School school = repo.findById(id).orElse(School.builder()
                .name("N/A").address("N/A").build()
        );
        List<Student> stu=client.findBySchoolId(id);
        return new SchoolResponseDto(school.getName(),school.getAddress(),stu);
    }

    public List<SchoolResponseDto> findSchoolWithoutId() {
        List<SchoolResponseDto> res = new ArrayList<>();
        List<StudentDetails> details= new ArrayList<>();
        SchoolResponseDto dto=null;
        List<School>schools=repo.findAll();
        for(School school:schools){
            int id=school.getId();
            List<Student> stu=client.findBySchoolId(id);
            for(Student student:stu) {
                StudentDetails det = detailsClient.getAllStudentDetailsByStudentId(student.getId()).getBody();
                student.setStudentDetails(det);
            }
            dto=new SchoolResponseDto(school.getName(),school.getAddress(),stu);
            res.add(dto);
        }
        return res;
    }
}
