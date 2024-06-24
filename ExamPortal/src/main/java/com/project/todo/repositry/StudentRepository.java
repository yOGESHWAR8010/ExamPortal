package com.project.todo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
