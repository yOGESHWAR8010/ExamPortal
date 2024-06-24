package com.project.todo.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.todo.model.Result;
import com.project.todo.repositry.ResultRepository;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Result getResultById(Long id) {
        return resultRepository.findById(id).orElse(null);
    }

    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

    public Result updateResult(Long id, Result resultDetails) {
        Result result = resultRepository.findById(id).orElse(null);
        if (result != null) {
            result.setStudentId(resultDetails.getStudentId());
            result.setExamId(resultDetails.getExamId());
            result.setMarks(resultDetails.getMarks());
            return resultRepository.save(result);
        }
        return null;
    }

    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }
}
