package com.sanju.StudentDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class StudentDetails {
    @Id
    @GeneratedValue
    private Integer detailsId;
    private String studentAddress;
    private int studentAge;
    private String studentClass;
    private int studentId;
}
