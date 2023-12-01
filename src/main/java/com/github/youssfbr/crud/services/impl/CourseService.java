package com.github.youssfbr.crud.services.impl;

import com.github.youssfbr.crud.dtos.CourseResponseDTO;
import com.github.youssfbr.crud.repositories.ICourseRepository;
import com.github.youssfbr.crud.services.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements ICourseService {

    private final ICourseRepository courseRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CourseResponseDTO> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(CourseResponseDTO::new)
                .toList();
    }
}
