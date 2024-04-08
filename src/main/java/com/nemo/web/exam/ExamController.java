package com.nemo.web.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nemo.web.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamRepository examRepository;

    public ExamController(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }
    @GetMapping
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exam> getExamById(@PathVariable Long id) {
        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + id));

        return ResponseEntity.ok(exam);
    }

    @PostMapping
    public ResponseEntity<Exam> createExam(@RequestBody Exam exam) {
        Exam createdExam = examRepository.save(exam);
        return ResponseEntity.ok(createdExam);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exam> updateExam(@PathVariable Long id, @RequestBody Exam updatedExam) {
        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + id));

        exam.setName(updatedExam.getName());
        exam.setDescription(updatedExam.getDescription());
        exam.setTestType(updatedExam.getTestType());
        exam.setQuestions(updatedExam.getQuestions());

        Exam updatedExamEntity = examRepository.save(exam);
        return ResponseEntity.ok(updatedExamEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExam(@PathVariable Long id) {
        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + id));

        examRepository.delete(exam);
        return ResponseEntity.noContent().build();
    }
}
