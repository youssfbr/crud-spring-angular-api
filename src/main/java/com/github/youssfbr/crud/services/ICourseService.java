package com.github.youssfbr.crud.services;

import com.github.youssfbr.crud.dtos.CourseResponseDTO;

import java.util.List;

public interface ICourseService {
    List<CourseResponseDTO> getAllCourses();
}
