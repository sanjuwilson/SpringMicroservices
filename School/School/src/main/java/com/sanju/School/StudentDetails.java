package com.sanju.School;

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
