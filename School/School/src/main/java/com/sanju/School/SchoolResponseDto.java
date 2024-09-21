package com.sanju.School;

import lombok.Builder;

import java.util.List;
@Builder
public record SchoolResponseDto(String name, String address, List<Student> list) {
}
