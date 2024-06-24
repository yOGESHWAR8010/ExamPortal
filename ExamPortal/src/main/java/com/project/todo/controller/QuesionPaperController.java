package com.project.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.todo.model.QuesionPaper;
import com.project.todo.service.serviceImp.QuesionPaperService;

@RestController
@RequestMapping("api/Quesion")
public class QuesionPaperController {
	
	@Autowired
	private QuesionPaperService quesion;
	
	@PostMapping
	public QuesionPaper newQuestion(@RequestBody QuesionPaper paper) {
		
		
		QuesionPaper que =	quesion.newQuestion(paper);
		return null;
		
		
		
	}

}
