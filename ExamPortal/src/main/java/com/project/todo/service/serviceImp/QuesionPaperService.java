package com.project.todo.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.todo.model.QuesionPaper;
import com.project.todo.repositry.QuesionPaperRepo;
@Service
public class QuesionPaperService {
	
	@Autowired
	QuesionPaperRepo repo;
	
	

	public QuesionPaper newQuestion(QuesionPaper paper) {
		// TODO Auto-generated method stub
		
		QuesionPaper save = repo.save(paper);
		
		
		return save;
	}

}
