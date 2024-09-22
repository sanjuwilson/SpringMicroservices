package com.sanju.student;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class StudentDetails {
        private String studentAddress;
        private int studentAge;
        private String studentClass;
}
