package com.project.todo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todo.model.QuesionPaper;

public interface QuesionPaperRepo extends JpaRepository<QuesionPaper, Integer> {

}
