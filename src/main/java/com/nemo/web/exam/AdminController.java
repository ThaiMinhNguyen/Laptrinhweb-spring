package com.nemo.web.exam;

import com.nemo.web.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private final ExamRepository examRepository;

    
    public AdminController(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @PostMapping("/exams")
    public ResponseEntity<Exam> createExam(@RequestBody Exam exam) {
        Exam createdExam = examRepository.save(exam);
        return ResponseEntity.ok(createdExam);
    }

    @PutMapping("/exams/{id}")
    public ResponseEntity<Exam> updateExam(@PathVariable Long id, @RequestBody Exam updatedExam) {
        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + id));

        exam.setName(updatedExam.getName());
        exam.setDescription(updatedExam.getDescription());
        exam.setTestType(updatedExam.getTestType());

        Exam updatedExamEntity = examRepository.save(exam);
        return ResponseEntity.ok(updatedExamEntity);
    }

    @DeleteMapping("/exams/{id}")
    public ResponseEntity<Void> deleteExam(@PathVariable Long id) {
        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + id));

        examRepository.delete(exam);
        return ResponseEntity.noContent().build();
    }
}
