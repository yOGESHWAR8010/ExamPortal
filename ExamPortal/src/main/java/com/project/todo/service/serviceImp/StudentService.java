package com.project.todo.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.todo.model.Student;
import com.project.todo.repositry.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) throws Exception {
        String courseName = student.getCourse();
        boolean courseExists = checkCourseExists(courseName);
        if (courseExists) {
            return studentRepository.save(student);
        } else {
            throw new Exception("Course not available");
        }
    }

    public Student updateStudent(Long id, Student studentDetails) throws Exception {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            String courseName = studentDetails.getCourse();
            boolean courseExists = checkCourseExists(courseName);
            if (courseExists) {
                Student updatedStudent = student.get();
                updatedStudent.setName(studentDetails.getName());
                updatedStudent.setEmail(studentDetails.getEmail());
                updatedStudent.setCourse(studentDetails.getCourse());
                return studentRepository.save(updatedStudent);
            } else {
                throw new Exception("Course not available");
            }
        } else {
            return null;
        }
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    private boolean checkCourseExists(String courseName) {
        String sql = "SELECT COUNT(*) FROM course WHERE name = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, courseName);
        return count > 0;
    }
}
