package com.sanju.School;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class School {
    @Id
    private Integer id;
    private String name;
    @Column(unique=true)
    private String address;
}
