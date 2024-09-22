package com.sanju.School;



import java.util.List;

public record SchoolResponseDto(String name, String address, List<Student> students) {
}
