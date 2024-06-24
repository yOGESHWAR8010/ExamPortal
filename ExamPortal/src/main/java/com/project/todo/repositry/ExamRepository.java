package com.project.todo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todo.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
