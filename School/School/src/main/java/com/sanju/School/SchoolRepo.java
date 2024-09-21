package com.sanju.School;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepo extends JpaRepository<School, Integer> {
    List<School> findAllById(int id);
}
