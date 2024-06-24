package com.project.todo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todo.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
