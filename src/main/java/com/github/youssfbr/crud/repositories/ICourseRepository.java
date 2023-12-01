package com.github.youssfbr.crud.repositories;

import com.github.youssfbr.crud.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, Long> {
}
