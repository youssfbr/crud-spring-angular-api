package com.github.youssfbr.crud.dtos;

import com.github.youssfbr.crud.entities.Course;
import lombok.Getter;

@Getter
public class CourseResponseDTO {

    private final Long id;
    private final String name;
    private final String category;

    public CourseResponseDTO(Course course) {
        id = course.getId();
        name = course.getName();
        category = course.getCategory();
    }
}
